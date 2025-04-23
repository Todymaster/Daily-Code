package StudentRecordsManager_Liang;

import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 */
public class StudentRecordsManager {

    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();

        try {
            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            System.err.println("Error: Unexpected error occurred - " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     *
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            List<Student> students = readStudentRecords(inputFile);
            writeResultsToFile(students, outputFile);
            System.out.println("Processing student records was successful!");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage() + ". Please check the file path or name.");
        } catch (IOException e) {
            System.err.println("Error: I/O error occurred - " + e.getMessage() + ". Possible causes: permission issues or disk full.");
        }
    }

    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     *
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                try {
                    String[] parts = line.split(",");

                    if (parts.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("Line " + lineNumber + ": Too few fields.");
                    }

                    String studentId = parts[0].trim();
                    String name = parts[1].trim();

                    int[] grades = new int[4];
                    for (int i = 0; i < 4; i++) {
                        grades[i] = Integer.parseInt(parts[i + 2].trim());
                        if (grades[i] < 0 || grades[i] > 100) {
                            throw new InvalidGradeException("Line " + lineNumber + ": Grade " + grades[i] + " is out of range (0-100).");
                        }
                    }

                    students.add(new Student(studentId, name, grades));

                } catch (NumberFormatException e) {
                    System.err.println("Line " + lineNumber + ": Invalid number format - " + e.getMessage());
                } catch (InvalidGradeException e) {
                    System.err.println(e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }
        }

        return students;
    }

    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     *
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            // Write header section
            writer.println("Student Records");
            writer.println("==================================");
            writer.println("ID, Name, Grades, Average, Letter Grade");

            // Initialize statistics variables
            int totalStudents = students.size();
            double sumGrades = 0.0;
            int[] gradeDistribution = new int[5]; // A, B, C, D, F

            // Process students
            for (Student student : students) {
                // Accumulate statistics
                sumGrades += student.getAverageGrade();
                char letterGrade = student.getLetterGrade();
                switch (letterGrade) {
                    case 'A': gradeDistribution[0]++; break;
                    case 'B': gradeDistribution[1]++; break;
                    case 'C': gradeDistribution[2]++; break;
                    case 'D': gradeDistribution[3]++; break;
                    case 'F': gradeDistribution[4]++; break;
                }

                // Format grades array
                StringBuilder gradesStr = new StringBuilder();
                int[] grades = student.getGrades();
                for (int i = 0; i < grades.length; i++) {
                    gradesStr.append(grades[i]);
                    if (i < grades.length - 1) {
                        gradesStr.append(", ");
                    }
                }

                // Write student information
                writer.printf("%s, %s, %s, %.2f, %c%n",
                        student.getStudentId(),
                        student.getName(),
                        gradesStr,
                        student.getAverageGrade(),
                        letterGrade);
            }

            // Calculate and write statistics
            double classAverage = totalStudents > 0 ? sumGrades / totalStudents : 0.0;
            writer.println("==================================");
            writer.printf("Total Students: %d%n", totalStudents);
            writer.printf("Class Average: %.2f%n", classAverage);
            writer.printf("Grade Distribution: A: %d, B: %d, C: %d, D: %d, F: %d%n",
                    gradeDistribution[0], gradeDistribution[1], gradeDistribution[2],
                    gradeDistribution[3], gradeDistribution[4]);
        }
    }
}
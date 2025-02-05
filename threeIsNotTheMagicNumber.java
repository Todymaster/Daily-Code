public class threeIsNotTheMagicNumber{
    public static void main(String args[]){
    
      //Prints out numbers from 1 to 20 unless its a multiple of 3
      for (int i = 0; i <= 20; i++){
          if (i % 3 != 0){
            System.out.println(i);
          }
      }
    }
}

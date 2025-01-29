function sum_of_digits() {
    //Prompts the user for a number
    let num = prompt("What is the number?: ")
    let sum = 0
    
    //Goes through the number and adds them together
    for (let i = 0; i < num.length; i++){
        sum += parseInt(num[i])
    }
    
    //Prints the sum
    console.log(sum)
}

//Runs the function
sum_of_digits()

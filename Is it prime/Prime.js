function isPrime(num) {
    if (num <= 1) return false; // 0 and 1 are not prime numbers
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false; // Found a divisor, not prime
    }
    return true; // No divisors found, it's prime
}

function checkPrime() {
    const userInput = document.getElementById('numberInput').value;
    const number = parseInt(userInput, 10);

    if (isNaN(number)) {
        alert("Please enter a valid number.");
        return;
    }

    const result = isPrime(number);
    if (result) {
        alert(number + " is a prime number.");
    } else {
        alert(number + " is not a prime number.");
    }
}

// Add event listener to the button
document.getElementById('checkButton').addEventListener('click', checkPrime);
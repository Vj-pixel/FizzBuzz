// The FizzBuzz program in JavaScript

for (let i = 0; i < 101; i++) {
    console.log(i);
    if (i % 3 == 0) {
        console.log("Fizz!")
    } else if (i % 5 === 0) {
        console.log("Buzz")
    } else if (i % 15 === 0) {
        console.log("FizzBuzz!")
    } else {
        console.log("This number doesn\'t meet the requirements of the game.")
    }
}


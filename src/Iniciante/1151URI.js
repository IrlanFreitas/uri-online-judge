const value = 10;

const fibonacci = (value) => {
    if(value <= 3) return 1
    return fibonacci(value - 1) + fibonacci(value - 2);
}

// console.log(fibonacci(value));

console.log("Hello World");
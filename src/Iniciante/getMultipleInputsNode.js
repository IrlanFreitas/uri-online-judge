// var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// var lines = input.split('\n');

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', (line) => {
    const value = Number(line)
    if (value === 0) rl.close();


    input.push(line)
});


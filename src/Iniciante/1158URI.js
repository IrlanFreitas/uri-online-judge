var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const somaImparesConsecutivos = (start, times) => {

    let i = 0;
    let total = 0;
    let aux = start;

    while(i < times) {
        if(aux % 2 !== 0) {
            total += aux;
            i++;
        }
        aux++;
    }
    console.log(total);
}

const numberOfRepetitions = Number(lines.shift());

for (let index = 0; index < numberOfRepetitions; index++) {
    const values = lines.shift().split(" ");
    somaImparesConsecutivos(Number(values[0]), Number(values[1]));   
}

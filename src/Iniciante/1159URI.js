var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const values = [];
let linha = 0;

do {
    linha = Number(lines.shift());
    if(linha !== 0) {
        values.push(linha);
    }

} while (linha !== 0);

values.map(value => {

    let i = 0;
    let total = 0;
    let aux = value;

    while (i < 5) {
        if (aux % 2 === 0) {
            total += Number(aux);
            i++;
        }
        aux++;

    }
    console.log(total);
})
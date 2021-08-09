// Funções [ENCONTRO]
/* 1) Criar a função calcularIndiceDeMassaCorporal que receba a 
altura em centímetros e o peso em quilogramas e calcule o IMC 
do usuário (peso / altura2). Em seguida, execute a função 
testando diferentes valores.
 */
function calcularIndiceDeMassaCorporal(altura, peso) 
{
    return peso / (altura * altura);
}

let peso_caio = 75;
let altura_caio = 1.83;

let peso_icaro = 75;
let altura_icaro = 1.80;

let peso_diego = 80;
let altura_diego = 1.79;

console.log(Math.floor(calcularIndiceDeMassaCorporal(altura_caio, peso_caio)));
console.log(Math.floor(calcularIndiceDeMassaCorporal(altura_icaro, peso_icaro)));
console.log(Math.floor(calcularIndiceDeMassaCorporal(altura_diego, peso_diego)));



const calculos = require('./modulos_export/calculos');
let numero1 = 10;
let numero2 = 2;

console.log("A soma dos números: " + numero1 + " " + numero2 + "\né: " + calculos.somar(numero1,numero2))
console.log("A subtração dos números: " + numero1 + " " + numero2 + "\né: " + calculos.subtrair(numero1,numero2))
console.log("A divisão dos números: " + numero1 + " " + numero2 + "\né: " + calculos.dividir(numero1,numero2))
console.log("A multiplicação dos números: " + numero1 + " " + numero2 + "\né: " + calculos.multiplicar(numero1,numero2))


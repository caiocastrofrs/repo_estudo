let nome = "caio"
var idade = 22
var peso = 75
var altura = 1.83
var plano = false
var imc = 0

function calculo_imc (peso, altura)
{
    var imc;
    imc = Math.round(peso / (altura * altura))
    return imc;
}

console.log(`IMC do ${nome} é de ${calculo_imc(peso,altura)}`)


module.exports = calculo_imc, altura

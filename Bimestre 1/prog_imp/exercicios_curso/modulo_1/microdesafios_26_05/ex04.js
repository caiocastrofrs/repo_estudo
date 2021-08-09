// MICRO-DESAFIOS - BASE DA PROGRAMAÇÃO [ENCONTRO]
/* Você deverá criar 6 variáveis:Nome, Idade, Peso, Altura
Plano (só nos interessa saber se TEM ou NÃO TEM)
Índice de Massa Corporal (IMC)
O programa deverá apresentar em tela o valor do IMC de um paciente da tabela com uma mensagem.
 Por exemplo: “Aline Ferreira tem 33 anos e seu índice de massa corporal é de xx”. */

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

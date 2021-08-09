// Aula 03 - 31/05/2021
// Revisão de variáveis

var nome = "Caio";
var idade  = 22;
var peso = 75;
var temFaculdade = false;
var ehFeio = false;

console.log(typeof nome);
console.log(typeof idade);
console.log(typeof peso);
console.log(typeof temFaculdade);
console.log(typeof ehFeio);

function alteraIdade(idade)
{
    idade++;
    console.log(idade);
}

alteraIdade(idade);


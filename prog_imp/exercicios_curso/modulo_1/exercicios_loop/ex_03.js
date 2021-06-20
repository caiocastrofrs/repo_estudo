//Crie outro array, percorra-o, altere, salve e exiba seus elementos:

let numeros = [10,8,3,2,6,2,3,6,7]
console.log(numeros)

function alterarArray (array)
{
    numeros = array.map(function (numero){ return numero * 5;})
}

function exibirArray (array)
{
    console.log(numeros)
}
alterarArray(numeros)
exibirArray(numeros)

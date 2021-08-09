//Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.
let arrayPares = [2,4,6,8,10]
let arrayImpares = arrayPares.map((el) => 
{
    return el-1
})

console.log("array pares: " + arrayPares)
console.log("array impares: " + arrayImpares)


//Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.
let arrayNomes = ['caio','icaro','adso','diego','maria','sol','maria']
console.log(arrayNomes.filter((el) =>
{
    if (el == 'maria')
    {
        return el
    }
}))


//Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”
let arrayNumeros = [1,2,3,4,5]
let stringNumeros = arrayNumeros.reduce((ac,el)=>
{
    return ac+"-"+el
})
console.log(stringNumeros)

//Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.
let arrayAnimais = ['gato','cachorro','papagaio','quokka','avestruz','canguru']
arrayAnimais.forEach((el) =>
{
    console.log('O animal é ' + el)
})




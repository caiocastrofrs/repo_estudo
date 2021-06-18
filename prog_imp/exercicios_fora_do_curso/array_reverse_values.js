//EXERCICIO COM O OBJETIVO DE CRIAR UM MÉTODO QUE INVERTA OS VALORES DE UM ARRAY
let arrayGiven = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

const myArrayReverse = array => 
{
    let arrayReverso = []
    for ( let i = array.length-1 ; i >= 0 ; i--)
    {
        arrayReverso.push(array[i])
    }
    return arrayReverso
}

console.log(myArrayReverse(arrayGiven))
//EXERCICIO COM O OBJETIVO DE CRIAR UM MÉTODO QUE INVERTA OS VALORES DE UM ARRAY
/** 
  * Task description: Write a method that reverts input array 
  * Expected Result: [1, 2, 3] => [3, 2, 1] 
  * Task Complexity: 1 of 5 
  * @param {Array} array - Array of any elements 
  * @returns {Array} 
*/


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
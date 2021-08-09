//EXERCICIO COM O OBJETIVO DE CRIAR UM MÉTODO QUE POPULE UM ARRAY COM O VALOR DADO MAIS O TAMANHO DO ARRAY
/** 
  * Task description: Write a method that creates a new array with given values 
  * Expected Result: (3, 'a') => ['a', 'a', 'a'] 
  * Task Complexity: 1 of 5 
  * @param {number} arraySize - size of array 
  * @param {?} value - value to fill 
  * @returns {Array} 
*/


const fill_array = (arrayLength, valor) => 
{
    let arrayFilled = []
    for ( let i = 0 ; i < arrayLength ; i++ )
    {
        arrayFilled.push(valor)
    }
    return arrayFilled
}

console.log(fill_array(10,"b"))

//ALTERNATIVA MAIS SIMPLES ->

const fill = (arraySize, value) => new Array(arraySize).fill(value);
console.log(fill(10,"b"))
//ESCREVA UM MÉTODO QUE RETORNE UM OBJETO COMPOSTO DE PARES DE VALORES CHAVES
/** 
  * Task description: Write a method that returns an object composed of key-value pairs. 
  * Expected Result: [['a', 1], ['b', 2]] => { a: 1, b: 2 } 
  * Task Complexity: 2 of 5 
  * @param {Array} array - a deep array of pairs 
  * @returns {Array} 
*/
const data = [['a', 1], ['b', 2], ['c', 3]]

const retorna_pares  = array =>
{
    let retorno = array.map(el => `${el[0]} : ${el[1]}`)
    return retorno
}

console.log(retorna_pares(data)) 

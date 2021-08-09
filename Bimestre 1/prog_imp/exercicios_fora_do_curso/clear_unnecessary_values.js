//OBJETIVO DO EXERCICIO É CRIAR UM MÉTODO QUE REMOVA ELEMENTOS DO TIPO UNDEFINED NULL STRING VAZIA FALSO OU ZEROS
/** 
  * Task description: Write a method that clears array from all unnecessary elements, like false, undefined, empty strings, zero, null 
  * Expected Result: [0, 1, false, 2, undefined, '', 3, null] => [1, 2, 3] 
  * Task Complexity: 1 of 5 
  * @param {Array} array - An array of any elements 
  * @returns {Array} 
*/


let arrayValores = [1,undefined,null,12,"caio","","bubbles",0, true, false]

const limparArray = array =>
{
    let array_limpo = array.map((el) =>
    {
        if (el == undefined || el == null || el == "" || el == false || el == 0)
        {
        }
        else
        {
            return el
        }
    })

    return array_limpo
}
/* console.log(cleanArray(arrayValores)) */

//SOLUÇÃO DO SITE

const compact = (array) => 
{
    array.filter((el) => el);
}

console.log(compact(arrayValores))
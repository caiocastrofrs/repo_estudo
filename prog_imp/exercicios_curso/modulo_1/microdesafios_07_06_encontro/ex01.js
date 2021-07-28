/* Acesse elementos específicos de um array.
Percorra um Array  e modifique cada um de seus elementos.
Adicione elementos a um array.
Exclua elementos de um array.
Compare elementos de um array com elementos de outro array. 
 */

let teste_array = [1,2,3,4,5];
let outro_array = [2,3,4,5,6];
for(let i = 0; i < teste_array.length; i++)
{
    teste_array[i]+=1;
};

teste_array.push(6);
teste_array.pop();
if (teste_array[1] == outro_array[2])
{
    console.log("true");
}
else
{
    console.log("false");
}
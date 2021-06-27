let array = []

const coluna = 5
const linha = 5

for (let i = 0; i < coluna; i++)
{
    array.push([i])
    for (let k = 0; k < linha; k++)
    {
        array[i].push(k)
    }

}
/* console.log(array) */

let array22 = [
    {nome : 'caio',idade : 22},
    {nome : 'icaro',idade : 21},
    {nome : 'adso',idade : 33},
    {nome : 'diego',idade: 31}
]
console.log(array22.nome)
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
console.log(array)

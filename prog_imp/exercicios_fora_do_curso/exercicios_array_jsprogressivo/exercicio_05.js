let numeros = [7,14,89,53,82,12,4,7,9,2,12,1]


for (let i = 0; i <= numeros.length-1; i++)
{
    for (let k = 0; k <= numeros.length-1; k++)
    {
        if (numeros[k] > numeros[k+1])
        {
            [numeros[k], numeros[k+1]] = [numeros[k+1], numeros[k]]
        }
    }
}

console.log(numeros)
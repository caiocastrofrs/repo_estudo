let numero = 4
let numeroArray = [4,6,1,23,5,4,12,4,2,1,3,4,4]
indices_numero = []
for ( let i = 0; i < numeroArray.length; i++)
{
    if (numeroArray[i] == numero)
    {
    indices_numero.push(i)
    }
}

console.log("o numero 4 aparece nos indices: " + indices_numero)
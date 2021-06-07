let arrayNumeros = [123,523,2223]

function ordemCrescente (arrayRecebido)
{
    console.log("array puro: " + arrayRecebido)
    if (arrayRecebido[0] > arrayRecebido[1] && arrayRecebido[0] > arrayRecebido[2])
    {
        console.log(arrayRecebido[0] + " " + arrayRecebido[2])
        [arrayRecebido[0], arrayRecebido[2]] = [arrayRecebido[2], arrayRecebido[0]]
        console.log(arrayRecebido[0] + " " + arrayRecebido[2])
        if (arrayRecebido[0] > arrayRecebido[1])
        {
            var guarda_numero = arrayRecebido
        }
        
    }
}
console.log(arrayNumeros)
[arrayNumeros[0], arrayNumeros[1]] = [arrayNumeros[1], arrayNumeros[0]];
console.log(arrayNumeros)
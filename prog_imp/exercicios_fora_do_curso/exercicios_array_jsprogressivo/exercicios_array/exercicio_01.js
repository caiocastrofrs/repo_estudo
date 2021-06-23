let arrayNumeros = [20,19];
function ordemCrescente (arrayRecebido)
{
    console.log("Retornando array puro: " + arrayRecebido)
    if (arrayRecebido[0] > arrayRecebido[1])
    {
        var guarda_numero = arrayRecebido[1]
        arrayRecebido[1] = arrayRecebido[0]
        arrayRecebido[0] = guarda_numero
    }

    console.log("Retornando array ordenado na ordem crescente: " + arrayRecebido)
}
ordemCrescente(arrayNumeros)
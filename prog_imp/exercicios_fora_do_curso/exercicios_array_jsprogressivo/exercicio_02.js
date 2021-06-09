let arrayNumeros = [2,1,3]

function ordem_indice_um_dois (array)
{
    if (array[0] > array[1])
        {
            [array[0], array[1]] = [array[1],array[0]]
        }
}
function ordemCrescente (arrayRecebido) {
    if (arrayRecebido[0] > arrayRecebido[1] && arrayRecebido[0] > arrayRecebido[2])
    {

        [arrayRecebido[0], arrayRecebido[2]] = [arrayRecebido[2], arrayRecebido[0]]
        ordem_indice_um_dois(arrayRecebido)
    }
    else if (arrayRecebido[1] > arrayRecebido[0] && arrayRecebido[1] > arrayRecebido[2])
    {
        [arrayRecebido[1], arrayRecebido[2]] = [arrayRecebido[2], arrayRecebido[1]]
        ordem_indice_um_dois(arrayRecebido)
    }
    else if (arrayRecebido[2] > arrayRecebido[0] && arrayRecebido[2] > arrayRecebido[1])
    {
        ordem_indice_um_dois(arrayRecebido)
    }
}

ordemCrescente(arrayNumeros)
console.log(arrayNumeros)
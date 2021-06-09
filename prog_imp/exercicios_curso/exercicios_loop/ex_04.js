//Crie um último array, percorra-o, selecione os elementos, salve e mostre-os
let array_letra_a = ['Criticar', 'Funicular', 'Roer', 'Gaiolas', 'Barco', 'Ingredientes','Paralama','','Descalço','Manchar','Pegar'] 

let palavras_selecionadas = []

array_filtro = array_letra_a.map(function (elemento)
{ 
    var quantidade_a = 0;
    elemento.toLowerCase()
    for (let k = 0; k < elemento.length; k++)
    {
        if (elemento.slice(k,k+1) == 'a')
        {
            quantidade_a++;
        }

    }
    if (quantidade_a > 2)
    {
        palavras_selecionadas.push(elemento)
    }
}
)
console.log("Palavras que tem mais de 2 As: " + palavras_selecionadas)
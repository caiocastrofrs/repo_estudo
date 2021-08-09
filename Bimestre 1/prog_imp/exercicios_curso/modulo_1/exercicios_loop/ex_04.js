//Crie um último array, percorra-o, selecione os array_letra_as, salve e mostre-os
//CRIAR BIBLIOTECA DE PALAVRAS E GUARDAR EM OUTRO ARRAY APENAS AS PALAVRAS QUE TEM MAIS DE 2 'A' 
//OUTPUT: PARALAMA
let array_letra_a = ['Criticar', 'Funicular', 'Roer', 'Gaiolas', 'Barco', 'Ingredientes','Paralama','','Descalço','Manchar','Pegar'] 

let palavras_selecionadas = []

for ( let i = 0; i < array_letra_a.length; i++)
{ 
    var quantidade_a = 0;
    array_letra_a[i].toLowerCase()
    for (let k = 0; k < array_letra_a[i].length; k++)
    {
        if (array_letra_a[i].slice(k,k+1) == 'a')
        {
            quantidade_a++;
        }

    }
    if (quantidade_a > 2)
    {
        palavras_selecionadas.push(array_letra_a[i])
    }
}
console.log("Palavras que tem mais de 2 As: " + palavras_selecionadas)
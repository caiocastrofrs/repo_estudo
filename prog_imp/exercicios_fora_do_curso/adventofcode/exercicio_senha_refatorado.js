const senhas = require('./senhas')

const letra = senhas.map(function (el) 
{
    let index = el.search(":")-1
    return el.charAt(index)
})

const senha = senhas.map(function (el)
{
    primeiro_caractere = el.search(":") + 2
    senha_inteira = el.slice(primeiro_caractere, el.length)
    return senha_inteira
})

const minimo = senhas.map(function (el)
{
    if (el.charAt(1) >= '0' && el.charAt(1) <= '9')
    {
        return el.slice(0,2);
    }
    else
    {
        return el.charAt(0)
    }
})

const maximo = senhas.map(function (el)

{
    if (el.charAt(4) >= '0' && el.charAt(4) <= '9')
    {
        return el.slice(3,5);
    }
    else if(el.charAt(3) >= '0' && el.charAt(3) <= '9')
    {
        return el.slice(2,4);
    }
    else
    {
        return el.charAt(2)
    }
})

const contador_letra = (elemento, letra) => 
{
    let quantidade_letra = 0;
    for ( let k = 0; k < elemento.length; k++)
    {
        if (elemento.slice(k,k+1) == letra)
        {
            quantidade_letra++;
        }
    }
    return quantidade_letra
}



const senha_validacao = (array_senha,array_letra,array_min,array_max) => 
{
    let quantidade_validos = 0;

    for ( let i = 0; i < array_senha.length; i++)
    {
        let quantidade_letra = contador_letra(array_senha[i],array_letra[i])
        if (quantidade_letra >= array_min[i] && quantidade_letra <= array_max[i])
        {
            quantidade_validos++
        }
        
    }
    return quantidade_validos
}

const senha_validacao_2 = (array_senha,array_letra,array_min,array_max) =>
{
    let quantidade_validos = 0;

    for (let i = 0; i < array_senha.length; i++)
    {
       if (array_senha[i].charAt(array_min[i]-1) == array_letra[i] && array_senha[i].charAt(array_max[i]-1) != array_letra[i])
        {
            quantidade_validos++
        }
        else if (array_senha[i].charAt(array_max[i]-1) == array_letra[i] && array_senha[i].charAt(array_min[i]-1) != array_letra[i])
        {
            quantidade_validos++
        }
    }
    return quantidade_validos
}

console.log(senha_validacao(senha,letra,minimo,maximo)) 
console.log(senha_validacao_2(senha,letra,minimo,maximo))
/* FUNÇÃO FATORIAL USANDO FOR 
function fatorial_do (fatorial)
{
    for (let i = fatorial; i > 1; i--)
    {
        fatorial*= i-1
    }
    console.log(fatorial)
} 
fatorial_do(5)

TENTATIVA DE FATORIAL USANDO FUNÇÃO RECURSIVA MAS FALHOU
let fatorial_recursivo = numero => 
{
    let loop = numero
    let fatorial_do = () =>
    {

        loop--
        if (loop > 1)
        {
            numero *= loop
            fatorial_do()
        }
        
    } 
    fatorial_do()
    console.log(numero)
    
}
fatorial_recursivo(4) */

// FUNÇÃO RECURSIVA Q EXECUTA UM FATORIAL
let fatorial_otimizado = numero =>
{
    if (numero == 0)
    {
        return 1
    }
    else {
        
        return numero*fatorial_otimizado(numero-1)
        
    }
    
}
fatorial_otimizado(5)
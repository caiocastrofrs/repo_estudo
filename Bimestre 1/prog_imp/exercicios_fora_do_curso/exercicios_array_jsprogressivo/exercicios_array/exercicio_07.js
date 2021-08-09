//SEQUENCIA DE FIBONACCI

let numero1 = 0
let numero2 = 1
let resultado = 0;
for (let i = 0; i <= 100; i++)
{
    resultado = numero1 + numero2
    numero1 = numero2
    numero2 = resultado
    console.log(resultado)
}
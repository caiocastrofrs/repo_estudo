
//EXERCICIO 1 'REPETINDO COMO UM PAPAGAIO'
for(let i = 0;i <= 4; i++)
{
    console.log("Olá Mundo!")
}

//EXERCICIO 2 'CONTANDO NÚMEROS ÍMPARES'
var impar = [];
var par = [];
for(let i = 0;i <= 10;i++)
{
    if (i % 2 == 0)
    {
        par.push(i);
    }
    else if(i % 2 == 1)
    {
        impar.push(i);
    }
}
console.log("Números pares de 0 a 10: " + par)
console.log("Números impares de 0 a 10: " + impar)

//EXERCICIO 3 'CRIANDO A TABUADA'
for(let i= 0; i<= 10; i++ )
{
    for (let i2 = 0; i2 <= 10; i2++){
        console.log(`${i} vezes ${i2} dá: ${i*i2}`)
    }
}
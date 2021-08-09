/* Faça um script que peça os 3 lados de um triângulo. 
O script deverá informar se os valores podem ser um triângulo. 
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

    Dicas:
    Três lados formam um triângulo quando a soma de quaisquer dos lados for maior que o terceiro;
    Triângulo Equilátero: três lados iguais;
    Triângulo Isósceles: quaisquer dois lados iguais;
    Triângulo Escaleno: três lados diferentes; */
let lado1 = 1;
let lado2 = 1;
let lado3 = 1;

const checarTriangulo = (l1,l2,l3) => 
{
    if (l1 == l2 && l2 == l3)
    {
        console.log('Triângulo Equilátero')
    }
    else if (l1 == l2 || l2 == l3 || l3 == l1)
    {
        console.log('Triângulo Isósceles')
    }
    else if (l1 != l2 && l2 != l3)
    {
        console.log('Triângulo Escaleno')
    }
}

checarTriangulo(lado1,lado2,lado3)

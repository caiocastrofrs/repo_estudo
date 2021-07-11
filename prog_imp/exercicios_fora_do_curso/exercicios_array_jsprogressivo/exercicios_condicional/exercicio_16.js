//16. Faça um script que peça um número inteiro e determine se ele é par ou ímpar.
//Dica: utilize o operador módulo (resto da divisão): %

const numero = 53215412312;

const Par_Impar = numero =>
{
    numero % 2 == 0 ? console.log('par'): console.log('impar');
};

console.log(Par_Impar(numero))
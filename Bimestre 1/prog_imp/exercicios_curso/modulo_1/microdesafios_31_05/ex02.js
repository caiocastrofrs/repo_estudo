// Funções [ENCONTRO]
/* 
2) Criar as 4 “function expression” (dentro de variáveis) básicas de uma calculadora:
Soma;
Subtração;
Multiplicação;
Divisão.
As 4 funções deverão receber dois parâmetros e retornar o resultado da operação matemática correspondente.
 */
var numero1 = 12;
var numero2 = 0;

function calcmat(n1,n2,tipo){
    if (tipo == 'soma')
    {
        console.log(n1 + n2);
    }
    else if(tipo == 'subtracao')
    {
        console.log(n1 - n2);
    }
    else if(tipo == 'multiplicacao')
    {
        console.log(n1 * n2);
    }
    else if(tipo == 'divisao')
    {
        console.log(n1 / n2);
    }
}

let resultado = calcmat(5,5,'soma')

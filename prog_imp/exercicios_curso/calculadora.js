var numero1 = 10;
var numero2 = 15;

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
calcmat(numero1,numero2,"divisao");
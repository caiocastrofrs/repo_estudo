/* Faça um script que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

    salários até R$ 280,00 (incluindo) : aumento de 20%
    salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
 */
let salario = 280

if (salario <= 280)
{
    console.log(`salário antes do reajuste ${salario}`)
    console.log(`terá um aumento de ${salario*0.2}`)
    salario*=1.2
    console.log(`novo salário! ${salario} aumento de 20%`)
}
else if (salario > 280 && salario <= 700)
{
    console.log(`salário antes do reajuste ${salario}`)
    console.log(`terá um aumento de ${salario*1.15}`)
    salario*=1.15
    console.log(`novo salário! ${salario} aumento de 15%`)
}
else if (salario > 700 && salario <= 1500)

{
    console.log(`salário antes do reajuste ${salario}`)
    console.log(`terá um aumento de ${salario*1.10}`)
    salario*=1.10
    console.log(`novo salário! ${salario} aumento de 10%`)
}
else 
{
    console.log(`salário antes do reajuste ${salario}`)
    console.log(`terá um aumento de ${salario*1.05}`)
    salario*=1.05
    console.log(`novo salário! ${salario} aumento de 5%`)
}


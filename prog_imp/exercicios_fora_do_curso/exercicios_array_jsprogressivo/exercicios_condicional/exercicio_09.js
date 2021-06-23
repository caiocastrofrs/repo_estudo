/* Faça um script para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto 
menos os descontos. O script deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220)        : R$ 1100,00
(-) IR (5%)                                : R$   55,00
(-) INSS ( 10%)                       : R$  110,00
FGTS (11%)                            : R$  121,00
Total de descontos                : R$  165,00
Salário Liquido                       : R$  935,00 */

let horas_trabalhadas = 220
let salario_bruto = horas_trabalhadas * 5
let fgts = salario_bruto * 0.11
let inss = salario_bruto * 0.10

if (salario_bruto <= 900)
{
    console.log(`salário bruto: ${salario_bruto}\nir: isento\ninss: ${inss}\nfgts: ${fgts}\ntotal desconto: ${fgts}`)
}
else if(salario_bruto <= 1500)
{
    console.log(`salário bruto: ${salario_bruto}\nir: ${salario_bruto*0.05}\ninss: ${inss}\nfgts: ${fgts}\ntotal desconto: ${(salario_bruto*0.05)+inss}\nsalário liquido: ${salario_bruto-inss-(salario_bruto*0.05)}`)
}
else if(salario_bruto <= 2500)
{
    console.log(`salário bruto: ${salario_bruto}\nir: ${salario_bruto*0.10}\ninss: ${inss}\nfgts: ${fgts}\ntotal desconto: ${(salario_bruto*0.10)+inss}\nsalário liquido: ${salario_bruto-inss-(salario_bruto*0.10)}`)
}
else {
    console.log(`salário bruto: ${salario_bruto}\nir: ${salario_bruto*0.20}\ninss: ${inss}\nfgts: ${fgts}\ntotal desconto: ${(salario_bruto*0.20)+inss}\nsalário liquido: ${salario_bruto-inss-(salario_bruto*0.20)}`)
}


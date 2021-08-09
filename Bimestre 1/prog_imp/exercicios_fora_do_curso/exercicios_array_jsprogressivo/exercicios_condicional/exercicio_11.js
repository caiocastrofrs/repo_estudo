/* Faça um script que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

      Média de Aproveitamento  Conceito
      Entre 9.0 e 10.0                      A
      Entre 7.5 e 9.0                        B
      Entre 6.0 e 7.5                        C
      Entre 4.0 e 6.0                        D
      Entre 4.0 e zero                      E
    O algoritmo deve mostrar numa janela de alert as notas, a média, 
    o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” 
    se o conceito for D ou E. */

let nota1 = 6
let nota2 = 5
let media = (nota1+nota2)/2

if (media >= 9 && media <= 10)
{
    console.log(`nota1: ${nota1}\nnota2: ${nota2}\nmédia: ${media}\nconceito: A\nAPROVADO`)
}
else if(media >= 7.5 && media < 9)
{
    console.log(`nota1: ${nota1}\nnota2: ${nota2}\nmédia: ${media}\nconceito: B\nAPROVADO`)
}
else if(media >= 6.0 && media < 7.5)
{
    console.log(`nota1: ${nota1}\nnota2: ${nota2}\nmédia: ${media}\nconceito: C\nAPROVADO`)
}
else if(media >= 4.0 && media < 6.0)
{
    console.log(`nota1: ${nota1}\nnota2: ${nota2}\nmédia: ${media}\nconceito: D\nREPROVADO`)
}
else if(media >= 0 && media < 4.0)
{
    console.log(`nota1: ${nota1}\nnota2: ${nota2}\nmédia: ${media}\nconceito: E\nREPROVADO`)
}


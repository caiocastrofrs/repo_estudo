/* Faça um script que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */
const aluno = ['caio',10,2]

let media = (aluno[1]+aluno[2])/2

if (media == 10)
{
    console.log('aprovado com distinção')
}
else if (media >= 7)
{
    console.log('aprovado')
}
else
{
    console.log('reprovado')
}
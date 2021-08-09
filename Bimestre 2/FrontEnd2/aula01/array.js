//DECLARAÇÃO DAS VARIÁVEIS
let arrayNotas = [10,7,5,7]
let somaTotal = 0;
let media = 0;

//SOMATÓRIO DAS NOTAS PRESENTE NO ARRAY arrayNotas
for (let i = 0; i < arrayNotas.length; i++) 
{
    somaTotal += arrayNotas[i]
    console.log(somaTotal);
}

//CÁLCULO FEITO PARA SE OBTER A MÉDIA DO ALUNO JUNTO COM A MENSAGEM COM A NOTA IMPRESSA
media = somaTotal/arrayNotas.length;
console.log("Parabéns pela conclusão do primeiro bimestre. Sua nota foi: " + media);

//VERIFICAÇÃO SE O ALUNO PASSOU OU NÃO
if(media >= 7 && media <= 10)
{
    console.log("Parabéns foi aprovado!");
}
else
{
    console.log("Infelizmente a nota não foi o suficiente.");
}

alert("Notas: " + arrayNotas + "\nMédia: " + media);
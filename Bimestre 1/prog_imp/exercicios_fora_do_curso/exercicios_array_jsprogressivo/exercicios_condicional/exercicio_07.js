//Faça um script que pergunte em que turno você estuda. 
//Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

const horario_estudo = 'm'

if (horario_estudo == 'm')
{
    console.log('bom dia!')
}
else if (horario_estudo == 'v')
{
    console.log('boa tarde')
}
else if (horario_estudo == 'n')
{
    console.log('boa noite')
}
else
{
    console.log('valor invalido')
}
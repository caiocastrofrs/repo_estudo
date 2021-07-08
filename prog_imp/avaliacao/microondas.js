function ligar(opcoes, tempo){
    //TEMPO PADRÃO DE CADA COMIDA
    let tempoPadrao
    //SWITCH QUE FARÁ A VALIDAÇÃO, ISSO É, DEFINIR O TEMPO PADRÃO DA COMIDA DADA PELO USUÁRIO
    switch(opcoes)
    {
        case "Pipoca":
            tempoPadrao = 10;
            break;
        case "Macarrão":
            tempoPadrao = 8;
            break;
        case "Carne":
            tempoPadrao = 15;
            break;
        case "Feijão":
            tempoPadrao = 12;
            break;
        case "Brigadeiro":
            tempoPadrao = 8;
            break;
        default:
            console.log("prato inexistente")
            break;
    }
// ESSE IF TEM O OBJETIVO DE CHECAR SE O TEMPO DADO PELO USUÁRIO É VÁLIDO OU NÃO, 
//SE FOR VÁLIDO ELE VAI RETORNAR 'PRATO PRONTO, BOM APETITE'
//SE FOR INVÁLIDO ELE VAI RETORNAR QUALQUER DAS OUTRAS OPÇÕES
//EU FIZ ALGUNS TESTES NESSE IF E PERCEBI QUE A SEQUENCIA CORRETA DAS CONDIÇÕES É
//PRIMEIRO CHECAR SE ELE É O TRIPLO, DEPOIS CHECAR SE ELE É
// O DOBRO E DEPOIS CHECAR SE ELE É INSUFICIENTE, SE VC CHECASSE O DOBRO PRIMEIRO,
//ELE NUNCA PASSARIA PELO TRIPLO, PORQUE UM VALOR TRIPLICADO PASSA SEMPRE PASSARIA PELO DOBRO
    if (tempo >= tempoPadrao*3)
    {
        console.log ("A comida queimou")
    }
    else if(tempo >= tempoPadrao*2)
    {
        console.log ("kabumm")
    }
    else if(tempo < tempoPadrao)
    {
        console.log ("Prato inexistente")
    }
    else
    {
        console.log ("Prato pronto, bom apetite!!!")
    }
}

ligar("Pipoca", 20)
ligar("Pipoca", 35)
ligar("Pipoca", 9)
ligar("Pipoca", 11)

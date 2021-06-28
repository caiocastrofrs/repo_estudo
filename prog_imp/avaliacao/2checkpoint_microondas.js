const comidas = [['Pipoca',10],['Macarrão',8],['Carne',15],['Feijão',12],['Brigadeiro',8]]

const checarTempo = (prato) => 
{
    switch(prato)
    {
        case 'Pipoca':
            if (comidas[0][2] > comidas[0][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (comidas[0][2] > comidas[0][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (comidas[0][2] < comidas[0][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Macarrão':
            if (comidas[1][2] > comidas[1][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (comidas[1][2] > comidas[1][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (comidas[1][2] < comidas[1][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Carne':
            if (comidas[2][2] > comidas[2][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (comidas[2][2] > comidas[2][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (comidas[2][2] < comidas[2][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Feijão':
            if (comidas[3][2] > comidas[3][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (comidas[3][2] > comidas[3][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (comidas[3][2] < comidas[3][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Brigadeiro':
            if (comidas[4][2] > comidas[4][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (comidas[4][2] > comidas[4][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (comidas[4][2] < comidas[4][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        default:
            console.log('Prato inexistente')
            break;
    }
}

const alterarTempo = (prato,tempo) =>
{
    switch(prato)
    {
        case 'Pipoca':
            comidas[0][2] = tempo
            checarTempo('Pipoca')
            break;
        case 'Macarrão':
            comidas[1][2] = tempo
            checarTempo('Macarrão')
            break;
        case 'Carne':
            comidas[2][2] = tempo
            checarTempo('Carne')
            break;
        case 'Feijão':
            comidas[3][2] = tempo
            checarTempo('Feijão')
            break;
        case 'Brigadeiro':
            comidas[4][2] = tempo
            checarTempo('Brigadeiro')
            break;
        default:
            console.log('Prato inexistente')
            break;
    }
}

//PIPOCA
console.log('-----PRATO PIPOCA-----')
alterarTempo('Pipoca',100)
alterarTempo('Pipoca',25)
alterarTempo('Pipoca',1)
alterarTempo('Pipoca',11)
//MACARRAO
console.log('-----PRATO MACARRÃO-----')
alterarTempo('Macarrão',100)    
alterarTempo('Macarrão',17)
alterarTempo('Macarrão',1)
alterarTempo('Macarrão',11)
//CARNE
console.log('-----PRATO CARNE-----')
alterarTempo('Carne',100)    
alterarTempo('Carne',31)
alterarTempo('Carne',1)
alterarTempo('Carne',17)
//FEIJÃO
console.log('-----PRATO FEIJÃO-----')
alterarTempo('Feijão',100)    
alterarTempo('Feijão',25)
alterarTempo('Feijão',1)
alterarTempo('Feijão',13)
//BRIGADEIRO
console.log('-----PRATO BRIGADEIRO-----')
alterarTempo('Brigadeiro',100)    
alterarTempo('Brigadeiro',17)
alterarTempo('Brigadeiro',1)
alterarTempo('Brigadeiro',15)


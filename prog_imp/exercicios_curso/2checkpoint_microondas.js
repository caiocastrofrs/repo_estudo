const comidas = [['Pipoca',10],['Macarrão',8],['Carne',15],['Feijão',12],['Brigadeiro',8]]


const checarTempo = (prato,tempo) => 
{
    switch(prato)
    {
        case 'Pipoca':
            if (tempo > comidas[0][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempo > comidas[0][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempo < comidas[0][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Macarrão':
            if (tempo > comidas[1][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempo > comidas[1][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempo < comidas[1][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Carne':
            if (tempo > comidas[2][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempo > comidas[2][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempo < comidas[2][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Feijão':
            if (tempo > comidas[3][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempo > comidas[3][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempo < comidas[3][1])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
            break;
        case 'Brigadeiro':
            if (tempo > comidas[4][1]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempo > comidas[4][1]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempo < comidas[4][1])
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

//PIPOCA
console.log('-----PRATO PIPOCA-----')
checarTempo('Pipoca',100)
checarTempo('Pipoca',25)
checarTempo('Pipoca',1)
checarTempo('Pipoca',11)
//MACARRAO
console.log('-----PRATO MACARRÃO-----')
checarTempo('Macarrão',100)    
checarTempo('Macarrão',17)
checarTempo('Macarrão',1)
checarTempo('Macarrão',11)
//CARNE
console.log('-----PRATO CARNE-----')
checarTempo('Carne',100)    
checarTempo('Carne',31)
checarTempo('Carne',1)
checarTempo('Carne',17)
//FEIJÃO
console.log('-----PRATO FEIJÃO-----')
checarTempo('Feijão',100)    
checarTempo('Feijão',25)
checarTempo('Feijão',1)
checarTempo('Feijão',13)
//BRIGADEIRO
console.log('-----PRATO BRIGADEIRO-----')
checarTempo('Brigadeiro',100)    
checarTempo('Brigadeiro',17)
checarTempo('Brigadeiro',1)
checarTempo('Brigadeiro',15)


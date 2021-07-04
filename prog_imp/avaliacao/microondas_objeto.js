const prato = {
    "Pipoca": 10,
    "Macarrão": 8,
    "Carne": 15,
    "Feijão": 12,
    "Brigadeiro": 8,

    checarTempo: function(prato, tempoDado)
    {
        if (this[prato] == undefined)
        {
            console.log('Prato inexistente')
        }
        else
        {
            if (tempoDado > this[prato]*3)
            {
                console.log('KABUM!!!')
            }
            else if (tempoDado > this[prato]*2)
            {
                console.log('Comida queimou!')
            }
            else if (tempoDado < this[prato])
            {
                console.log('Tempo insuficiente!')
            }
            else 
            {
                console.log('Prato pronto, bom apetite!')
            }
        }
    }
}

//PIPOCA
console.log('-----PRATO PIPOCA-----')
prato.checarTempo('Pipoca',100)
prato.checarTempo('Pipoca',25)
prato.checarTempo('Pipoca',1)
prato.checarTempo('Pipoca',11)
//MACARRAO
console.log('-----PRATO MACARRÃO-----')
prato.checarTempo('Macarrão',100)    
prato.checarTempo('Macarrão',17)
prato.checarTempo('Macarrão',1)
prato.checarTempo('Macarrão',11)
//CARNE
console.log('-----PRATO CARNE-----')
prato.checarTempo('Carne',100)    
prato.checarTempo('Carne',31)
prato.checarTempo('Carne',1)
prato.checarTempo('Carne',17)
//FEIJÃO
console.log('-----PRATO FEIJÃO-----')
prato.checarTempo('Feijão',100)    
prato.checarTempo('Feijão',25)
prato.checarTempo('Feijão',1)
prato.checarTempo('Feijão',13)

//BRIGADEIRO
console.log('-----PRATO BRIGADEIRO-----')
prato.checarTempo('Brigadeiro',100)    
prato.checarTempo('Brigadeiro',17)
prato.checarTempo('Brigadeiro',1)
prato.checarTempo('Brigadeiro',15) 

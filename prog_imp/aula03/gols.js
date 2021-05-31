var nomeJogador = 'Caio';
var golsJogador = 0;
var precoEmDolares = 0;

function fazerGol()
{
    golsJogador++;
    console.log("GOL!!!!!!!!!");
    precoEmDolares+= 10000;
}

function hatTrick()
{
    for(i = 0;i<3;i++)
    {
        fazerGol();
    }
    precoEmDolares += precoEmDolares * 0.10;
}
hatTrick();
console.log(`O jogador ${nomeJogador} aumentou o valor de mercado em 10%, valendo então ${precoEmDolares}`)
/* fazerGol();
console.log(`Gols do jogador: ${golsJogador} Preço em Dólares: ${precoEmDolares}`);
fazerGol();
console.log(`Gols do jogador: ${golsJogador} Preço em Dólares: ${precoEmDolares}`);
fazerGol();
console.log(`Gols do jogador: ${golsJogador} Preço em Dólares: ${precoEmDolares}`);
fazerGol();
console.log(`Gols do jogador: ${golsJogador} Preço em Dólares: ${precoEmDolares}`); */
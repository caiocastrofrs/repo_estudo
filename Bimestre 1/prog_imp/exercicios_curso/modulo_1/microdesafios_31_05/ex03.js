// Funções [ENCONTRO]
/* 
Criar as variáveis, nomeJogador, golsJogador, precoEmDolares.
Depois, criar a função fazerGol que incremente a quantidade
de gols do jogador em uma unidade e, em seguida, imprima em 
tela a mensagem “GOL!!!!!!!!!”. Além disso, incremente o valor
do jogador em 10.000 dólares. Por conseguinte, teste a execução
da função várias vezes e imprima em tela a nova quantidade de 
gols do jogador e o preço do jogador no mercado.

Criar a função hatTrick (expressão usada para dizer que um jogador 
fez 3 gols em uma mesma partida) que em seu interior execute três 
vezes a função fazerGol e, em seguida, aumente o valor do jogador
em 10% a mais por ano em comparação com o valor atual.
 */

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

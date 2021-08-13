//DECLARANDO AS VARIAVEIS QUE VAI ARMAZENAR OS PONTOS
let pontosPessoa = 0;
let pontosMaquina = 0;
//ARRAY PARA DEFINIR AS OPÇÕES DE JOGADA
let arrayEscolhas = ['pedra','papel','tesoura'];
//ESSE WHILE TEM O OBJETIVO DE REPETIR AS AÇÕES ATÉ QUE UM DOS JOGADORES CHEGUE AOS 3 PONTOS
while((pontosPessoa < 3) || (pontosMaquina < 3)){
    //AQUI É ONDE É DECLARADO A ESCOLHA DO ROBO
    let escolhaDoRobo = Math.floor(Math.random() * arrayEscolhas.length);
    //AQUI É ONDE NÓS PEGAMOS A ESCOLHA DO JOGADOR
    let escolhaDoJogador = prompt("Escolha entre pedra/papel/tesoura");
    //ESSE SWITCH TEM O OBJETIVO DE VERIFICAR TODAS AS OPÇÕES SE BASEANDO NAS ESCOLHAS DO ROBO E DO JOGADOR
    switch(escolhaDoJogador) {
        //CASO O JOGADOR ESCOLHA PEDRA PAPEL OU TESOURA, É VERIFICADO TODAS AS OPÇÕES QUE O ROBO PODE JOGAR E ASSIM DANDO O RESULTADO E O PONTO PARA QUEM VENCEU
        case 'pedra':
            if (arrayEscolhas[escolhaDoRobo] == 'papel')
            {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Maquina ganha!");
                pontosMaquina++;
            }
            else if(arrayEscolhas[escolhaDoRobo] == 'tesoura'){
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Pessoa ganha!");
                pontosPessoa++;
            }
            else {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Empate!");
            }
            break;
        case 'papel':
            if (arrayEscolhas[escolhaDoRobo] == 'tesoura')
            {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Maquina ganha!");
                pontosMaquina++;
            }
            else if(arrayEscolhas[escolhaDoRobo] == 'pedra'){
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Pessoa ganha!");
                pontosPessoa++;
            }
            else {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Empate!");
            }
            break;
        case 'tesoura':
            if (arrayEscolhas[escolhaDoRobo] == 'pedra')
            {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Maquina ganha!");
                pontosMaquina++;
            }
            else if(arrayEscolhas[escolhaDoRobo] == 'papel'){
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Pessoa ganha!");
                pontosPessoa++;
            }
            else {
                alert("maquina escolheu: " + arrayEscolhas[escolhaDoRobo])
                alert("Empate!");
            }
            break;
    }
    //ESSE BLOCO DE CÓDIGO TEM O OBJETIVO DE MOSTRAR QUE FOI O PRIMEIRO A CHEGAR AOS 3 PONTOS
    if(pontosPessoa == 3){
        alert("pessoa fez um total de 3 pontos e ganhou!");
    }
    else if(pontosMaquina == 3) {
        alert("maquina fez um total de 3 pontos e ganhou!");
    }
    else
    {
        alert("nenhum dos dois fez 3 pontos ainda!");
    }
}
/* 
Crie uma variável chamada linguagem, que terá uma string atribuída a ela.
 Em seguida, construa uma condicional if/else para que, se a variável 
 estiver armazenando o valor "javascript", ela deve imprimir no console, 
 o texto: "Estou aprendendo". Contudo, caso a variável esteja armazenando 
 qualquer outra linguagem, imprima "Aprenderei mais tarde". 
 */

var linguagem = "javascript"

function teste_linguagem(linguagem_teste)
{
    if (linguagem == "javascript"){
        console.log("Estou aprendendo")
    }
    else {
        console.log("Aprenderei mais tarde")
    }
}

teste_linguagem(linguagem);

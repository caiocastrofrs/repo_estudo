//data 12/07/2021
//aula 15 - promises
// o que são promises?
// é um objeto javascript que vincula:
//1 - a produção do codigo
//2 - o consumo de código
//propriedades do objeto Promise
// PENDENTE / REALIZADA / REJEITADA

function meuVerificador(resposta) 
{
    console.log(resposta)
}

let minhaPromessa = new Promise
    (
        function (Resolve, Reject) 
        {

            let x = 0;
            if (x == 0) 
            {
                Resolve("Tudo OK")
            }
            else 
            {
                Reject("Deu Erro")
            }
        }
    );

minhaPromessa.then
(
    function(Resolve)
    {
        meuVerificador(Resolve)
    }).catch((Reject) =>
    {
        console.log(Reject)
    })


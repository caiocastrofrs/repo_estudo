//data 12/07/2021
//aula 15 - promises
//ex03Promises.js

//host
let dadosConexaoJson = '{"server":"148.192.0.1", "login":"admin","senha":"1234"}'
/* console.log(dadosConexaoJson); */

//convertendo em JS
let dadosConexaoJS = JSON.parse(dadosConexaoJson);
/* console.log(dadosConexaoJS + "\n" + dadosConexaoJson);
console.log(dadosConexaoJS.server);
console.log(dadosConexaoJS.login);
console.log(dadosConexaoJS.senha);
 */
let vserver = "148.192.0.1";
let vlogin = "admin";
let vsenha = 1234;

//configuração padrão
let conexao = false;

if (dadosConexaoJS.server == vserver && dadosConexaoJS.login == vlogin && dadosConexaoJS.senha == vsenha) {
    conexao = true;
    /*     console.log(conexao); */
}
else {
    conexao = false;
    /* console.log(conexao); */

};

// CRIAÇÃO DA PROMISE

const promessa = new Promise((resolve, reject) => {
    console.log('Requisição em andamento...');
    // criação de um delay de 3 segundos
    setTimeout( //verificamos se a promise dará erro ou nãp
        () => {
            if (!conexao) {
                reject("Acesso negado - Server não conectado")
            }
            else {
                resolve(JSON.stringify
                    (
                        {
                            vserver: "148.192.0.1",
                            vlogin: "admin",
                            vsenha: 1234
                        }
                    ))
            }
        }, 3000)
});

promessa.then
    (
        (resolve) => {
            const dados = JSON.parse(resolve);
            console.log(dados);
        }
    ).catch(
        (reject) => {
            console.log(reject)
        }
    )

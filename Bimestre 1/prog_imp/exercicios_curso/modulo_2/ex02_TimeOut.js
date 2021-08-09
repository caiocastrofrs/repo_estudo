//data 12/07/2021
//aula 15 - promises
//EX02TIMEOUT.JS
console.log('Requisitando o servidor...')
setTimeout
(
    function()
    {
        funcaoConectar("SERVER CONECTADO")
    }, 8000
);

function funcaoConectar(value)
{
    console.log(value);
};

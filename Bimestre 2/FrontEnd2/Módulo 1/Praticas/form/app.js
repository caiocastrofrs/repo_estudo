let nome = document.getElementById('nome');
let sobrenome = document.getElementById('sobrenome');
let email = document.getElementById('email');
let senha = document.getElementById('senha');
let selecao = document.getElementById('selecao').value;
const btnEnviar = document.getElementById('btnEnviar');

function inserir() {
    const tabela = document.getElementById('tabela');
    tabela.innerHTML += 
    `
    <tr>
        <td>${nome.value+' '+sobrenome.value}</td>
        <td>${email.value}</td>
        <td>${selecao}</td>
    </tr>
    `
}

btnEnviar.addEventListener('click', inserir)


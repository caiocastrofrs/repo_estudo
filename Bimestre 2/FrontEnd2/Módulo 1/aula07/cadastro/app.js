const botao = document.getElementById('botaoAdicionar');
let nome = document.getElementById('nome');
let sobrenome = document.getElementById('sobrenome');
let email = document.getElementById('email');
function adicionarCadastro() {
    const tabela = document.querySelector('table');
    let elemento = `
    <tr>
        <td>${nome.value}</td>
        <td>${sobrenome.value}</td>
        <td>${email.value}</td>
    </tr>`
    tabela.innerHTML += elemento;
}
botao.addEventListener("click", adicionarCadastro);
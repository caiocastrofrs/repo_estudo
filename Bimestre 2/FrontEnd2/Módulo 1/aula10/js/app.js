//armazenar o botão enviar em uma variavel
const btnEnviar = document.getElementById('enviar');
// armazenar o form dentro de uma variavel
let form = document.querySelector('form');
function naoCarrega(evento) {
    //desabilitando esse evento
    evento.preventDefault();
}
// adicionar um evento no form
form.addEventListener('submit', naoCarrega);
//função pra adicionar o card
function adicionarCard() {
    let titulo = document.getElementById('titulo').value;
    let urlImg = document.getElementById('urlImg').value;
    let descricao = document.getElementById('descricao').value;
    let divCards = document.getElementById('div-cards');
    divCards.innerHTML += 
    `
    <div class="card">
        <img src="${urlImg}" alt="imagem"></img>
        <h2>${titulo}</h2>
        <p>${descricao}</p>
    </div>
    `
}

btnEnviar.addEventListener('click', adicionarCard);
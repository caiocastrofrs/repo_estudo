const botao = document.querySelector('button');
/* const nome = document.querySelector('input'); */

function adicionarItem() {
    const lista = document.querySelector('ul');
    const elemento = `<li><img src="https://picsum.photos/200"></img></li>`;
    lista.innerHTML += elemento;
}

botao.addEventListener("click", adicionarItem);
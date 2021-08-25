window.addEventListener("load",function(){alert("Olá!")})

let form = document.createElement('form');

let nome = document.createElement('input');
let labelNome = document.createElement('label');
nome.type = "text";
labelNome.innerText = "Nome";
form.appendChild(labelNome);
form.appendChild(nome);

let email = document.createElement('input');
let labelEmail = document.createElement('label');
email.type = "email";
labelEmail.innerText = "Email";
form.appendChild(labelEmail);
form.appendChild(email);

let btnEnviar = document.createElement('input');
btnEnviar.type = "submit";
btnEnviar.value = "Enviar";
form.appendChild(btnEnviar);

let btnReset = document.createElement('input');
btnReset.type = "reset";
btnReset.value = "Reset";
form.appendChild(btnReset);

function naoCarrega(evento) {
    evento.preventDefault();
}
function mudarCorTexto(el) {
    el.style.color = "red";
    document.getElementById('qntdCor').innerText ++;
}
function tirarCorTexto(el) {
    el.style.color = "blue";
}
btnEnviar.setAttribute("onmouseover","mudarCorTexto(this)")
btnEnviar.setAttribute("onmouseout","tirarCorTexto(this)")
form.addEventListener('submit', naoCarrega);

document.querySelector('body').appendChild(form);

form.style.display = "flex";
form.style.flexDirection = "column";
form.style.gap = "15px";
form.style.width = "300px";
form.style.margin = "0 auto";
form.style.marginTop = "200px";
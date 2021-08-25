let form = document.querySelector('form');
form.innerHTML += "<h1>Login</h1>";

let email = document.createElement('input');
email.type = "email"
email.placeholder = "email"
email.disabled = true;
form.appendChild(email);

let password = document.createElement('input');
password.type = "password";
password.placeholder = "Senha";
form.appendChild(password);

let btnEnviar = document.createElement('input');
btnEnviar.type = "submit";
btnEnviar.value = "Enviar";
form.appendChild(btnEnviar);

let btnReset = document.createElement('input');
btnReset.type = "button";
btnReset.value = "Cancelar";
form.appendChild(btnReset);

form.style.display = "flex";
form.style.flexDirection = "column";
form.style.width = "50%";
form.style.margin ="0 auto";
form.style.textAlign = "center";

email.removeAttribute("placeholder");

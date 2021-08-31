// criar o form 
let form = document.createElement('form');
//criar a label e o input do nome e adicioná-los no form
let nome = document.createElement('input');
let labelNome = document.createElement('label');
nome.type = "text";
labelNome.innerText = "Nome";
form.appendChild(labelNome);
form.appendChild(nome);
//criar a label e o input do email e adicioná-los no form
let email = document.createElement('input');
let labelEmail = document.createElement('label');
email.type = "email";
labelEmail.innerText = "Email";
form.appendChild(labelEmail);
form.appendChild(email);
//criar a label e o input da senha e adicioná-los no form
let senha = document.createElement('input');
let labelSenha = document.createElement('label');
senha.type = "password";
labelSenha.innerText = "Senha";
form.appendChild(labelSenha);
form.appendChild(senha);
// adicionar o form no html
document.body.appendChild(form);

//evento que desabilita o input após perder o foco
nome.addEventListener('focusout',()=>{
    if(nome.value.length > 0){
        nome.setAttribute('disabled',true);
    }
})
nome.addEventListener('mouseover',() =>{
    nome.removeAttribute('disabled');
}) 

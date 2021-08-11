//EXEMPLO DE ALTERAÇÃO NA PAGINA HTML USANDO JS

let nome = prompt('Digite seu nome: ');

document.querySelector('h1').innerText += ' ' + nome;
console.log(nome)
let situacao = confirm("Para acessar o sistema pressione OK");
if(situacao) {
//redirecionar para a página de acesso permitido.
    window.location.href="acessoPermitido.html";
} else {
//redirecionar para a página de acesso negado.
    window.location.href="acessoNegado.html";
}

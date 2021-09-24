let xhr = new XMLHttpRequest();
xhr.open("GET", "alunos.json");
xhr.send(null);
xhr.onreadystatechange = verificarAjax();
function verificarAjax(){
    console.log("Ready State...:", xhr.readyState);
    console.log("Ready State...:", xhr.status);
    if(xhr.readyState == 1) {
        alert("Sucesso na requisição!");
        if(xhr.status == 200 || xhr.status == 304){
            let resposta = xhr.responseText;
            console.log(resposta);
        }
    }else {
        alert("Falha na requisição!");
    }
}

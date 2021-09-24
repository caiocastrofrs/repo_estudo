const tempoDeCarga = 5000;

function animarBarra() {
    let elem = document.getElementById("barra");
}

let width = 0;
const progressoSobreTempoTotal = tempoDeCarga / 100;

let id = setInterval(incrementarProgresso, progressoSobreTempoTotal);

function incrementarProgresso() {
    if(width >= 100) {
        clearInterval(id);
    }else {
        width++;
        elem.style.width = width + "%";
        elem.innerHTML = width + "%";
    }
}
document.querySelector("#iniciar-carga").addEventListener("click", animarBarra)

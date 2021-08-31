let div1 = document.getElementById('div1');
let iframe = document.createElement("iframe");
iframe.src = "https://www.youtube.com/watch?v=UftSB4DaRU4&t=1223s"
iframe.width = "100px";
iframe.height = "100px";
/* div1.style.backgroundColor = "white";
div1.style.color = "black"; */

div1.children[0].style.border = "1px solid";
div1.children[1].style.fontSize = "30px";
div1.style.borderRadius = "5px";
div1.style.boxShadow = "1px 0px 3333px orange";
div1.style.marginTop = "300px";

let divsCores = document.querySelectorAll('.classe-div');
divsCores.forEach(function(el){
    let cor = el.innerText;
    console.log(cor)
    if(cor == 'Azul'){
        el.style.backgroundColor = "blue";
    }else if (cor == 'Vermelho'){
        el.style.backgroundColor = "red";
    }else if (cor == 'Verde'){
        el.style.backgroundColor = "green";
    }else {
        el.style.backgroundColor = "black";
    }
});


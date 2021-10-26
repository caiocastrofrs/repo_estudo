let text = document.getElementById('idTexto');
let img = document.getElementById('image');
let body = document.querySelector('body');
const changeTextFontSize = (el) => {
    text.style.fontSize = `${el.value}rem`
}

const changeImgSize = (el) => {
    img.style.width = `${el.value}%`;
}

const changeBgColor = (el) => {
    body.style.backgroundColor = `hsl(${el.value}, 50%, 50%)`;
}

const changePageFontColor = (el) => {
    body.style.color = `hsl(${el.value}, 50%, 50%)`;
}
async function fetchData() {
    const response = await fetch('palavras.txt');
    const palavras = await response.text();
    return palavras.split("\n");
}

palavras = fetchData();
palavras.then(function (result) {
    let wordContainer = document.getElementById('word-container');
    let input = document.getElementById('input-text');
    result.forEach(el => {
        wordContainer.innerHTML += " " + `<span>${el}</span>`;
        let filho = wordContainer.querySelector('span');
        input.addEventListener('keyup', (event) => {
            if (event.key == el.slice(0,2)) {
                wordContainer.removeChild(word.Container.childNodes[0]);
            }
        })
    })
})



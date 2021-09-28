let url = "https://jsonplaceholder.typicode.com/todos/"
fetch(url)
.then(function(response) {  
    return response.json();
})
.then(function(data) {console.log(data[0].title)})

const cep = document.querySelector("#cep");
// função mostrarDados
const mostrarDados = (result) => {
    for(const campo in result) {
        if(document.querySelector("#"+campo)) { // função que preencherá os campos
            document.querySelector("#"+campo).value = result[campo];
        }
    }
}

cep.addEventListener("blur", (e) => {
    let pesquisa = cep.value.replace("-", "");
    const options = {
        method: 'GET',
        mode: 'cors',
        cache: 'default'
    }

    fetch(`https://viacep.com.br/ws/${pesquisa}/json/`, options)
        .then(response => {
            console.log(response.json())
            .then (dado => mostrarDados(dado))
        })
        .catch(e => console.log('Deu erro: ' + e, message))
})

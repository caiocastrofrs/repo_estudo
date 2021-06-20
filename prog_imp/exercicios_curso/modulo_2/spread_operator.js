const aluno = require("./objeto_aluno")

let curso =
{
    curso: "Fullstack",
    turno: "Manha",
    sede: "São Paulo"
}

let estudanteUm = 
{
    nome: "Denise",
    email: "denise@email.com",
    ...curso
}

let estudanteDois = 
{
    nome: "Jose",
    email: "Jose@email.com",
    ...curso
}


console.log(curso)
console.log(estudanteUm)
console.log(estudanteDois)


let frutasUm = ['kiwi','banana','maçã','abacate']
let frutasDois = ['pêra','mamão','papaya','goiaba']

const frutasCompleta = [...frutasUm, ...frutasDois]

console.log(frutasCompleta)

let string = "KDNWIUMXM1239DH182NDMSDWE"
let caracteres = [...string]

console.log(caracteres)
const aluno = require('./aluno')
const curso = require('./curso')
const estudantes = require('./estudantes')

//PASSO 7
estudantes.forEach(el =>
    {
        curso.adicionarAluno(el)
    })
    console.log(curso.listaAvaliados())


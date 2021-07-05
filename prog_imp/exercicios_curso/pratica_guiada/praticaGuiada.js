const aluno = require('./modulos/aluno')
const curso = require('./modulos/curso')
const estudantes = require('./modulos/estudantes')

//PASSO 7
estudantes.forEach(el =>
    {
        curso.adicionarAluno(el)
    })
console.log(aluno)
console.log(curso.listaAvaliados())


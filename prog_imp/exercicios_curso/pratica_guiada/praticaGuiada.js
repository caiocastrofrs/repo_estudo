const aluno = require('./modulos/aluno')
const curso = require('./modulos/curso')
const estudantes = require('./modulos/estudantes')

//PASSO 7
estudantes.forEach(el =>
    {
        curso.adicionarAluno(el)
    })
curso.listaAvaliados().forEach(el =>
    {
        if(el)
        {
            console.log("O estudante " + el.nome + " foi aprovado!");
        }
        else
        {
            console.log("O estudante " + el.nome + " foi reprovado!");
        }
    })


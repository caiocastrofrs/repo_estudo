//PASSO 3 OBJETO LITERAL CURSO 
const Curso = 
{
    nome_curso: 'Programação Imperativa',
    nota_aprovacao: 7,
    faltas_maximas: 2,
    lista_estudantes: [],
    //PASSO 4 FUNÇÃO DE ADICIONAR ALUNOS NO ARRAY LISTA ESTUDANTES
    adicionarAluno: function(aluno)
    {
        this.lista_estudantes.push(aluno)
    },
    //PASSO 5 FUNÇÃO QUE RETORNA TRUE OU FALSE CASO O ALUNO SEJA APROVADO OU REPROVADO RESPECTIVAMENTE 
    avaliarAluno: function(aluno)
    {
        if(aluno.qntd_faltas == 2 && aluno.calcularMedia() >= this.nota_aprovacao*1.10)
        {
            return true;
        }
       else if(aluno.qntd_faltas < 2 && aluno.calcularMedia() >= this.nota_aprovacao)
       {
            return true;
       }
       else 
       {
            return false;
       }
    },
    //PASSO 6 FUNÇÃO QUE RETORNA A AVALIAÇÃO DE TODOS OS ALUNOS INSTANCIADOS, RESULTADO VAI SER TRUE FALSE
    listaAvaliados: function()
    {
        let avaliados = this.lista_estudantes.map((el) =>
        {
            if (this.avaliarAluno(el))
            {
                return el
            }
        })
        return avaliados
    }
};

module.exports = Curso;

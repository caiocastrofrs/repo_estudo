//PASSO 3
const Curso = 
{
    nome_curso: 'Programação Imperativa',
    nota_aprovacao: 7,
    faltas_maximas: 2,
    lista_estudantes: [],
    //PASSO 4
    adicionarAluno: function(aluno)
    {
        this.lista_estudantes.push(aluno)
    },
    //PASSO 5
    avaliarAluno: function(aluno)
    {
       if(aluno.qntd_faltas == 2)
       {
           if (aluno.calcularMedia() >= this.nota_aprovacao*1.10)
           {
               return true;
           }
           else 
           {
               return false;
           }
       }
       else if(aluno.qntd_faltas < 2)
       {
            if (aluno.calcularMedia() >= this.nota_aprovacao)
            {
                return true;
            }
            else 
            {
                return false;
            }
       }
       else 
       {
            return false;
       }
    },
    //PASSO 6
    listaAvaliados: function()
    {
        let avaliados = this.lista_estudantes.map((el) =>
        {
            return this.avaliarAluno(el)
        })
        return avaliados
    }
};

module.exports = Curso;

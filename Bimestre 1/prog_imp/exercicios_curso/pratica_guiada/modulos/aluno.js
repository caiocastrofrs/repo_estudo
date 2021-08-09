//PASSO 1 OBJETO ALUNO COM CONSTRUTOR 
function Aluno(nome,qntd_faltas,notas)
{
    this.nome = nome;
    this.qntd_faltas = qntd_faltas;
    this.notas = notas;
    //PASSO 2 FUNÇÃO CALCULAR MÉDIA DO ALUNO
    this.calcularMedia = function ()
    {
        return this.notas.reduce((acc, el) => 
        {
           return acc + el
        })/this.notas.length
    };
    //PASSO 2 CALCULAR FALTAS, APENAS ADICIONA UMA FALTA
    this.calcularFaltas = function ()
    {
        this.qntd_faltas++
        console.log('Falta adicionada!')
    }
};

module.exports = Aluno;

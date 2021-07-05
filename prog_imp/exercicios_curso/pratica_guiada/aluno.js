//PASSO 1
function Aluno(nome,qntd_faltas,notas)
{
    this.nome = nome;
    this.qntd_faltas = qntd_faltas;
    this.notas = notas;
    //PASSO 2
    this.calcularMedia = function ()
    {
        return this.notas.reduce((acc, el) => 
        {
           return acc + el
        })/this.notas.length
    };
    //PASSO 2
    this.calcularFaltas = function ()
    {
        this.qntd_faltas++
        console.log('Falta adicionada!')
    }
};

module.exports = Aluno;

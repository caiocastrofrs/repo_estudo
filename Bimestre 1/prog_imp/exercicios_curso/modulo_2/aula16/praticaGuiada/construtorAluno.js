/*
CRIE UM OBJETO ALUNO QUE TENHA COMO ATRIBUTOS:
NOME(STRING)
QUANTIDADE DE FALTAS(NUMBER)
NOTAS(ARRAY)
CRIE UM CONSTRUTOR PARA ELE E IMPORTE-O COMO O MÓDULO ALUNO
*/

function Alunos(nome,qntd_faltas,notas)
{
    this.nome = nome;
    this.qntd_faltas = qntd_faltas;
    this.notas = notas;
    this.calcularMedia = ()=>
    {
        return this.notas.reduce((acc, el) =>
        {
            acc + el;
        })/this.notas.length.toFixed(1);
    };
    this.adicionarFaltas = () => this.faltas++;
}

module.exports = Alunos;

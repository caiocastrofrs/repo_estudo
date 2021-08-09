let aluno = 
{
        nome : 'caio',
        numero_arquivo : 123,
        lista_notas : [
            ['Matematica',8],
            ['Historia',7],
            ['Portugues',4]
        ],
        media : function()
        {
            let notas_somadas = 0
            for ( let i = 0; i < this.lista_notas.length; i++)
            {
                notas_somadas+= this.lista_notas[i][1]
            }
            notas_somadas /= this.lista_notas.length
            console.log("média: " + Math.round(notas_somadas))
        }
}

aluno.media()

module.exports = aluno


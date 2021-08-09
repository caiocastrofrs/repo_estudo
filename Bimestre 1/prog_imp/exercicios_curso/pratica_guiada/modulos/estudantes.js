
const aluno = require('./aluno')

//PASSO 7 INSTANCIANDO TODOS OS ALUNOS EM UM ARQUIVO SEPARADO DOS DEMAIS 
let caio = new aluno('caio',1,[10,10,10])
let icaro = new aluno('icaro',1,[10,10,10])
let adso = new aluno('adso',2,[10,10,2])
let diego = new aluno('diego',4,[10,10,10])
let lista_alunos = [caio,icaro,adso,diego]
module.exports = lista_alunos

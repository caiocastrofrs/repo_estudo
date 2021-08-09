// AULA 14 - JSON 
// DATA 07/07/21

let dadosJson = '{"nome":"Caio","Sobrenome":"Castro","Sexo":"Masculino"}';
console.log(dadosJson);

let dadosConvertidosJs = JSON.parse(dadosJson);
/* console.log(dadosConvertidosJs);
 */

let objetoLiteral = {materia: 'Prog. Imperativa', professor: 'William'};
objetoLiteral.professor= objetoLiteral.professor.toUpperCase();
console.log(objetoLiteral);

let objetoConvertidoJSON = JSON.stringify(objetoLiteral);
console.log(objetoConvertidoJSON);
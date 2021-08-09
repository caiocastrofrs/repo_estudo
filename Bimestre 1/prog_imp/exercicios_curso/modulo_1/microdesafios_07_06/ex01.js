/*
Em um parque de diversões nos pedem um programa para verificar se os passageiros da montanha-russa podem entrar no brinquedo.

Crie uma função podeSubir() que receba dois parâmetros: 
altura da pessoa;
se está acompanhada.

Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode subir ou não, baseado nas seguintes condições:
A pessoa deve medir mais de 1.40m e menos de 2 metros.
Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
Se a pessoa medir menos de 1.20m, não poderá subir, nem acompanhada.

Modifique a função podeSubir(), de modo que ela exiba uma mensagem de autorização ou de impedimento no acesso ao brinquedo dependendo se a pessoa se enquadra ou não nas condições do exercício anterior. Por exemplo:
Em caso de autorização, exiba a mensagem: “Acesso autorizado” ou “Acesso autorizado somente com acompanhante”;
Em caso de impedimento, exiba a mensagem: “Acesso negado.”
 */

let lista_compras = ['sabonete','shampoo','alvejante','detergente','arroz','pasta de dente','papel higiênico']

//TESTE DO JOIN
console.log("Join retorna todos elementos de um array em formato de string e separados por algum caractere que no caso é um traço")
console.log(lista_compras.join(" - "))

//TESTE DO POP
console.log("Pop remove o ultimo elemento de um array e o retorna")
console.log(lista_compras.pop())

//TESTE DO PUSH
console.log("Push adiciona um elemento para o array sendo ele o ultimo da lista e retorna o tamanho do array")
console.log(lista_compras.push('desodorante')) 

//TESTE DO SHIFT
console.log("Shift remove o primeiro elemento de um array e o retorna")
console.log(lista_compras.shift())

//TESTE DO UNSHIFT
console.log("Unshift adiciona um elemento no inicio do array e retorna o tamanho do array")
console.log(lista_compras.unshift('macarrão'))


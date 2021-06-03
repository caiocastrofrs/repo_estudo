let lista_compras = ['sabonete','shampoo','alvejante','detergente','arroz','pasta de dente','papel higiênico']

//TESTE DO JOIN
console.log("Join retorna todos elementos de um array em formato de string e separados por algum caractere que no caso é um traço")
console.log(lista_compras.join(" - "))

//TESTE DO POP
console.log("Pop remove o ultimo elemento de um array e o retorna")
console.log(lista_compras.pop())

//TESTE DO PUSH
console.log("Push adiciona um elemento para o array sendo ele o ultimo da lista e retorna a sua posição")
console.log(lista_compras.push('desodorante'))

//TESTE DO SHIFT
console.log("Shift remove o primeiro elemento de um array e o retorna")
console.log(lista_compras.shift())

//TESTE DO UNSHIFT
console.log("Unshift adiciona um elemento no inicio do array e retorna a sua posição")
console.log(lista_compras.unshift('macarrão'))
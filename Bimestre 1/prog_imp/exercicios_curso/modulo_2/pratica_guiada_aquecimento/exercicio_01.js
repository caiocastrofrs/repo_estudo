const prod = require('./produtos')

let valorTotal = 0;
let carrinho = prod.produtos.filter((el) => 
{
    if (el.valor_produto >= 482 && el.valor_produto <= 1600 && el.qualidade_produto > 60)
    {
        return el
    }
})

carrinho.forEach((prod) =>
{
    valorTotal += prod.valor_produto
    console.log("Produto: " + prod.nome_produto)
    console.log("Valor: " + prod.valor_produto)
})
console.log("valor total: " + valorTotal)
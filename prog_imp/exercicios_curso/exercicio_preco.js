//Array que armazena os preços de compra
let produtos_preco = [280, 330, 1500, 3300, 150]
//Array que vai armazena os preços de venda
let preco_final = []
//Função que calcula o preço final
let calcular_preco_final = produtos => 
{
    preco_final = ( produtos.map(function (elemento) { return elemento * 1.5}))
}
//Invocando a função que calcula o preço final
calcular_preco_final(produtos_preco)
//Printa o array de preços de compra
console.log(produtos_preco)
//Printa o array de preço final
console.log(preco_final)
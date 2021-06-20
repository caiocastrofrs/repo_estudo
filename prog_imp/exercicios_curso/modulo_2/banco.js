function Conta(numero_conta, saldo, nome_titular,)
{
    this.numero_conta = numero_conta,
    this.saldo = saldo,
    this.nome_titular = nome_titular
    /* this.deposito = function (dinheiro)
    {
        this.saldo+= dinheiro
        console.log("Tipo de transação: Depósito\n" + "Novo saldo: " + this.saldo)
    },
    this.saque = function (dinheiro)
    {
        if (dinheiro > this.saldo)
        {
            console.log("Fundos Insuficientes")
        }
        else
        {
            this.saldo-=dinheiro
            console.log("Tipo de transação: Saque\n" + "Novo saldo: " + this.saldo)
        }
    }  */
}
Conta.prototype.deposito = function(dinheiro)
{
    this.saldo+= dinheiro
    console.log("Tipo de transação: Depósito\n" + "Novo saldo: " + this.saldo)
}
Conta.prototype.saque = function(dinheiro)
{
    if (dinheiro > this.saldo)
    {
        console.log("Fundos Insuficientes")
    }
    else
    {
        this.saldo-=dinheiro
        console.log("Tipo de transação: Saque\n" + "Novo saldo: " + this.saldo)
    }   
}

let caio = new Conta(123,100,'Caio')
let adso = new Conta(321,200,'Adso')
let diego = new Conta(231,300,'Diego')
let icaro = new Conta(312,400,'Icaro')

console.log(caio.saldo)
caio.deposito(100)
caio.saque(200)
console.log(adso.saldo)
adso.deposito(100)
adso.saque(200)



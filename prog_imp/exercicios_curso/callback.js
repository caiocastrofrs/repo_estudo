//Função soma,subtrai,divisão e multiplica
let soma = (numero1,numero2) => numero1 + numero2;
let subtrai = (numero1,numero2) => numero1 - numero2;
let divisao = (numero1,numero2) => {
    if (numero1 == 0 || numero2 == 0)
    {
        console.log("não é possivel dividir");
    }
    else 
    {
        return numero1 / numero2;
    }
}
let multiplica = (numero1,numero2) => numero1 * numero2;
//função calculadora
let calculadora = (numero1,numero2,operacao) => operacao(numero1,numero2);

console.log(calculadora(20,20,multiplica))


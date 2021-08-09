
module.exports.somar = (a,b) => a+b;
module.exports.subtrair = (a,b) => a-b;
module.exports.dividir = (a,b) => 
{
    if (a == 0 || b == 0)
    {
        console.log("impossivel dividir")
    }
    else 
    {
        return a / b
    }
};
module.exports.multiplicar = (a,b) => a*b;


//Faça um script que leia três números e mostre-os em ordem decrescente.
let inteiro1 = 0.3
let inteiro2 = 0.1
let inteiro3 = 0.2

if (inteiro1 > inteiro2 && inteiro3)
{
    inteiro2 > inteiro3 ? console.log(inteiro1,inteiro2,inteiro3): console.log(inteiro1,inteiro3,inteiro2)
}
else if(inteiro2 > inteiro3)
{
    inteiro3 > inteiro1 ? console.log(inteiro2,inteiro3,inteiro1): console.log(inteiro2,inteiro1,inteiro3)
}
else 
{
    inteiro1 > inteiro2 ? console.log(inteiro3,inteiro1,inteiro2): console.log(inteiro3,inteiro2,inteiro1)
}
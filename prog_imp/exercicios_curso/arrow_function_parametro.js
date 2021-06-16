let FizzBuzz = (numero1,numero2) => 
{


    let numero_1_ao_100 = (numero) => 
    {
        
        numero++

         if (numero%numero1 == 0 && numero%numero2 == 0)
         {
             console.log("FizzBuzz" + " numero: " + numero)
         }
         else if (numero%numero1 == 0)
         {
             console.log("Fizz" + " multiplo de " + numero1 + " numero: " + numero)
         }
         else if (numero%numero2 == 0)
         {
             console.log("Buzz" + " multiplo de "+ numero2 + " numero: " + numero)
         }
        if (numero < 100 )
        {

            numero_1_ao_100(numero)
        }
    
    }

    numero_1_ao_100(0)
    
}

FizzBuzz(3,7)

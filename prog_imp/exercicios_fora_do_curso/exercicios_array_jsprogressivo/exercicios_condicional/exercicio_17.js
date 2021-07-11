const numeros = [326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7, 16]

const qntd_cdu = numeros =>
{
    numeros.forEach(el =>
    {
        if(el > 99)
        {
            console.log(el + ' tem ' + el[0] + ' centenas ' + el[1] + 'dezenas ' + el[2] + ' unidades');
        }
        else if(el < 100)
        {
            console.log(el + ' tem ' + el[0] + ' dezenas\n' + el[1] + ' unidades');    
        }
        else 
        {
            console.log('valor invalido')
        }
    });
};

qntd_cdu(numeros);
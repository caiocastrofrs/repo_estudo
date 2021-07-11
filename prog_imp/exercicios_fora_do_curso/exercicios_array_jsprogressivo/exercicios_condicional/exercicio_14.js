//Faça um script que peça um número correspondente a um determinado ano
//e em seguida informe se este ano é ou não bissexto.

const anos = [1500,1600,1700,1800,1900,2000,2100,2004,2008,2012,2016,2020,2024,2028,2032,2036,2040,2044,2048,2052,2056,2060]

const anoBissexto = (array) =>
{
    array.forEach(el => 
    {
        if (el % 4 == 0 && el % 100 != 0 || el % 400 == 0)
        {
            console.log(el + ' é bissexto');
        }
        else 
        {
            console.log(el + ' não é bissexto');
        };
    });
};

anoBissexto(anos)
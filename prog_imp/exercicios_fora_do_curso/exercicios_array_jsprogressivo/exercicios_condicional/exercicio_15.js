//15. Faça um script que peça uma data no formato dd/mm/aaaa 
//e determine se a mesma é uma data válida.

let data = "11/11/1999"

const checarData = data =>
{

    if (parseInt(data.slice(0,2)) <= 31 && parseInt(data.slice(3,5)) <= 12)
    {
        console.log('Data valida');
    }
    else 
    {
        console.log('Data invalida');
    };
};
checarData(data)
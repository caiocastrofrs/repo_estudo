/* Em um parque de diversões nos pedem um programa para verificar se os passageiros da montanha-russa podem entrar no brinquedo.

Crie uma função podeSubir() que receba dois parâmetros: 
altura da pessoa;
se está acompanhada.

Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode subir ou não, baseado nas seguintes condições:
A pessoa deve medir mais de 1.40m e menos de 2 metros.
Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
Se a pessoa medir menos de 1.20m, não poderá subir, nem acompanhada.

Modifique a função podeSubir(), de modo que ela exiba uma mensagem de autorização ou de impedimento no acesso ao brinquedo dependendo se a pessoa se enquadra ou não nas condições do exercício anterior. Por exemplo:
Em caso de autorização, exiba a mensagem: “Acesso autorizado” ou “Acesso autorizado somente com acompanhante”;
Em caso de impedimento, exiba a mensagem: “Acesso negado.”
 */

function podeSubir(altura,estaAcompanhado)
{
    if(altura > 1.4 && altura < 2)
    {
        console.log("Pode subir!");
    }
    else if(altura <= 1.4 && altura > 1.2 && estaAcompanhado == true)
    {
        console.log("Pode subir com acompanhante!");
    }
    else if(altura <= 1.2)
    {
        console.log("Não pode subir!");
    }
    else
    {
        console.log("Não pode subir!");
    }
}
podeSubir(1.42,true);
podeSubir(1.42,false);
podeSubir(1.10,true);
podeSubir(1.10,false);
podeSubir(1.30,true);
podeSubir(1.30,false);
podeSubir(2,true);
podeSubir(2,false);
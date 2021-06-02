var altura = 1.83;
var estaAcompanhada = true;

function podeSubir(alt,estaAcom)
{
    if(alt > 1.4 && alt < 2)
    {
        console.log("Pode subir!");
    }
    else if(alt < 1.4 && alt > 1.2 && estaAcom == true)
    {
        console.log("Pode subir com acompanhante!");
    }
    else if(alt <1.2)
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

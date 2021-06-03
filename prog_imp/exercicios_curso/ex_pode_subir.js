
function podeSubir(altura,estaAcompanhado)
{
    if(altura > 1.4 && altura < 2)
    {
        console.log("Pode subir!");
    }
    else if(altura < 1.4 && altura > 1.2 && estaAcompanhado == true)
    {
        console.log("Pode subir com acompanhante!");
    }
    else if(altura <1.2)
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

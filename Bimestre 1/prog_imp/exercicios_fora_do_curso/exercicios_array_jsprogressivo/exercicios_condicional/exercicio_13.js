/*
 Faça um script que calcule as raízes de uma equação do segundo grau, 
 na forma ax² + bx + c. O script deverá pedir os valores de a, b e c e 
 fazer os testes necessários.
*/
const [a,b,c] = [4,-4,1];

let delta = 0;

const calcularDelta = (a,b,c) => 
{
    delta = (b * b) - 4 * a * c;
    return delta;
};

const checarRaiz = (a,b,delta) =>
{
    if (delta > 0)
    {
        delta = Math.sqrt(delta);
        let x1 = (-b + delta) / (2 * a);
        let x2 = (-b - delta) / (2 * a);
        return [x1,x2];
    }
    else if (delta == 0)
    {
        delta = Math.sqrt(delta);
        let x = (-b + delta) / (2 * a);
        return x;
    }
    else if (delta < 0)
    {
        console.log('Delta negativo, não existe raízes reais');
    };
    
};

console.log(checarRaiz(a,b,calcularDelta(a,b,c)));

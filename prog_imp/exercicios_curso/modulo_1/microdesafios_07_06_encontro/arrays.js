/* O líder técnico da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:
Criar um arquivo arrays.js que contenha o código:
let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"]

Verificamos se tudo funciona bem se solicitarmos o segundo elemento do array e for "clube da luta".
No mesmo arquivo, coloque todos os elementos em letras MAIÚSCULAS utilizando  .toUpperCase() para cada elemento.
Enquanto trabalhava no exercício 2, descobrimos que também há outro array no código, mas com filmes animados. 
let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"]


No mesmo arquivo, crie este array e uma função que adiciona cada elemento do array de desenhos animados (cartoons) ao array de filmes. 
Um dos desenvolvedores avisou que a última animação é na verdade um jogo, então remova esse último elemento do array de desenhos animados (cartoons) antes de passá-los para os filmes.
Por fim, eles nos enviam dois arrays com as avaliações feitas por diferentes usuários do mundo desses filmes, da seguinte forma:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9]; 


Eles nos pedem para criar uma função que compare as notas e nos diga se elas são iguais ou diferentes. Eles confirmam que estão na respectiva ordem e que trazem apenas valores numéricos de 1 a 10.
Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções e testar seu funcionamento correto.

Se chegarmos a este ponto e tudo estiver bem, o líder técnico da equipe deve estar extremamente feliz com nosso trabalho e desempenho. Bom trabalho!
 */
let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"]
let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"]

for (let i = 0; i < filmes.length; i++)
{
    filmes[i] = filmes[i].toUpperCase();
    if (cartoons[i] == 'fortnite')
    {
        cartoons.pop();
    }
}
filmes.push(...cartoons);
console.log(filmes)

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9]; 

for (let i = 0; i < asiaScores.length; i++)
{
    if(asiaScores[i] == euroScores[i])
    {
        console.log('iguais');
    }
    else
    {
        console.log('diferentes');
    }
}

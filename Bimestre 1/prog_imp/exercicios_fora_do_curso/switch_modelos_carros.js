modelo_carro = "caminhonete";

switch (modelo_carro){
    case "hatch":
        console.log("Compra efetuada com sucesso!");
        break;
    case "sedan":
    case "motocicleta":
    case "caminhonete":
        console.log("Tem certeza de que quer este modelo?");
        break;
    default:
        console.log("Não trabalhamos com este tipo de automóvel aqui")
}




function dividir(n1,n2){
    if(n1 == 0 || n2 == 0){
        console.log("Não se pode dividir por zero");
    }
    else {
        return n1/n2;
    }
}
module.exports = dividir;
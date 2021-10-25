package QualidadeProduto;

public class Embalagem extends Handler{

    public void verificar(Artigo a) {
        if((a.getEmbalagem().equalsIgnoreCase("saudavel")) || (a.getEmbalagem().equalsIgnoreCase("quase saudavel"))) {
            this.getSeguinte().verificar(a);
        } else {
            System.out.println("Produto rejeitado em Embalagem");
        }
    }
}

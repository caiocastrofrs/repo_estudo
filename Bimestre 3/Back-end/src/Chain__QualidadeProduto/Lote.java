package Chain__QualidadeProduto;

public class Lote extends Handler{

    public void verificar(Artigo a) {
        if(a.getLote() >= 1000 && a.getLote() <= 2000) {
            this.getSeguinte().verificar(a);
        } else {
            System.out.println("Produto rejeitado em Lote");
        }
    }
}

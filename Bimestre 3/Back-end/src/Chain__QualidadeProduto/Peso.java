package QualidadeProduto;

public class Peso extends Handler{

    public void verificar(Artigo a) {
        if(a.getPeso() >= 1200 && a.getPeso() <= 1300) {
            this.getSeguinte().verificar(a);
        } else {
            System.out.println("Produto rejeitado em Peso");
        }
    }
}

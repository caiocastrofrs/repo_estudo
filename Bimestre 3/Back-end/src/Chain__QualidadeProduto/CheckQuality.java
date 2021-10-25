package QualidadeProduto;

public class CheckQuality {

    Handler initial;

    public CheckQuality() {
        this.initial = new Lote();
        Handler peso = new Peso();
        Handler embalagem = new Embalagem();

        initial.setSeguinteManipulador(peso);
        peso.setSeguinteManipulador(embalagem);
    }

    public void verificar(Artigo a) {
        initial.verificar(a);
    }
}

package Chain__QualidadeProduto;

public abstract class Handler {

    protected Handler seguinteManipulador;

    public Handler getSeguinte() {
        return this.seguinteManipulador;
    }

    public void setSeguinteManipulador(Handler s) {
        this.seguinteManipulador = s;
    }

    public abstract void verificar(Artigo a);
}

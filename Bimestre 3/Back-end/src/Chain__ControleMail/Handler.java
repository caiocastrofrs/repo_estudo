package ControleMail;

public abstract class Handler {
    protected Handler seguinteManipulador;

    public Handler getSeguinte() {
        return this.seguinteManipulador;
    }

    public void setSeguinteManipulador(Handler s) {
        this.seguinteManipulador = s;
    }

    public abstract void verificar(Mail eMail);
}

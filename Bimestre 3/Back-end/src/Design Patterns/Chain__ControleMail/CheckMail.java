package Chain__ControleMail;

public class CheckMail {

    Handler initial;

    public CheckMail() {
        this.initial = new DepartamentoGerencial();
        Handler tecnico = new DepartamentoTecnico();
        Handler comercial = new DepartamentoComercial();
        Handler spam = new HandlerSpam();

        initial.setSeguinteManipulador(tecnico);
        tecnico.setSeguinteManipulador(comercial);
        comercial.setSeguinteManipulador(spam);
    }

    public void verificar(Mail eMail) {
        initial.verificar(eMail);
    }
}

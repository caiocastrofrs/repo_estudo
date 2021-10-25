package ControleMail;

public class ProcessaMail {

    public static void main(String[] args) {
        CheckMail check = new CheckMail();
        check.verificar(new Mail("caio@castro.com","tecnico@colmeia.com","teste"));
        check.verificar(new Mail("caio@castro.com","comercial@colmeia.com","comercial"));
        check.verificar(new Mail("caio@castro.com","gerencia@colmeia.com","importante!"));
        check.verificar(new Mail("caio@castro.com","hehe@colmeia.com","spam"));

    }
}

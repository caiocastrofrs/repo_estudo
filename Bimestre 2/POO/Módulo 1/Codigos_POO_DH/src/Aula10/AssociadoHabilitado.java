package Aula10;

public class AssociadoHabilitado extends Associado{
    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numero, String nome, String atividade, double valor, double custoPiscina) {
        super (numero,nome, valor, atividade);
        this.custoPiscina = custoPiscina;
    }

    @Override
    public double custoMensal() {
        if(this.habilitado) {
            return super.custoMensal() + this.custoPiscina;
        } else {
            return super.custoMensal();
        }
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}

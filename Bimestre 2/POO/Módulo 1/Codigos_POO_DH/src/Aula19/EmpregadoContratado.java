package Aula19;

public class EmpregadoContratado  extends  Empregado{
    private double imposto;
    private double valorPorHora;

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public EmpregadoContratado(){}
    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double imposto, double valorPorHora) {
        super(nome, sobrenome, arquivo);
        this.imposto = imposto;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calcularSalario() {
        return this.imposto * this.valorPorHora;
    }

}

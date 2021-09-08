package Banco;

public class Poupanca extends Conta{
    private double taxaJuros;

    public Poupanca(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public double cobrarJuros() {
        double rendimento = getSaldo()*taxaJuros;
        depositar(rendimento);
        return rendimento;
    }
}

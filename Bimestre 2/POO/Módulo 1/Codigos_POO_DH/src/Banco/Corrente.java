package Banco;

import java.util.Date;

public class Corrente extends Conta{
    private double valorAutorizado;

    public Corrente(double saldo, double valorAutorizado) {
        super(saldo);
        this.valorAutorizado = valorAutorizado;
    }

    public void depositarCheques(double valor, String bancoEmissor, Date data) {
        setValor(valor);
        setBancoEmissor(bancoEmissor);
        setDataPagamento(data);
    }

    @Override
    public void sacar(double valor) {
        if(valor < getSaldo()) {
            setSaldo(valor);
        } else if(valor > getSaldo() + this.valorAutorizado) {
            System.out.println("Valor inserido inválido");
        } else {
            double valorAux = getSaldo() + this.valorAutorizado - valor;
            setSaldo(0);
            this.valorAutorizado = valorAux;
        }
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "valorAutorizado=" + valorAutorizado +
                '}';
    }
}

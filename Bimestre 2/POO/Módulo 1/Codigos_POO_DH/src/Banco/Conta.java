package Banco;

public abstract class Conta extends Cheque{
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito bem sucedido!");
        } else {
            System.out.println("Valor inserido é inválido");
        }
    }

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo-=valor;
            System.out.println("Saque bem sucedido!");
        } else {
            System.out.println("Valor inserio é inválido");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

}

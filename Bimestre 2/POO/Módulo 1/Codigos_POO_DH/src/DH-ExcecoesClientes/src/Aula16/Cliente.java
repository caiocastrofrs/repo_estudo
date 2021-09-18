package Aula16;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        saldoEmConta=0;

    }
    public void comprar(double valor) throws ClienteException
    {
        if(valor > (saldoEmConta + limite)) {
            throw new ClienteException("Saldo insuficiente!");
        }else {
            saldoEmConta -= valor;
        }
    }
    public void pagarDivida(double valor) throws ClienteException
    {
        if(saldoEmConta > 0) {
            throw new ClienteException("Vocè não tem divida");
        }else
            saldoEmConta+=valor;
    }

    @Override
    public String toString() {
        return "Aula16.Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}
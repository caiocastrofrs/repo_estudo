package Banco;

public class Cliente{
    private String numCliente;
    private String nome;
    private String rg;
    private String cpf;

    public Cliente(String numCliente, String nome, String rg, String cpf) {
        this.numCliente = numCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numCliente='" + numCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

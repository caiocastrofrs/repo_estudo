package Aula12;

public class Gerente extends Funcionario {
    private double salario;

    public Gerente(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    @Override
    public void pagamento() {
        this.salario = this.salario * 1.1;
        System.out.println("Seu pagamento será: " + this.salario);
    }
}

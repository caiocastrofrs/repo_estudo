package Aula12;

public class Secretaria extends Funcionario{

    private double salario;

    public Secretaria(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public void pagamento() {
        System.out.println("Seu pagamento será: " + this.salario);
    }
}

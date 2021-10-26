package TemplateMethod__pagamentoSalario.company;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Efetivo(
                "Caio","Castro","123456",
                6000.0,850.0, 2500);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Jennifer","Mayumi","123",350.0,150);
        funcionario.pagamentoSalario();
    }
}

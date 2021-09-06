package Aula12;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH ", "1544464");
        Funcionario funcionario1 = new Gerente("Carlindo", "Júnior",
                "8484616", 10.000);
        Funcionario funcionario2 = new Vendedor("José", "Filho",
                "0255", 2.000, 500);

        dh.cadastrar(funcionario1);
        dh.cadastrar(funcionario2);

        dh.listar();
        System.out.println(dh);


    }
}

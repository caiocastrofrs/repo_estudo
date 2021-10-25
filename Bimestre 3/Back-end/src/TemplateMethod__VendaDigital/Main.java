package VendaDigital;

public class Main {
    public static void main(String[] args) {
        Funcionario caio = new Funcionario("caio");
        caio.vender();
        caio.addAnoEmpresa();
        caio.obterAfiliado();
        caio.mostrarCategoria();

        Afiliado pedro = new Afiliado("pedro");
        pedro.vender();
        pedro.vender();
        pedro.vender();
        pedro.mostrarCategoria();

        Estagiario wheslley = new Estagiario("wheslley");
        wheslley.vender();
        wheslley.vender();
        wheslley.vender();
        wheslley.vender();
        wheslley.mostrarCategoria();
    }
}

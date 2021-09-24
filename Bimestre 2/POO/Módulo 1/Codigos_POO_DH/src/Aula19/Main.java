package Aula19;

public class Main {
    public static void main(String[] args) {
        Empresa dh = new Empresa("627382");
        EmpregadoFactory factory = EmpregadoFactory.getInstance();
        dh.addEmpregado(factory.criarEmpregado("C").setNome("Caio"));
        dh.addEmpregado(factory.criarEmpregado("R"));
        System.out.println(dh.getListaEmpregados());
    }
}

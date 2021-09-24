package Aula19_Async;

public class Principal {
    public static void main(String[] args) {
        FabricaDeCarro fabCarros = FabricaDeCarro.getInstance();

        System.out.println(fabCarros.criarCarroFiat());
        System.out.println(fabCarros.criarCarroFord());
        System.out.println(fabCarros.criarCarroVolks());
        System.out.println(fabCarros.criarCarroFiat());
        System.out.println(fabCarros.criarCarroFord());
        System.out.println(fabCarros.criarCarroVolks());
        System.out.println(fabCarros.criarCarroFiat());
        System.out.println(fabCarros.criarCarroFord());
        System.out.println(fabCarros.criarCarroVolks());
        System.out.println(fabCarros.gerarRelatorio());
    }
}

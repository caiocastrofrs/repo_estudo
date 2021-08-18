package Aula05;

public class Principal {
    public static void main(String[] args) {
        Cliente caio = new Cliente(1, "Caio");
        System.out.println(caio.getNome());
        System.out.println(caio.getDivida());
        System.out.println(caio.aumentarDivida(102.23));
        System.out.println(caio.getDivida());
        System.out.println(caio.getNumeroCliente());
    }
}

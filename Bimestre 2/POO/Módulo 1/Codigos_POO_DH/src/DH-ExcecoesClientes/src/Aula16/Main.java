package Aula16;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Caio","Castro","874283123",100);

        try {
            cliente.comprar(110);
        } catch (ClienteException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        } catch (Exception e) {
        }
    }
}

package Banco;

public class Principal {
    public static void main(String[] args) {
        Cliente caio = new Cliente("123","Caio Castro","7854293","1928365");
        System.out.println(caio);
//        caio = new Poupanca(2500,200);
        System.out.println(caio);

        caio.depositar(100);
        System.out.println(caio);
    }

}

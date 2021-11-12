package Flyweight__ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory fabrica = new ComputerFactory();
        Computer pc1 = fabrica.getComputer(2,128);
        Computer pc2 = fabrica.getComputer(4,256);
        Computer pc3 = fabrica.getComputer(8,512);
        Computer pc4 = fabrica.getComputer(16,1024);
        fabrica.getComputerList();
    }

}

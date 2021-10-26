package Flyweight__ComputerFactory;

public class Computer {
    private int ram;
    private int disco;

    public Computer(int ram, int disco) {
        super();
        this.ram = ram;
        this.disco = disco;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram = " + ram +
                ", disco = " + disco +
                '}';
    }
}

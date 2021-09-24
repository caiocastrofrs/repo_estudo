package Pacientes.Tamagochi;

public class Sede implements EstadoTamagochi{

    private Tamagochi t;

    public Sede(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void beber() {
        System.out.println("Tava na hora!!");
    }

    @Override
    public void comer() {
        System.out.println("To com sede!!");
    }

    @Override
    public void carinho() {
        System.out.println("To com sede!!");
    }
}

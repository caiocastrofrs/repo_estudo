package Tamagochi;

public class Triste implements EstadoTamagochi{

    private Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void beber() {
        System.out.println("Beep...Beep...Beep...*Pisca*...");
    }

    @Override
    public void comer() {
        System.out.println("Beep...Beep...D-:");
    }

    @Override
    public void carinho() {
        t.setEstado(new Feliz(t));
    }
}

package Pacientes.Tamagochi;

public class Feliz implements EstadoTamagochi{

    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
    }
    @Override
    public void beber() {
        System.out.println("Beep Beep Beep Beep Beep");
        t.setEstado(new Fome(t));
    }

    @Override
    public void comer() {
        System.out.println("Tô comendo feliz");
    }

    @Override
    public void carinho() {
        System.out.println("Recebendo carinho...feliz");
    }
}

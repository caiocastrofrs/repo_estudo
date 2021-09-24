package Pacientes.Tamagochi;

public class Fome implements EstadoTamagochi{

    private Tamagochi t;

    public Fome(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void beber() {
        System.out.println("Estou com fome cara!!");
    }

    @Override
    public void comer() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("Tô com fome!!");
    }
}

package Tamagochi;

public class Tamagochi implements EstadoTamagochi{

    private EstadoTamagochi estado;

    public EstadoTamagochi getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoTamagochi estado) {
        this.estado = estado;
    }

    public Tamagochi() {
        this.estado = new Feliz(this);
    }
    @Override
    public void beber() {
        this.estado.beber();
    }

    @Override
    public void comer() {
        this.estado.comer();
    }

    @Override
    public void carinho() {
        this.estado.carinho();
    }
}

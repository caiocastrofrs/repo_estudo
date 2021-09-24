package Pacientes.Tamagochi;

public class Principal {
    public static void main(String[] args) {

        Tamagochi pepo = new Tamagochi();

        System.out.println(pepo.getEstado().getClass());
        pepo.beber();
        pepo.comer();
        pepo.carinho();
        System.out.println("\n");
        pepo.setEstado(new Triste(pepo));
        System.out.println(pepo.getEstado().getClass());
        pepo.beber();
        pepo.comer();
        pepo.carinho();
        System.out.println("\n");
        pepo.setEstado(new Fome(pepo));
        System.out.println(pepo.getEstado().getClass());
        pepo.beber();
        pepo.comer();
        pepo.carinho();
        System.out.println("\n");
        pepo.setEstado(new Sede(pepo));
        System.out.println(pepo.getEstado().getClass());
        pepo.beber();
        pepo.comer();
        pepo.carinho();
    }
}

package Aula10;

public class Principal {
    public static void main(String[] args) {
        Associado associado = new Associado("123","Caio",50.00,"Taekwondo");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("456","Caio Castro","Natação",50.00,25.00);
        associadoHabilitado.setHabilitado(true);
        System.out.println(associadoHabilitado.custoMensal());
    }
}

package Aula21;

public class Principal {
    public static void main(String[] args) {
        Reparo liquidificador = new Reparo("Liquidificador","Rua praia");
//        liquidificador.setEstado(new Reparacao(liquidificador));
        System.out.println(liquidificador.toString());
        liquidificador.darOrcamento();
        System.out.println(liquidificador.toString());
        liquidificador.setEstado(new Reparacao(liquidificador));
        liquidificador.addItensExtra();
        System.out.println(liquidificador.toString());
        liquidificador.setEstado(new ParaEnvio(liquidificador));
        liquidificador.mudarEndereco();
        System.out.println(liquidificador.toString());
    }
}

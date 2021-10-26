package Proxy__ProxyFilmes;

public class Usuario {
    public static void main(String[] args) {
        GradeFilmeProxy proxy = new GradeFilmeProxy(new GradeFilmes());
        proxy.setIp(new Ip(149,23,15,18));

        try {
            System.out.println(proxy.getFilme("Homem Aranha").getLink());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getFilme("Colombiano em busca de vingança").getLink());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }
    }
}

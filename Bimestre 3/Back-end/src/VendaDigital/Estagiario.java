package VendaDigital;

public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public int calcularPontos() {
        int pontos = 0;
        pontos += 5 * getQntdVendas();
        setPontos(pontos);
        return pontos;
    }
}
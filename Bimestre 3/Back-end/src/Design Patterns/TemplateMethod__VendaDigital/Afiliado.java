package TemplateMethod__VendaDigital;

public class Afiliado extends Vendedor{

    public Afiliado(String nome) {
        super(nome);
    }

    @Override
    public int calcularPontos() {
        int pontos = 0;
        pontos += 15 * getQntdVendas();
        setPontos(pontos);
        return pontos;
    }
}

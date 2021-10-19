package VendaDigital;

public class Funcionario extends Vendedor{

    private int qntdAnoEmpresa;
    private int qntdAfiliados;

    public Funcionario(String nome) {
        super(nome);
    }

    public void obterAfiliado() {
        this.qntdAfiliados++;
    }

    public void addAnoEmpresa() {
        this.qntdAnoEmpresa++;
    }

    @Override
    public int calcularPontos() {
        int pontos = 0;

        pontos += 10 * this.qntdAfiliados;
        pontos += 5 * getQntdVendas();
        pontos += 5 * this.qntdAnoEmpresa;
        setPontos(pontos);
        return pontos;
    }
}
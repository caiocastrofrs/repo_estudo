package TemplateMethod__VendaDigital;

public abstract class Vendedor {

    private String categoria;
    private String nome;
    private int pontos;
    private int qntdVendas;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }
    public int getQntdVendas() {
        return qntdVendas;
    }
    public void setQntdVendas(int qntdVendas) {
        this.qntdVendas += qntdVendas;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarCategoria() {
        this.pontos += calcularPontos();
        if(this.getClass() == Estagiario.class) {
            if(this.pontos < 50) {
                setCategoria("estagiário novato");
            } else {
                setCategoria("estagiário experiente");
            }
        } else {
            if (this.pontos < 20) {
                setCategoria("Novato");
            } else if (this.pontos <= 30) {
                setCategoria("Aprendiz");
            } else if (this.pontos <= 40) {
                setCategoria("Bom");
            } else {
                setCategoria("Mestre");
            }
        }
        System.out.println("Nome: " + this.nome + "\nCategoria: " + this.categoria);
    }

    public abstract int calcularPontos();

    public void vender() {
        setQntdVendas(1);
    }
}

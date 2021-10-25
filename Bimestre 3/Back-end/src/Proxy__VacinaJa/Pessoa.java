package VacinaJa;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String rg;
    private String nomeVacina;
    private Date data;

    public Pessoa(String nome, String sobrenome, String rg, String nomeVacina, Date data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.nomeVacina = nomeVacina;
        this.data = data;
    }

    public Object[] dados() {
        Object[] informacao = new Object[2];

        informacao[0] = this.rg;
        informacao[1] = this.data;

        return informacao;
    }

}

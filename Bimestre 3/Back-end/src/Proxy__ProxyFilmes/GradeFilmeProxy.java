package Proxy__ProxyFilmes;

public class GradeFilmeProxy implements IGradeFilmes{

    private GradeFilmes grade;
    private Ip ip;

    public Ip getIp() {
        return this.ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public GradeFilmeProxy(GradeFilmes grade) {
        this.setGrade(grade);
    }

    public void setGrade(GradeFilmes grade) {
        this.grade = grade;
    }
    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException{
        Filme filme = grade.getFilme(nomeFilme);
        if(! (getIp().getPais().equalsIgnoreCase(filme.getPais()))) {
            throw new FilmeNaoHabilitadoException(nomeFilme + " não disponível em " + getIp().getPais());
        }
        return filme;
    }
}

package Aula21;

public class ParaEnvio implements Estado{

    private Reparo reparo;

    public ParaEnvio(Reparo reparo){
        this.reparo = reparo;
    }
    @Override
    public void mudarEndereco() {
        this.reparo.setEndereco("Rua da tristeza");
    }
    @Override
    public void darOrcamento() {
        System.out.println("Não pode inserir Orçamento!");
    }

    @Override
    public void addItensExtra() {
        System.out.println("Não pode inserir itens!");
    }

    @Override
    public void proximoEstado() {
        this.reparo.setEstado(new Finalizado(reparo));
        System.out.println(this.reparo.toString());
    }

}

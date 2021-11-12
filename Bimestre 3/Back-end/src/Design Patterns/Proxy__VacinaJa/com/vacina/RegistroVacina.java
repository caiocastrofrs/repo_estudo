package Proxy__VacinaJa.com.vacina;

public class RegistroVacina implements IRegistro{

    @Override
    public void registrar(Object[] dados) {
        System.out.println("Foi registrado o RG " + dados[0] + " e na data " + dados[1].toString());
    }
}

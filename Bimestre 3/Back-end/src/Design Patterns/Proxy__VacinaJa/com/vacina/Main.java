package Proxy__VacinaJa.com.vacina;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,9,21);
        Date date = calendar.getTime();
        Proxy__VacinaJa.Pessoa pessoa = new Proxy__VacinaJa.Pessoa("Caio", "Castro","123456789","Pfizer", date);
        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
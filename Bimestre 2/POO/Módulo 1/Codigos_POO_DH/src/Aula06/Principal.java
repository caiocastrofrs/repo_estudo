package Aula06;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Impressora impressora = new Impressora("Epson","wifi", LocalDate.of(2021,8,10));
        System.out.println(impressora.getDataFabricacao());
    }


}

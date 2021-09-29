package Cursos;

public class Main {
    public static void main(String[] args) {
        Frontend frontend = new Frontend("Frontend",2,16,1000.00);
        Backend backend = new Backend("Backend",2,20,900.00);
        Fullstack fullstack = new Fullstack("Fullstack","curso");
        fullstack.addCurso(frontend);
        fullstack.addCurso(backend);
        System.out.println(frontend.getRelatorio());
        System.out.println(backend.getRelatorio());
        System.out.println(fullstack.getRelatorio());
    }
}

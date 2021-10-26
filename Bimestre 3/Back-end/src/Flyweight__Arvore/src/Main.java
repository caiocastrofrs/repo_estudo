public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        Floresta floresta = new Floresta();
        for(int i = 0; i <= 1000000; i++) {
            floresta.plantarArvore(i,"Ornamental");
        }
//        floresta.plantarArvore(2,"Frutifera");
//        floresta.plantarArvore(3,"Frutifera");
//        floresta.plantarArvore(4,"Ornamental");
//        floresta.plantarArvore(5,"Florifera");
//        floresta.plantarArvore(5,"Florifera");
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}

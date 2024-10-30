public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println(resultado);

        System.out.println(rec.sumaconsecutivos(5));
        System.out.println(rec.SumaDigitos(456));
        
        
        System.out.println(rec.fibonacinaci(1));
        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.RenombrarDirectorios("src/Main.java");
        rd.RenombrarDirectorios ("src/directorios");

    }

}

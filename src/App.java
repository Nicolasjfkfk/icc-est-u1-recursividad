
public class App {
    public static void main(String[] args) throws Exception {
       Recursividad rec = new Recursividad();
       int resultado = rec.factorial(5);
       System.out.println(resultado);

       System.out.println(rec.sumaConsecutivos(5));

       System.out.println(rec.potencial( 2, 3));

       System.out.println(rec.contarDigitos(456));

       System.out.println(rec.fibonacci(8));

       RenombrarDirectorios rd = new RenombrarDirectorios();
       rd.RenombrarDirectorios("src/directorios");
    }
}

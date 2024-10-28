public class Recursividad {

    public int factorial (int n){
        System.out.println("CALCULANDO EL FACTORIAL DE: "+ n);
        //CASO BASE: 0! Y 1! SON IGUALES A 1
        if (n == 0 || n ==1){
            System.out.println("CASO BASE ALCANZADO EL FACTORIAL DE " + n + " es 1");
            return 1; 
        }
        int resultado = n * factorial(n-1);
        System.out.println("EL RESULTADO PARCIAL PARA "+n+" * factorial("+(n-1)+")= " +resultado);
        return resultado;
       // return n * factorial(n - 1);
    }
      // CALCULAR LA SUMA DE LOS NUMEROS CONSECUTIVOS
      // n = 5 resultado = 5+4+3+2+1+= 15
    public int sumaConsecutivos(int n){
        //Caso base
        if (n ==1){
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }  

       // CALCULAR LA POTENCIA DE NUMERO

       public int potencial(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencial(base, exponente - 1);
    }
    
    
    //CREAR UN METODO QUE SUME LOS DIGITOS DE UN NUMERI 
    //SI MANDA 456 SEA IGUAL A 15
    // 4+ 5 + 6 = 15
    // PISTA SE USA UN % MOD
    
    public int contarDigitos(int numero) {
        if (numero == 0) {
            return 0; 
        } 
         return (numero % 10) + contarDigitos(numero / 10);
    }
    
}

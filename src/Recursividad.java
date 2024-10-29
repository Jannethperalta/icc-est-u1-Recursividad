public class Recursividad {
    public int  factorial ( int n){
        // caso base; n sea 0! y el 1 ! son iguales a 1 
        if(n == 0 || n==1){
            System.out.println("caso base alcanzando el factoriqal de "+n+" es 1");
            return 1;

        } 
      // ASCII |=124
      int resultado = n *  factorial(n-1);
      System.out.println("resultado parcial para "+n+" * factorial("+(n-1)+")="+ resultado);
      return resultado;
    } 
    // calcular suma de los nuneros cobnsecutivos
    //n = 5 resultado = 5+4+3+2+1= 15
    public int sumaconsecutivos(int n) {
        // caso base 
        if(n ==1){
            return 1; 
        }
        return n + sumaconsecutivos(n-1);
        


    }
    //calcular la potencia de n numero
    public int potencia(int base, int exponente) {
        return 1;


    }
    // Crear un metodo que sume  los digitos de un numero
    /// si mando 456 sea igual  a 15
    /// pista de usa % MOD
    public int  SumaDigitos(int n){
        if (n<10) {
            return n;

            
        }
        return n %  10 + SumaDigitos(n/10);
    }


 }
import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        int suma = 0;
        int sumai = 0;
        int max = Integer.MIN_VALUE;
        
        System.out.println("Nº maximo de aleatorios a generar: " + n + "\no hasta que salga 0");
        int i = 0;
        
        // se puede hacer con un for
        
        while (i < n){ 
            int r = generador.nextInt(6001)-1000;
            if (r == 0){
                break;
            }
            
            suma += r;
            if (esImpar(r)){
                sumai += r;
            }
            if (!esImpar(r)){
                if(r > max){
                    max = r;
                }
            }
            
            if (i % 5 == 0){
                System.out.println("");
            }
            System.out.printf("%15s", r); // No se porque habria que poner el numero y los ":" 
                                          // asi que no los he puesto
            i++;
            }
        
        System.out.println("");
        System.out.println("");
        System.out.printf("%20s%10s\n","Media: ",suma/n);
        System.out.printf("%20s%10s\n","Suma Impares: ",sumai);
        System.out.printf("%20s%10s\n","Maximo pares: ",max);
        
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        while (numero % 2 != 0){
            return true;
        }
        
        
        return  false;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int sin0 = 0;
        int multi = 1;
        while (numero > 0){
            int cifra = numero % 10;
            numero /= 10;
            if(cifra != 0){
                sin0 += multi * cifra;
                multi *= 10;
            }  
        }   
        return sin0;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
        System.out.println("Letra: N - Altura: " + altura);
        escribirCaracter(CARACTER, altura);
        
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    public void escribirCaracter(char caracter, int n)    {
        String linea = "";
        for (int i = 0; i < n; i++){
            linea += caracter;
            
            for (int j = 0; j < i; j++){
                linea += ESPACIO;
            }
            linea += caracter;
            
            int cont = n - i ;
            for (int k = cont; k > 1; k--){
                linea += ESPACIO;
            }
            linea += caracter + "\n";
        }
        System.out.println(linea);
    }

}

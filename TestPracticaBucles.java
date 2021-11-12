import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 * Aimar Monreal
 */
public class TestPracticaBucles
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
                
        Scanner teclado = new Scanner(System.in);
        PracticaBucles prueba = new PracticaBucles();
        System.out.print("Cantidad maxima de aleatorios a generar: ");
        int maximos = teclado.nextInt();
        while (maximos < 0){
            System.out.print("Numero positivo por favor: ");
            maximos = teclado.nextInt();
        }
        prueba.generarNumeros(maximos);
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.print("Altura para la letra N (Entre el 3 y el 10): ");
        int altura = teclado.nextInt();
        while (altura < 3 || altura > 10){
            System.out.print("Numero incorrecto, entre el 3 y el 10 por favor: ");
            altura = teclado.nextInt();
        }
        prueba.escribirLetraN(altura);
        
        
    }
}


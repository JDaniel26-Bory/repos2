/* Hacer un programa que en una clase lea e imprima un vector de tamaño N de
números enteros y luego en otra clase cree métodos para hallar el promedio de 
los elementos del vector, el mayor elemento de las posiciones pares y la 
cantidad de múltiplos de 5  */
package herencia_vectores_uno;
import java.util.Scanner;

public class Herencia_vectores_uno {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsVector objvector=new ClsVector();
        float prom;
        int n,mayor,cantidad;
        
        //Leer el tamaño del vector
        System.out.print("Digite el tamaño del vector ");
        n=objleer.nextInt();
        //Instanciar el vector de tamaño n
        int[] numeros=new int[n];
        //Llenar el vector
        numeros=objvector.Leer_vector(n);
        //Imprimir vector
        objvector.Imprimir_vector(n, numeros);
        //Hallar e imprimir el promedio
        prom=objvector.Calcular_promedio(n, numeros);
        System.out.println("\n el promedio de los elementos del vector es "+ prom);
        //Hallar mayor elemento e imprimirlo
        mayor=objvector.Hallar_mayor(n, numeros);
        System.out.println("El mayor elemento en posicion par es " + mayor);
        //Contar e imprimir multiplos de cinco
        cantidad=objvector.Hallar_Multiplo(n, numeros);
        System.out.println("La cantidad de multiplos de cinco es " + cantidad);
    }
    
}

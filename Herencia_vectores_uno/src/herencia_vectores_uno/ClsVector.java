/* Crear metodos para leer e imprimir un vector de enteros de tamaño N */
package herencia_vectores_uno;
import java.util.Random;

public class ClsVector extends ClsOperaciones{
    
    public int[] Leer_vector(int n){
        Random rnd=new Random();
        int[] numeros=new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i]=rnd.nextInt(1000);
        }
        return numeros;
    }
    
    public void Imprimir_vector(int n,int[] num){
        System.out.println("\n Datos del vector");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + "  ");
        }    
    }
}

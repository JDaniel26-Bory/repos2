/* Metodos para el promedio de los elementos del vector, para hallar el mayor
elemento de las posiciones pares y la cantidad de múltiplos de 5  */
package herencia_vectores_uno;

public class ClsOperaciones {
    
    public float Calcular_promedio(int n,int[] numero){
        float promedio,acum=0;
        for (int i = 0; i < n; i++) {
            acum+=numero[i];
        }
        promedio=acum/n;
        return promedio;
    }
    
    public int Hallar_mayor(int n,int[] numero){
        int mayor=-1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && numero[i] > mayor){
                mayor=numero[i];
            }
        }
        return mayor;
    }
    
    public int Hallar_Multiplo(int n,int[] numero){
        int cantidad=0;
        for (int i = 0; i < n; i++) {
            if (numero[i] % 5 == 0){
                cantidad++;
            }
        }
        return cantidad;
    }
}

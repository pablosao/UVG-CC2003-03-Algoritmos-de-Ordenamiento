
/**
 * Código tomado del libro Java Structures
 * Bailey, D. (2007). Java Structures. Williams College.
 * 
 * @author Andrea Elias
 * @author Pablo Sao
 * @version 01/02/2019
 */

public class BurbujaSort implements Comparable<DatosNumericos>
{
    
    DatosNumericos numero;
    public int[] burbuja(int [] A)
    {
         int i, j = 0, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                  //Implementando comparable
                  numero = new DatosNumericos(A[j+1],A[j]);
         
                   //if(A[j+1]<A[j]){
                    if(compareTo(numero) == 1){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
    return A;
    }

    @Override
    public int compareTo(DatosNumericos o) {
        return o.dato1 < o.dato2? 1:0;
    }
    
    
}

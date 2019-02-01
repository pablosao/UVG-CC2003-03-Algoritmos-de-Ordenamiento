
/**
 * Código tomado del libro Java Structures
 * Bailey, D. (2007). Java Structures. Williams College.
 * 
 * @author Andrea Elias
 * @author Pablo Sao
 * @version 01/02/2019
 */

public class BurbujaSort 
{
    
    public int[] burbuja(int [] A)
    {
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1]<A[j]){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
    return A;
    }
    
    
    
    
    
}

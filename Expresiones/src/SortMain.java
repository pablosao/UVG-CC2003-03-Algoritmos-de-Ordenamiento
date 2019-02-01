/**
 * @author Jose Cifuentes
 * @author David Soto
 * @version 09.02.2018
 */



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SortMain 
{
    
     public static void main(String[] args) throws FileNotFoundException, IOException 
     {
        int cantidad = 10;
        int[] arreglo = new int[cantidad];
        String conten; //Variable que va a recibir el contenido de cada linea del texto
        try{
        //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("./numeros.txt");
            //FileReader lector=new FileReader("C:\\Users\\jose\\Desktop\\DISEÑO\\TRABAJOS\\UVG\\3er Semestre\\Estructura de Datos\\HT3\\HojaTrabajo3\\HojaTrabajo3\\src\\hojatrabajo3\\numeros.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            int contador = 0;
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((conten =contenido.readLine())!=null)
            {
                
                int numerico = Integer.parseInt(conten);
                arreglo[contador] = numerico;
                contador = contador + 1;   
            }
            
            
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
        //COPIAS DEL ARREGLO DESORDENADO PARA PODER PROBAR CON CADA SORT
        int [] copia = new int[cantidad];
        copia = arreglo;
        int [] copia1 = new int[cantidad];
        copia1 = arreglo;
        int [] copia2 = new int[cantidad];
        copia2 = arreglo;
        int [] copia3 = new int[cantidad];
        copia3 = arreglo;
        
        //Aplcar los metodos
        //GnomeSort
        GnomeSort.gnomeSort(arreglo);
                 
        //MergeSort        
        MergeSort.mergesort(copia);
        for(int i=0;i<copia.length;i++){
            System.out.println(arreglo[i]);
        }        
        //QuickSort
        QuickSort sorter = new QuickSort();
         sorter.sort(copia3);         
        
        //RadixSort
        RadixSort.radixsort(copia2,cantidad);
        
        //burbuja
        BurbujaSort burb=new BurbujaSort();
        burb.burbuja(copia3);
        
     }
    
}

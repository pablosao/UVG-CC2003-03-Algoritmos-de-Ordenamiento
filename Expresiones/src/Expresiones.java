
mport java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * Clase de inicio para instanciar clases y realizar la pruebas de diferentes algoritmos de ordenamiento
 * @author Pablo Sao
 * @date 02/01/2018
 */
public class Expresiones {
    
    //variable para identificar la cantidad de números a generar
    private static int REPETICION = 3000;
    //variable con la locación del archivo que almacenara los registros
    private static String PATH_FILE = "./numeros.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //iniciando la escritura de los números al azar
        System.out.println(String.format("Iniciando la escritura de los %d dígitos.", REPETICION));
        
        //escribiendo libros en el archivo
        setData();
        
        System.out.println(String.format("Se ha finalizado la escritura de los %d dígitos. ", REPETICION));
        
        System.out.println("\nObteniendo dígitos de archivo y realizando prueba de algoritmos.");
        
        
        
        //Verificamos que hayan registros para realizar las operaciones
        if(getData() != null){
            int[] digitos = null; 
            
            //Metodo Gnome sort
            
            //Obteniendo dígitos del archivo
            digitos = getData();
            
            //Creando objeto
            GnomeSort gnomesort = new GnomeSort();
            System.out.println("Arreglo generado: " + Arrays.toString(digitos));
            //ordenando array
            System.out.println("Algoritmo Gnome sort: " + Arrays.toString(gnomesort.gnomeSort(digitos)));


            //Merge sort
            
            //Obteniendo digitos del archivo
            digitos = getData();
            
            //Creando objeto
            MergeSort mergesort = new MergeSort();
            System.out.println("\nArreglo generado: " + Arrays.toString(digitos));
            //ordenando array
            System.out.println("Algoritmo Merge sort: " + Arrays.toString(mergesort.mergesort(digitos)));


             //Quick sort
             
             //obteniendo digitos del archivo
            digitos = getData();
            System.out.println("\nArreglo generado: " + Arrays.toString(digitos));
            
            //Creando objeto
            QuickSort ob = new QuickSort(); 
            
            //ordenando array
            ob.sort(digitos, 0, (digitos.length - 1)); 
            System.out.println("Algoritmo Quick Sort: " + Arrays.toString(digitos));

            //Radix Sort
            
            //obteniendo digitos de archivo
            digitos = getData();
            
            //creando objeto
            RadixSort radix = new RadixSort();
            System.out.println("\nArreglo generado: " + Arrays.toString(digitos));
            
            //ordenando array
            System.out.println("Algoritmo Radix sort: " + Arrays.toString(radix.radixsort(digitos,REPETICION)));

            //Bubble short
            
            //obteniendo digitos de archivo
            digitos = getData();
            System.out.println("\nArreglo generado: " + Arrays.toString(digitos));
            
            //Creando objeto
            BurbujaSort burbuja = new BurbujaSort();
            
            //ordenando array
            System.out.println("Algoritmo Bubble sort: " + Arrays.toString(burbuja.burbuja(digitos)));
        }
        
    }
    
    /**
     * Metodo para generar los numeros configurados en la bariable REPETICION en el archivo ubicado en PATH_FILE
     */
    private static void setData(){
        try{
            
            FileWriter escritura = new FileWriter (new File(PATH_FILE));
            
            for(int control = 0; control < REPETICION; control++){
                
                escritura.write(String.valueOf((int)(Math.random() * 3000 /*REPETICION*/)));
                escritura.write("\n");
             
            }
            
            escritura.close();
                        
        }catch(Exception e){
            
            System.out.println(e.toString()); 
        
        }
    }
    
    /**
     * Metodo para obtener dentro de un array los valores enteros almacenados dentro de un archivo .txt
     * @return int[] devuelve arrey con los digitos del archivo leido
     */
    private static int[] getData(){
        int[] datos = new int[REPETICION];
        
        try{
            
            File archivo = new File(PATH_FILE);
            
            //Verificamos si el archivo existe
            if(archivo.exists()){
                //Perarando archivo para lectura
                BufferedReader lectura = new BufferedReader(new FileReader(archivo)); 
            
                //Variable que contendra el numero del archivo a leer
                String numero;
            
                //control del correlativo del número
                int control = 0;
            
                //ciclo para la lectura de los digitos contenidos en el archivo
                while ((numero = lectura.readLine()) != null) {
                    //asignacion del digito entero dentro de la variable datos
                    datos[control] = Integer.parseInt(numero);
                    //sumando 1 a la variable de control
                    control++;

                } 
            }
            else{
                //Si el archivo no existe se muestra al usuario el path ingresado y se retorna nulo
                System.out.println(String.format("El archivo \"%s\" no fue encontrado.",PATH_FILE));
                datos = null;
            }
            
        }
        //Captura de cualquier tipo de error.
        catch(Exception e){
            //mostando que hay surgio un error al ejecutar el archivo
            System.out.println(String.format("Problema al leer el archivo. \nError: %s",e.toString()));
            
            //Si existe un error se retornara un nulo
            datos = null;
        }
        
        return datos;
    }
    
}

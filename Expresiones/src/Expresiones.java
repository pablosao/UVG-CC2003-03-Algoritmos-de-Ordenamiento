
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Pablo Sao
 * @date 02/01/2018
 */
public class Expresiones {
    
    private static int REPETICION = 10;
    private static String PATH_FILE = "./numeros.txt";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //iniciando la escritura de los números al azar
        System.out.println(String.format("Iniciando la escritura de los %d dígitos.", REPETICION));
        
        try{
            
            FileWriter escritura = new FileWriter (new File(PATH_FILE));
            BufferedWriter bw = new BufferedWriter(escritura);
            
            int numero=10;
            
            for(int i = 0; i < numero; i++){
                
                int aleatorio = (int)(Math.random()*3000);
                escritura.write(String.valueOf(aleatorio));
                escritura.write("\n");
             
            }
            
            escritura.close();
            
            System.out.println(String.format("Se ha finalizado la escritura de los %d dígitos.", REPETICION));
            
        }catch(Exception e){
            
            System.out.println(e.toString()); 
        
        }
        
        
    }
    
}

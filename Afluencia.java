import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Afluencia {
    
    public static ArrayList<String> afluencias = new ArrayList<String>();

    public static void cargarAfluencia(){
        try {
            BufferedReader aflue = new BufferedReader(new FileReader("estaciones.txt"));
            String linea = aflue.readLine();
            while(linea!=null){
                afluencias.add(linea);
            }
            aflue.close();
        } catch (Exception e) {
            System.out.println("Error en la base de datos");
        }
    }

    public static void guardarAfluencia(){
        try {
            PrintWriter afluWriter = new PrintWriter(new FileWriter("estaciones.txt"));
            for(String str: afluencias){
                afluWriter.println(str);
            }
            afluWriter.close();
        } catch (Exception e) {
            System.out.println("Error al Guardar en la base de datos");
        }
    }    

    


}

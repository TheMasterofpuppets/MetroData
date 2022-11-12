import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Foro{

    public static String mostrarInfo_foro(){
        String entrega = "";
        try {
            BufferedReader foro = new BufferedReader(new FileReader("informacionforo.txt"));
            String line = foro.readLine();
            while(line!=null){
                String li[] = line.split(",");
                entrega += "\nEl usuario: "+li[0] + "\n ha publicado: " + li[1];
            }
            foro.close();
        } catch (Exception e) {
            System.out.println("Error al leer el foro");
        }
        return entrega;
    }


    public static void publicar(Persona p, String info){
       try {
            PrintWriter foro = new PrintWriter(new FileWriter("informacionforo.txt", true));
            String escritura = p.getIdUsuario() + ","+info;
            foro.println(escritura);
            foro.close();
       } catch (Exception e) {
            System.out.println("Error al escribir en el foro");
       } 
    }

}
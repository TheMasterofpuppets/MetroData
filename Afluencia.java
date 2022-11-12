import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Afluencia {
    
    public static ArrayList<String> afluencias = new ArrayList<String>();

    public static void cargarAfluencia(){
        try {
            BufferedReader aflue = new BufferedReader(new FileReader("estaciones.txt"));
            String linea = aflue.readLine();
            while(linea!=null){
                afluencias.add(linea);
                linea = aflue.readLine();
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
            afluencias.clear();
            afluWriter.close();
        } catch (Exception e) {
            System.out.println("Error al Guardar en la base de datos");
        }
    }    

    public static String estacionesMasAfluencia(String tipoAfluencia){
        String entrega = "";
        for(String s: afluencias){
            String s1[] = s.split(",");
            if(s1.length>1){
                if(s1[2].equals(tipoAfluencia)){
                    entrega += "\nLa estacion: " + s1[0] + "\nCon hora: " + s1[1]+"\nTenia un nivel de afluencia: "+ s1[2]+"\n";
                }
            }
        }
        return entrega;
    }

    public static String buscarEstacionAfluencia(String nombreEstacion){
        String entrega = "";
        for(String s: afluencias){
            String s1[] = s.split(",");
            if(s1[0].equals(nombreEstacion)){
                if(s1.length>1){
                    entrega += "\nLa estacion: " + s1[0] + "\nCon hora y día: " + s1[1]+"\nTenia un nivel de afluencia: "+ s1[2]+"\n";
                }else{
                    entrega += "La estación seleccionada no cuenta con un reporte de afluencia";
                }
                break;
            }
        }
        return entrega;
    }
    
    public static String verAfluencia(){
        String entrega = "";
        for(String s: afluencias){
            String s1[] = s.split(",");
            if(s1.length>1){
                entrega += "\nLa estacion: " + s1[0] + "\nCon hora y día: " + s1[1]+"\nTenia un nivel de afluencia: "+ s1[2]+"\n";
            }else{
                entrega += "\nLa estacion: " + s1[0] + "\nNo cuenta con informacion de afluencia\n";
            }
        }
        return entrega;
    }
    
    public static void reportarAfluencia(String estacion, String tipo){
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("h:mm");
        String hora = LocalDateTime.now().format(dft);
        dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = LocalDate.now().format(dft);
        String fechaHora = hora + " " + fecha;
        String salida = estacion+","+fechaHora+","+tipo;
        for(int i = 0; i<afluencias.size();i++){
            String s1[] = afluencias.get(i).split(",");
            if(s1[0].equals(estacion)){
                afluencias.set(i,salida);
                break;
            }
        }
    }
}
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ControlPersona{

    public static ArrayList<Persona> personas = new ArrayList<Persona>();

    

    // *metodo para leer base de datos
    public static void leerBaseDatos(){
        try {
            BufferedReader base = new BufferedReader(new FileReader("UsuarioRegistrados.csv"));
            String linea = base.readLine();
            while(linea!=null){
                String datos[] = linea.split(",");
                personas.add(new Pasajero(datos[0], datos[1], datos[2]));
            }
            base.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }
    }
    
    // *Metodo para guardar usuarios
    public static void gardarEnBase(){
        try {
            PrintWriter base = new PrintWriter(new FileWriter("UsuarioRegistrados.csv"));
            
            // *toString
            
            for(Persona persona : personas){
                String info = persona.getNombreUsuario()+","+persona.getCorreo()+","+persona.getPassword();
                base.println(info);
            }

            base.close();
        } catch (Exception e) {
            System.out.println("No se ha podido guardar la informacion");
        }
    }
    
    /* 
    todo: metodo para modificar persona
    */ 
      

    
}
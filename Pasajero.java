public class Pasajero extends Persona{

    public Pasajero(String nombreUsuario, String email, String pass){
        super(nombreUsuario, email, pass);
    }

    public static Pasajero buscarPersona(String Email){
        Pasajero p1 = null;
        for(Pasajero persona: ControlPersona.personas){
            if(persona.getCorreo().equals(Email)){return persona;}
        }
        return p1;
    }
} 
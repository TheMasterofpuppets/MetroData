
public class Persona{

    private String nombreUsuario;
    private String password;
    private long idUsuario;
    private String correo;

    public Persona(String nombreUsuario, String correo, String pass){
        this.password = pass;
        this.nombreUsuario  = nombreUsuario;
        this.correo = correo;
    } 

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUduario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // genera un id aleatoriamente, retorna tru si lo agrega, en caso contrario retorna flase
    public static boolean generarId(Persona p ){
        long id = (long)Math.random()*(1003565-100000+1)-100000;
        boolean entrega = true;
        for(Persona persona: ControlPersona.personas){
            if(persona.getIdUsuario() == id){
                entrega = false;
                break;
            }
        }
        
        if(entrega){
            p.setIdUsuario(id);
        }

        return entrega;
    }

    // metodo de inicio de seccion
    public static boolean iniciarSesion(String email, String password){
        boolean entrega = false;
        for(Persona persona:ControlPersona.personas){
            if(persona.getCorreo().equals(email) && persona.getPassword().equals(password)){
                entrega = true;
                break;
            }
        }
        return entrega;
    }

    // metodo para registrar un usuario. Guarda toda la informacion en la lista personas
    public static boolean registrarse(Pasajero p){
        if(iniciarSesion(p.getCorreo(),p.getPassword())){
            return false;
        }
        ControlPersona.personas.add(p);
        return true;
    }

}

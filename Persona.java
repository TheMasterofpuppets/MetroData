
public class Persona{

    private String nombreUduario;
    private String password;
    private long idUsuario;
    private String correo;
    private int tipo;


    public Persona(String pass, String nombreUsuario, String correo, int tipo){
        this.password = pass;
        this.nombreUduario  = nombreUsuario;
        this.correo = correo;
        this.tipo = tipo;
    } 

    public static boolean iniciarSeccion(String email, String password){
        boolean entrega = false;
        for(Persona persona:ControlPersona.personas){
            if(persona.getCorreo().equals(email) && persona.getPassword().equals(password)){
                entrega = true;
                break;
            }
        }
        return entrega;
    }

    public static boolean registrarse(Persona p){
        if(iniciarSeccion(p.getCorreo(),p.getPassword())){
            return false;
        }
        ControlPersona.personas.add(p);
        return true;
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

    public String getNombreUduario() {
        return this.nombreUduario;
    }

    public void setNombreUduario(String nombreUduario) {
        this.nombreUduario = nombreUduario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo() {
        return this.tipo;
    }

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

}

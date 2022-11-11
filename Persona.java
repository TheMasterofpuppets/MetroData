public abstract class Persona{

    private String nombreUduario;
    private String password;
    private long idUsuario;
    private String correo;


    public Persona(String pass, String nombreUsuario, String correo){
        this.password = pass;
        this.nombreUduario  = nombreUsuario;
        this.correo = correo;
    } 

    public abstract boolean iniciarSeccion(String email, String password);
    public abstract boolean registrarse(String email, String password);

    public void generarId(Persona p ){
        long id = (long)Math.random()*(100000-1003565+1)-1003565;
        // todo  
    }


}
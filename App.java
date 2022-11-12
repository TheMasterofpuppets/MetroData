import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        String bienvenida = "\n______________________________________\n"+
            "\nBienvenid@s a MetroData\n"+
            "La aplicaición que le brinda información del Metro de Medellín\n"+
            "\n1. Iniciar sesión\n" +
            "2. Registrarse\n" +
            "3. Continuar como invitado\n"+
            "0. Salir\n";
        System.out.println(bienvenida);
        Scanner ent1 = new Scanner(System.in); // int
        Scanner ent2 = new Scanner(System.in);
        int conf1 = ent1.nextInt();
        while(conf1!=0){    
            if(conf1 == 1){

                System.out.println("\nDigite su correo electronico: \n");
                String email = ent2.nextLine(); 
                System.out.println("\nDigite su contraseña: \n");
                String password = ent2.nextLine(); 
                if(Persona.iniciarSesion(email, password)){
                    
                    Pasajero pasajero = Pasajero.buscarPersona(email);
                    System.out.println("Bienvenido " + pasajero.getNombreUsuario()+"\n");
                    String menuUsuarioRegistrado = "\n______________________________________\n" + 
                    "1. Ver información general del metro\n"+
                    "2. Reporta afluencia"+
                    "3. Ver afluencia\n"+
                    "4. Acceder al foro\n"+
                    "0. Salir";

                    System.out.println(menuUsuarioRegistrado);
                    int opcionMenuR = ent1.nextInt();
                    while(opcionMenuR!=0){
                        opcionMenuR = ent1.nextInt();
                        switch(opcionMenuR){
                            case 0:
                                conf1 = 0;
                                break;
                            case 1:
                                InfoMetro.menu();
                                break;
                            case 2:
                                Afluencia.cargarAfluencia();
                                System.out.println("\nDigite el nombre de la estación en la que se encuentra\n");
                                String estacion = ent1.nextLine();
                                System.out.println("\nIngrese el estado de la estación: alto, medio o bajo...\n");
                                String tipo = ent1.nextLine();
                                Afluencia.reportarAfluencia(estacion, tipo);
                                System.out.println("\nAfluencia reportada\n");
                                Afluencia.guardarAfluencia();
                                break;
                            case 3:
                                Afluencia.cargarAfluencia();
                                String afluencia = "\n______________________________________\n"+
                                    "\nSeleccione la opción que desea visualizar: \n"+
                                    "1. Ver toda la afluencia\n"+
                                    "2. Buscar estación para ver afluencia\n"+
                                    "3. Estaciones con alto nivel de afluencia\n";
                                    System.out.println(afluencia);
                                    int opcionAfluencia = ent1.nextInt();
                                    
                                    if(opcionAfluencia == 1){
                                        Afluencia.verAfluencia();
                                    }else if(opcionAfluencia == 2){
                                        System.out.println("Digita el nombra de la estacion a buscar: \n");
                                        String estacion2 = ent1.nextLine();
                                        System.out.println(Afluencia.buscarEstacionAfluencia(estacion2));
                                    }else if(opcionAfluencia == 3){
                                        System.out.println("\nLas estaciones con mayor nivel de afluencia son: \n");
                                        System.out.println(Afluencia.estacionesMasAfluencia(afluencia));
                                    }else{
                                        System.out.println("\nLa opción seleccionada no se encuentra en el menú\n");
                                    }
                                break;
                            case 4:
                                String menuForo = "\n______________________________________\n" +
                                "1. Mostroas publicaciones\n"+
                                "2. Publicar un comentario\n";
                                System.out.println(menuForo);
                                int opcionForo = ent1.nextInt();
                                if(opcionForo==1){
                                    Foro.mostrarInfo_foro();
                                }else if(opcionForo==2){
                                    System.out.println("\nDigite la información que desea publicar\n");
                                    String publicacion = ent1.nextLine();
                                    Foro.publicar(pasajero, publicacion);
                                }else{
                                    System.out.println("\nLa opción seleccionada no se encuentra en el menú");
                                }
                                break;
                            default:
                                System.out.println("\nla opción seleccionada no se encuentra en el menú\n");
                                break;

                        }
                    }
                }else{
                    System.out.println("Error, el usuario no existe");
                }
            }else if(conf1 == 2){
                
            }else if(conf1 == 3){

            }else if(conf1 == 0){
                System.out.println("Gracias por utilizar MetroData");
            }else{
                System.out.println("Opción invalida, digite una opción del 1 al 3\n");
            }
            conf1 = ent1.nextInt();
        }
        ent1.close();
        ent2.close();
    }
}

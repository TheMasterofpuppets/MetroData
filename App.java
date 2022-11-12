import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        String bienvenida = "\n______________________________________\n"+
            "\nBienvenid@ a MetroData\n"+
            "La aplicaición que le brinda información del Metro de Medellín\n"+
            "\n1. Iniciar sesión\n" +
            "2. Registrarse\n" +
            "3. Continuar como invitado\n"+
            "4. Mostrar menú nuevamente\n"+
            "0. Salir\n";
        System.out.println(bienvenida);
        Scanner ent1 = new Scanner(System.in); // Scanner int
        Scanner ent2 = new Scanner(System.in); // Scanner String
        int conf1 = ent1.nextInt();
        ControlPersona.leerBaseDatos();
        while(conf1!=0){    
            if(conf1 == 1){
                System.out.println("\nDigite su correo electronico: \n");
                String email = ent2.nextLine(); 
                System.out.println("\nDigite su contraseña: \n");
                String password = ent2.nextLine(); 
                if(Persona.iniciarSesion(email, password)){
                    
                    Pasajero pasajero = Pasajero.buscarPersona(email);
                    System.out.println("\nBienvenido " + pasajero.getNombreUsuario()+"\n");
                    String menuUsuarioRegistrado = "\n______________________________________\n" + 
                    "1. Ver información general del metro\n"+
                    "2. Reporta afluencia\n"+
                    "3. Ver afluencia\n"+
                    "4. Acceder al foro\n"+
                    "5. Mostrar menú nuevamente\n"+
                    "0. Salir\n";

                    System.out.println(menuUsuarioRegistrado);
                    int opcionMenuR = ent1.nextInt();
                    while(opcionMenuR!=0){
                        switch(opcionMenuR){
                            case 0:
                                break;
                            case 1:
                                InfoMetro.menu();
                                break;
                            case 2:
                                Afluencia.cargarAfluencia();
                                System.out.println("\nDigite el nombre de la estación en la que se encuentra\n");
                                String estacion = ent2.nextLine();
                                System.out.println("\nIngrese el estado de la estación: alto, medio o bajo...\n");
                                String tipo = ent2.nextLine();
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
                                        System.out.println(Afluencia.verAfluencia());
                                    }else if(opcionAfluencia == 2){
                                        System.out.println("Digita el nombra de la estacion a buscar: \n");
                                        String estacion2 = ent2.nextLine();
                                        System.out.println(Afluencia.buscarEstacionAfluencia(estacion2));
                                    }else if(opcionAfluencia == 3){
                                        System.out.println("\nLas estaciones con mayor nivel de afluencia son: \n");
                                        System.out.println(Afluencia.estacionesMasAfluencia("alto"));
                                    }else{
                                        System.out.println("\nLa opción seleccionada no se encuentra en el menú\n");
                                    }
                                Afluencia.guardarAfluencia();
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
                                    String publicacion = ent2.nextLine();
                                    Foro.publicar(pasajero, publicacion);
                                }else{
                                    System.out.println("\nLa opción seleccionada no se encuentra en el menú");
                                }
                                break;
                            case 5:
                                System.out.println(menuUsuarioRegistrado);
                                break;
                            default:
                                System.out.println("\nla opción seleccionada no se encuentra en el menú\n");
                                break;
                        }
                        System.out.println("\nDigite la opción 5 para mostrar nuevamente el menú\nOpción 0 para salir\n");
                        ent1 = ent1.reset();
                        opcionMenuR = ent1.nextInt();
                    }
                }else{
                    System.out.println("Error, el usuario no existe");
                }
            }else if(conf1 == 2){
                
            }else if(conf1 == 3){

            }else if(conf1 == 0){
                System.out.println("Gracias por utilizar MetroData");
            }else if(conf1 == 4){
                System.out.println(bienvenida);
            }else{
                System.out.println("Opción invalida, digite una opción del 1 al 3\n");
            }
            System.out.println("\nDigite la opción 4 para mostrar nuevamente el menú\nOpción 0 para salir\n");
            conf1 = ent1.nextInt();
        }
        ControlPersona.guardarEnBase();
        ent1.close();
        ent2.close();
    }
}

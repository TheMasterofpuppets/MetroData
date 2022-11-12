import java.util.Scanner;

public class InfoMetro{
    // Basado en la información Datos Abiertos Metro mes de septiembre del 2022

    public static void menu(){

        String menuPrincipal = 
        "**************************\n"+
        "BIENVENIDO A INFOMETRO\n"+
        "\nAquí podrá visualizar información importante que le ayudará\n"+
        "a disfrutar de su experiencia en el sistema metro\n"+

        "\n1. Tarifas generales del sistema metro\n"+
        "2. Líneas del sistema metro y sus estaciones\n"+
        "3. Rutas integradas de las cuencuas 3 y 6\n"+
        "4. Horas picos del sistema metro\n"+
        "5. ¿Cuántas personas moviliza el sistema metro?\n";

        System.out.println(menuPrincipal);

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        while(num!=0){
            
            switch(num){

                case 1: 

                    String tarifas = 
                    "************************************\n"+
                    "\nTARIFAS SISTEMA METRO 2022\n"+
                    "\nConozca el total de su viaje según las siguientes alternativas de integración\n"+
                    "(del 1 al 10) entre medios que usted realice y su perfil cívica\n"+

                    "\nPara las opciones 1, 2, 3 y 4 se tienen las siguientes tarifas y opciones: \n"+

                    "Frecuente : $2.580, Adulto mayor : $2.420, Estudiantil : $1.150, PcD* = $1.960, Al portador y eventual: $2.930\n"+
                    "\n1. Un solo medio de transporte (Metro, Alimentador, tranvía, bus o cable)\n"+
                    "2. Tranvia o Bus + Metro o Cable\n"+
                    "3. Alimentador + Tranvia o Bus\n"+
                    "4. Tranvia + Cable o Metro\n"+
                    
                    "\nPara las opciones 5, 6 o 7 se tienen las siguientes tarifas y opciones : \n"+
                    
                    "Frecuente : $3.125, Adulto mayor : $2.965,  Estudiantil : $1.695, PcD* = $2.505, Al portador y eventual: $3.475\n"+
                    "\n5. Alimentador + Metro o Cable\n"+
                    "6. Alimentador + Tranvia o Bus + Metro o Cable\n"+
                    "7. Alimentador + Alimentador\n"+
                    
                    "\nPara las opción 8 se tiene las siguientes tarifas: \n"+
                    
                    "Frecuente : $3.670, Adulto mayor : 3.510, Estudiantil : 2.240, PcD* = $3.050, Al portador y eventual: $4.020\n"+
                    "\n8. Alimentador + Tranvia o Bus + Alimentador\n"+

                    "\nPara las opciones 9 y 10 se tienen las siguientes tarifas y opciones : \n"+
                    
                    "Frecuente : $4.215, Adulto mayor : $4.055, Estudiantil : 2.780, PcD* = $3.595, Al portador y eventual: $4.565\n"+
                    "\n9. Alimentador + Metro o Cable + Alimentador\n"+
                    "10. Alimentador + Tranvia o Bus + Metro o Cable + Alimentador\n"+
                    
                    "\nTarifas Parque Arví: \n"+
                    "Tarifa general: $11.150\n"+
                    "Tarifa con Sisben III y IV (Grupos A, B y C) : $1.100\n"+
                    "Residentes acreditados: $3.900\n"+

                    "\n*********************************************\n";
                    System.out.println(tarifas);
                    break;

                case 2:

                    String lineasMetro = 
                    "\n*********************************************\n"+
                    "LÍNEAS Y ESTACIONES DEL SISTEMA METRO\n"+
                    "\nLÍNEAS DE TRENES\n"+
                    "\nLÍNEA A: \n"+
                    "Niquia, Bello, Madera, Acevedo, Tricentenario, Caribe, Universidad, Hospital A, Prado, Parque Berrio\n"+
                    "San Antonio A, Alpujarra, Exposiciones, Industriales A, Poblado, Aguacatala, Ayurá, Envigado, Itagui, Sabaneta, La Estrella\n"+
                    
                    "\nLÍNEA B : \n"+
                    "San Antonio B, Cisneros B, Suramericana, Estadio, Floresta, Santa Lucia, San Javier B\n"+

                    "\nLÍNEAS DE CABLES\n"+
                    "\nLÍNEA K: \n"+
                    "Acevedo K, Andalucía, Popular, Santo Domingo\n"+
                    
                    "\nLÍNEA J: \n"+
                    "San Javier J, Juan XXIII, Vallejuelos, La Aurora\n"+

                    "\nLÍNEA P: \n"+
                    "Acevedo P, SENA, Doce de Octubre, El progreso\n"+

                    "\nLÍNEA M: \n"+
                    "Trece de Noviembre, El Pinal, Miraflores\n"+

                    "\nLÍNEA H: \n"+
                    "Oriente, Las Torres, Villa Sierra\n"+

                    "\nLÍNEA L\n"+
                    "Santo Domingo L, Arví\n"+

                    "\nLÍNEAS DE BUSES\n"+
                    "\nLÍNEA 1 DE BUSES: \n"+
                    "U de M, Los Alpes, La Palma, Parque de Belén, Rosales, Nutibara, Industriales 1, Plaza Mayor, Cisneros 1, Fátima,\n"+
                    "Minorista, Chagualo, Ruta N - U de A, Hospital 1, San Pedro, Palos Verdes, Gardel, Manrique, Las Esmeraldas, Berlín, Parque de Aranjuez\n"+
                    
                    "\nLÍNEA 2 DE BUSES: \n"+
                    "U de M, Los Alpes, La Palma, Parque de Belén, Rosales, Nutibara, Industriales 2, Barrio Colombia, Barrio San Diego,\n"+
                    "Barrio Colón, San José, La Playa, Catedral Metropolitana, Prado, Hospital 2, San Pedro, Palos Verdes, Gardel, Manrique,\n"+
                    "Las Esmeraldas, Berlín, Parque de Aranjuez\n"+
                    "\nLÍNEA O: \n"+
                    "Caribe O, Cementerio Universal, Barrio Córdoba, Barrio Pilarica, Ciudadela Universitaria, Facultad de Minas, Barrio Los Colores,\n"+
                    "Barrio Calasanz, Floresta O, Los Pinos, Laureles, Santa Gema, Villa de Aburrá, La Palma\n"+

                    "\nLÍNEA TA - TRANVIA\n"+
                    "San Antonio T, San José, Pabellon del Agua, Bicentenario, Buenos Aires, Miraflores, Loyola, Alejandro Echavarría, Oriente T\n"+
                    "\n****************************************************************\n"
                    ;
                    System.out.println(lineasMetro);
                        break;

                case 3:
                    System.out.println("\n*********************************************\n");
                    System.out.println("\nRUTAS INTEGRADAS DEL SISTEMA METRO\n");
                    
                    String infoEstaciones = 
                    "\nLas estaciones que cuentan con rutas integradas son: \n"+
                    "\nLÍNEA A: \n"+
                    "\nNiquía, Bello, Madera, Acevedo, Tricentenario, Caribe, Universidad, Hospital, Prado, Parque Berrío,\n"+
                    "San Antonio, Alpujarra, Exposiciones, Industriales, Poblado, Aguacatala, Ayurá, Envigado, Itagui, Sabaneta, La Estrella\n"+

                    "\nLÍNEA B: \n"+
                    "\nCisneros, Suramericana, Estadio, Floresta, Santa Lucía, San Javier...\n"+

                    "\nDigite la estación que quiere visualizar (TODO EN MINISCULAS): \n"+
                    "\n**************************************************\n"
                    ;

                    String laEstrella = "\nESTACIÓN LA ESTRELLA: \n"+
                    "RUTA 7420 Cañaveralejo, RUTA 7421 Pan de Azúcar, RUTA 9420 Caldas Estrella La 50,\n"+
                    "RUTA 9420 Caldas - La Miel - La Variante, RUTA 9420	Caldas - La Tablaza - La Variante,\n"+
                    "RUTA 9422 Caldas - Los Lagos - La 50, RUTA 318i	Prado - La Estrella,\n"+
                    "RUTA Estrella 3	Estrella ruta 3 - Comfama Metro, RUTA Estrella 5	Estrella ruta 5 - Comfama Metro,\n"+
                    "RUTA Estrella 7A	Estrella ruta 7E - Ferreria Metro - La Estrella\n";

                    String sabaneta = "\nESTACIÓN SABANETA: \n"+
                    "RUTA 318	San Antonio de Prado - Compartir - Pradito - El Descanso, RUTA 319	San Antonio de Prado - El Vergel,\n"+
                    "RUTA Inmaculada, RUTA Aves María, RUTA Casimbas, RUTA Santa María La Nueva - Olivares - Zuleta, RUTA Villa Lía - Santana - San Pío\n";
                    
                    String itagui = "\nESTACIÓN ITAGUÍ: \n"+
                    "RUTA 317	Barichara - Limonar (San Antonio de Prado), RUTA 5420	San Francisco, RUTA 5422	San Francisco,\n"+
                    "RUTA 5423	Cedros de Badajoz - Yarumito, RUTA 6420	Señorial - Trianón, RUTA 7423	Lomitas, RUTA C-SAB-1	La Doctora,\n"+
                    "RUTA Estrella 7	Estrella ruta 7- Ferrería - Metro Itagüí\n";

                    String envigado = "\nESTACIÓN ENVIGADO: \n"+
                    "RUTA 6403	Loma del Chocho, RUTA 6404	Loma del Escobero - Farolito, RUTA 6406	El Salado, RUTA 6407	El Dorado - San José - Mangazul, \n"+
                    "RUTA 6408	San Rafael - La Mina, RUTA 6410	Chinguí, RUTA 6402-2	San Lucas 2, RUTA Arenales	Arenales, RUTA Calatrava	Calatrava,\n"+
                    "RUTA Palmas	Alto de Las Palmas, RUTA Alto de las Flores\n";

                    String ayura = "\nESTACIÓN AYURÁ: \n"+
                    "RUTA 6380	Ayurá - San Mateo, RUTA 6405	Alto de Misael A, RUTA 6402-1	San Lucas 1, RUTA C-ITA	Circular Itagüí\n";

                    String aguacatala = "\nESTACIÓN AGUACATALA: \n"+
                    "RUTA C3-001	Aguacatala - Industriales, RUTA C3-002	Aguacatala - Bulerías, RUTA 132i	La Visitación, Centro Comercial Oviedo, EAFIT, \n"+
                    "RUTA 133ii	Club Campestre, ISA, Loma de los Gonzales, RUTA 135i	Aguacatala - Av. El Poblado - Calle 20A Sur – Aguacatala\n"+
                    "RUTA 143i	Barrio La Colina, San Rafael, Fábrica de Licoles de Antioquia\n";

                    String poblado = "\nESTACIÓN POBLADO: \n"+
                    "RUTA 133i	San Lucas, RUTA 134i	Calle 10 - Loma el Tesoro, RUTA 134ii	Calle 10, Transversal Superior, CES, Marianito, Las Palmas, Colegiatura\n";

                    String industriales = "\nESTACIÓN INDUSTRIALES: \n"+
                    "RUTA 130i	Industriales - Poblado - Aguacatala, RUTA 136i	Chuscalito (Las Palmas) - Palms Avenue - Av. Poblado - Carrera 43F - Industriales\n";

                    String exposiciones = "\nESTACIÓN EXPOSICIONES: \n"+
                    "RUTA C6-004	Milagrosa - Exposiciones\n";

                    String alpujarra = "\nESTACIÓN ALPUJARRA: \n"+
                    "RUTA C6-010	Villatina - Alpujarra\n";

                    String sanAntonio = "\nESTACIÓN SAN ANTONIO: \n"+
                    "RUTA C6-007	Bomboná - San Antonio, RUTA C6-005a	Quinta Linda - San Antonio, RUTA C6-007	Buenos Aires - San Antonio\n";

                    String parqueBerrio = "\nESTACIÓN PARQUE BERRÍO: \n"+
                    "RUTA C6-006	Caicedo - Berrío, RUTA C6-008	La Libertad - Berrío\n";

                    String prado = "\nESTACIÓN PRADO: \n"+
                    "RUTA C6-008	La Libertad - Prado, RUTA C6-009	Enciso - Prado, RUTA C6-022	La Cruz - Prado\n";

                    String hospital = "\nESTACIÓN HOSPITAL: \n"+
                    "RUTA 254i	Picachito - Terminal del Norte - Hospital, RUTA C6-002	Villa Hermosa - Hospital, RUTA C6-003	Campo Valdés - Hospital, RUTA C6-016	Nuevo Horizonte - Hospital\n";

                    String universidad = "\nESTACIÓN UNIVERSIDAD: \n"+
                    "RUTA C6-020	San José de la Cima - Universidad, RUTA 261i Derecha	Castilla - Alfonso López - Francisco Zea, RUTA 261i Izquierda	Terminal de Transporte - Alfonso López - La 65\n";

                    String caribe = "\nESTACIÓN CARIBE: \n"+
                    "RUTA 306A	Circular Noroccidental, RUTA 306B	Circular Noroccidental\n";

                    String tricentenario = "\nESTACIÓN TRICENTENARIO: \n"+
                    "RUTA 263i	Doce de Octubre, RUTA C6-013	Aranjuez Anillo - Tricentenario, RUTA C6-018	Santa Cecilia #2 - Tricentenario\n";

                    String acevedo = "\nESTACIÓN ACEVEDO: \n"+
                    "RUTA C6-001	Santa Rita - Zamora - Acevedo, RUTA 270i	Boyacá Las Brisas, RUTA 283i	Florencia - Barrio Nuevo\n";

                    String madera = "\nESTACIÓN MADERA: \n"+
                    "RUTA 1040	Cabañas - Barrio Obrero, RUTA 1041   Cabañas - Amarú - Barrio Nuevo, RUTA 1042	París - Los Sauces, RUTA 1043	Machado - Machado - Parque de Bello\n"+
                    "RUTA 1045	Villas de Occidente, RUTA 2.002	Copacabana por Machado\n";

                    String bello = "\nESTACIÓN BELLO: \n"+
                    "RUTA 1006	Quinta Etapa, RUTA 1010	San Martín, RUTA 1011	Pachelly Parque, RUTA 1012	Tierradentro, RUTA 1013	Villa Linda, RUTA 1020	Cumbre – Carmelo\n"+
                    "RUTA 1045	Villas de Occidente, RUTA 2.002	Copacabana por Machado, RUTA 1022	Barrio Pérez - Comfama, RUTA 1023	Santa Ana – Búcaros, RUTA 1024	Trapiche – Valadares\n"+
                    "RUTA 1025	Pérez, RUTA 1027	Mirador – Congolo, RUTA Pérez	Vereda Pérez - Rosalpi – Hatoviejo, RUTA Potrerito	Vereda Potrerito, RUTA Trapiche – Peña Verde\n";

                    String niquia = "\nESTACIÓN NIQUÍA: \n"+
                    "RUTA 1001	Niquía Quitasol, RUTA 1002	Niquía Camacol la 65, RUTA 1003	Navarra – Parque, RUTA 1004	Niquía - Maximiliano - Kolbe\n"+
                    "RUTA 1005	Niquía Camacol la 61, RUTA 1008	Bellavista-San Martín, RUTA 1008	San Martín – Bellavista, RUTA 1014	San Félix, RUTA 2001	Copacabana x Autopista\n"+
                    "RUTA 3001	Girardota, RUTA 2001-1	Copacabana - Piscina, RUTA 2001-2	Copacabana - San Juan, RUTA 4001-1	Barbosa, RUTA 4001-2	Barbosa - Parque de las Aguas\n"+
                    "RUTA C-2000-1	Circular 2000-1, RUTA Terranova\n";

                    String sanJavier = "\nESTACIÓN SAN JAVIER: \n"+
                    "RUTA C23ii	San Cristobal, RUTA 201i	Belencito - Corazon, RUTA 221i	Belencito - Villa Laura, RUTA 225i	20 de Julio\n"+
                    "RUTA 226i	Barrio El Salado - Depósito, RUTA 227i	Barrio Eduardo Santos, RUTA 227-IA	Las Peñitas, RUTA 227IB	La Gabriela\n"+
                    "RUTA 228i	Nuevos Conquistadores, RUTA 243iD	La Divisa\n";

                    String santaLucia = "\nESTACIÓN SANTA LUCIA: \n"+
                    "RUTA 195i	Simón Bolívar, RUTA 195ii	Almería, RUTA 202i	La América - Santa Mónica\n"+
                    "RUTA 243i	Barrio La Divisa - Barrio La Quiebra - Barrio Metropolitano, RUTA 311i	Calazans, RUTA 311ii	Calazanía - Campo Verde - Santa Lucía\n";

                    String floresta = "\nESTACIÓN FLORESTA: \n"+
                    "RUTA 246i	Blanquizal, RUTA 250i	Urbanización Santa Clara - Urbanización Mirador de Robledo\n";

                    String estadio = "\nESTACIÓN ESTADIO: \n"+
                    "RUTA 193i	UPB - C.C Unicentro - Glorieta Bulerías - Bomba Los Almendros, 193ii	Estadio - carrera 70 - calle 35 - calle 33 - carrera 81\n";

                    String suramericana = "\nESTACIÓN SURAMERICANA: \n"+
                    "RUTA 253i	Robledo Aures\n";

                    String cisneros = "\nESTACIÓN CISNEROS: \n"+
                    "Hasta el momento esta estaciÓn no presenta rutas integradas\n";

                    Scanner ent = new Scanner(System.in);
                    System.out.println(infoEstaciones);
                    String estacion = ent.nextLine();

                    if(estacion.equals("niquia")){
                        System.out.println(niquia);
                    }else if(estacion.equals("bello")){
                        System.out.println(bello);
                    }else if(estacion.equals("madera")){
                        System.out.println(madera);
                    }else if(estacion.equals("acevedo")){
                        System.out.println(acevedo);
                    }else if(estacion.equals("tricentenario")){
                        System.out.println(tricentenario);
                    }else if(estacion.equals("caribe")){
                        System.out.println(caribe);
                    }else if(estacion.equals("universidad")){
                        System.out.println(universidad);
                    }else if(estacion.equals("hospital")){
                        System.out.println(hospital);
                    }else if(estacion.equals("prado")){
                        System.out.println(prado);
                    }else if(estacion.equals("parque berrio")){
                        System.out.println(parqueBerrio);
                    }else if(estacion.trim().equals("san antonio")){
                        System.out.println(sanAntonio);
                    }else if(estacion.equals("alpujarra")){
                        System.out.println(alpujarra);
                    }else if(estacion.equals("exposiciones")){
                        System.out.println(exposiciones);
                    }else if(estacion.equals("industriales")){
                        System.out.println(industriales);
                    }else if(estacion.equals("poblado")){
                        System.out.println(poblado);
                    }else if(estacion.equals("aguacatala")){
                        System.out.println(aguacatala);
                    }else if(estacion.equals("ayura")){
                        System.out.println(ayura);
                    }else if(estacion.equals("envigado")){
                        System.out.println(envigado);
                    }else if(estacion.equals("itagui")){
                        System.out.println(itagui);
                    }else if(estacion.equals("sabaneta")){
                        System.out.println(sabaneta);
                    }else if(estacion.equals("la estrella")){
                        System.out.println(laEstrella);
                    }else if(estacion.equals("cisneros")){
                        System.out.println(cisneros);
                    }else if(estacion.equals("suramericana")){
                        System.out.println(suramericana);
                    }else if(estacion.equals("estadio")){
                        System.out.println(estadio);
                    }else if(estacion.equals("floresta")){
                        System.out.println(floresta);
                    }else if(estacion.equals("santa lucia")){
                        System.out.println(santaLucia);
                    }else if(estacion.equals("san javier")){
                        System.out.println(sanJavier);
                    }
                    ent.close()
                    break;

                case 4:
                    String horasPico = 

                    "\n***************************************\n"+
                    "\nINFORMACIÓN SOBRE LAS HORAS PICO...\n"+
                    "\nDurante la mañana, la hora pico en el sistema metro ronda entre las 4:30 AM y las 8:00 AM\n"+
                    "movilizando durante los días de la semana laborales en promedio 660.000 usuarios en todas las líneas en este lapso de tiempo.\n"+
                    "\nEn horas de la tarde, la hora pico es entre las 4:00 PM y las 7:00 PM, movilizando en día de semana en promedio\n"+
                    "la misma cantidad de 660.000 usuarios aproximadamente en todas líneas durante ese lapso de tiempo.\n"+
                    "\n***************************************\n"
                    ;
                    System.out.println(horasPico);
                        break;

                    case 5:
                    String numUsuarios = 
                    "\n***************************************\n"+
                    "\nCIFRAS DE USUARIOS MOVILIZADOS POR EL SISTEMA METRO\n"+
                    "\n* Durante el mes de septiembre del 2022, el sistema metro completó un total de\n"+
                    "29,8 millones de viajes en todas sus líneas.\n"+
                    "\n* En un día laboral promedio, el sistema metro moviliza un promedio de 1,1 millones de usuarios en todas sus líneas.\n"+
                
                    "\n* Las horas del día con más usuarios en el sistema metro en todas sus líneas son las 6:00 AM y las 5:00PM\n"+
                    "movilizando en promedio 102.000 y 118.000 usuarios respectivamente.\n"+
                    "\n***  Es por este motivo que MetroData le recomienda evitar el uso del sistema durante estas horas si quiere viajar con mayor comodidad\n"+
                    "y evitar posibles extra tiempos durante su viaje por la alta afluencia de usuarios.  ***\n"+
                    "\n***************************************\n"
                    ;
                    System.out.println(numUsuarios);
                        break;
                    default:
                        System.out.println("\nERROR: Selección inválida...\n");
                    break;
                }
            System.out.println("\nDigite nuevamente el número de la información que desea visualizar: \n");
            num = entrada.nextInt();
        }
    
        entrada.close();
    }
}
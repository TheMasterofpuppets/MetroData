import java.util.Scanner;

public class InfoMetro{
    // Basado en la información Datos Abiertos Metro mes de septiembre del 2022

        public static void main(String[] args) {
            infoMetro();    
        }

        public static void infoMetro(){

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

                    String estaciones = 
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
                    System.out.println(estaciones);
                        break;

                case 3:
                    String rutasIntegradas = 
                    "\n*********************************************\n" +
                    "\n RUTAS INTEGRADAS DEL SISTEMA\n"+
                    "\n LINEA A\n" +

                    "\nESTACION LA ESTRELLA: \n"+
                    "RUTA 7420 Cañaveralejo, RUTA 7421 Pan de Azúcar, RUTA 9420 Caldas Estrella La 50,\n"+
                    "RUTA 9420 Caldas - La Miel - La Variante, RUTA 9420	Caldas - La Tablaza - La Variante,\n"+
                    "RUTA 9422 Caldas - Los Lagos - La 50, RUTA 318i	Prado - La Estrella,\n"+
                    "RUTA Estrella 3	Estrella ruta 3 - Comfama Metro, RUTA Estrella 5	Estrella ruta 5 - Comfama Metro,\n"+
                    "RUTA Estrella 7A	Estrella ruta 7E - Ferreria Metro - La Estrella\n"+

                    "\nESTACION SABANETA: \n"+
                    "RUTA 318	San Antonio de Prado - Compartir - Pradito - El Descanso, RUTA 319	San Antonio de Prado - El Vergel,\n"+
                    "RUTA Inmaculada, RUTA Aves María, RUTA Casimbas, RUTA Santa María La Nueva - Olivares - Zuleta, RUTA Villa Lía - Santana - San Pío\n"+
                    
                    "\nESTACION ITAGUI: \n"+
                    "RUTA 317	Barichara - Limonar (San Antonio de Prado), RUTA 5420	San Francisco, RUTA 5422	San Francisco,\n"+
                    "RUTA 5423	Cedros de Badajoz - Yarumito, RUTA 6420	Señorial - Trianón, RUTA 7423	Lomitas, RUTA C-SAB-1	La Doctora,\n"+
                    "RUTA Estrella 7	Estrella ruta 7- Ferrería - Metro Itagüí\n"+

                    "\nESTACION ENVIGADO: \n"+
                    "RUTA 6403	Loma del Chocho, RUTA 6404	Loma del Escobero - Farolito, RUTA 6406	El Salado, RUTA 6407	El Dorado - San José - Mangazul, \n"+
                    "RUTA 6408	San Rafael - La Mina, RUTA 6410	Chinguí, RUTA 6402-2	San Lucas 2, RUTA Arenales	Arenales, RUTA Calatrava	Calatrava,\n"+
                    "RUTA Palmas	Alto de Las Palmas, RUTA Alto de las Flores\n"+

                    "\nESTACION AYURA: \n"+
                    "RUTA 6380	Ayurá - San Mateo
6405	Alto de Misael A
6402-1	San Lucas 1
C-ITA	Circular Itagüí"

                    
                    
                    
                    
                    
                    ;
                    System.out.println(rutasIntegradas);
                    break;

                case 4:
                    String horasPico = 

                    "\n***************************************\n"+
                    "\nINFORMACIÓN SOBRE LAS HORAS PICO...\n"+
                    "\nDurante la mañana, la hora pico en el sistema metro rondan entre las 4:30 AM y las 8:00 AM\n"+
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
    }
}
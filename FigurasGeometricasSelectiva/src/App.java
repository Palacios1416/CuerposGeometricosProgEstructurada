import java.util.Scanner;
public class App {
    public static double altura, radio, generatriz, areaZonaEsferica, volumenZonaEsferica;
    public static double areatotal, arealateral, volumen, areaPentagonal, volumenCasquete, areaCasquete;;
    public static double nGrado, arista, area, apotema;
    public static double radiomayor, radiomenor, radiomayorCasquete, alturaCasquete;
    
    public static byte opc;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FIGURAS GEOMETRICAS");
        System.out.println("¿Que figura desea hacer?");
        System.out.println("1) Cilindro");
        System.out.println("2) Cono");
        System.out.println("3) Cuña Esferica");
        System.out.println("4) Dodecaedro");
        System.out.println("5) Esfera");
        System.out.println("6) Hexaedro");
        System.out.println("7) Huso Esferico");
        System.out.println("8) Icosaedro");
        System.out.println("9) Octaedro");
        System.out.println("10) Ortoedro");
        System.out.println("11) Piramide");
        System.out.println("12) Prisma");
        System.out.println("13) Tetraedro");
        System.out.println("14) Tronco de cono");
        System.out.println("15) Tronco de piramide");
        System.out.println("16) Salir");
        
        do {
          opc = scanner.nextByte();  
        } while (opc <1 || opc > 16);
        
        switch (opc) {
            case 1->{
        System.out.println("CILINDRO");
        System.out.print("Introduzca el radio: ");
        radio = scanner.nextDouble();
        System.out.print("Introduzca el altura: ");
        altura = scanner.nextDouble();
        
        arealateral = 2 * (3.1416) * radio * altura;
        areatotal = 2 * (3.1416) * radio * (altura + radio);
        volumen = (3.1416) * (radio * radio) * altura;

        System.out.println("el area lateral es: " + arealateral);
        System.out.println("el area total es: " + areatotal);
        System.out.println("el volumen es: " + volumen);

            }
            case 2->{
        System.out.println("CONO");
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();
        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();

        generatriz = Math.sqrt((altura*altura) + (radio*radio));

        arealateral = (3.1416) * radio * generatriz;
        areatotal = (3.1416) * radio * (generatriz + radio);
        volumen = ((3.1416) * (radio*radio) * altura)/3;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area lateral es: " + arealateral);
        System.out.println("El area total es: "+ areatotal);
        System.out.println("El volumen es: "+ volumen);
            }
            case 3->{
        System.out.println("CUÑA ESFERICA");
        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();
        System.out.print
        ("Ingrese los grados: ");
        nGrado = scanner.nextDouble();

        volumen = (4/3)  * ((3.1416) * (radio*radio*radio) * nGrado)/360;

         System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("El volumen es: "+ volumen);
            }
            case 4->{
        System.out.println("DODECAEDRO");
        System.out.print("Ingrese la arista: ");
        arista = scanner.nextDouble();

        area = 3* (arista*arista) * Math.sqrt(25 + (10 * (Math.sqrt(5))));
        volumen = ((15 + (7 * (Math.sqrt(5))))/4) * (arista * arista * arista);
        apotema = arista/(1.45);
        areaPentagonal = ((5 * arista)/2) * apotema;

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("El area es: "+ area);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El area pentagonal es: " + areaPentagonal);
            }
            case 5->{
        System.out.print("Ingrese el radio: ");
        radio = scanner.nextDouble();
        
        area = 4 * (3.1416) * (radio*radio);
        volumen = (1.33) * (3.1416) * radio*radio*radio;

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("El area es: "+area);
        System.out.println("El volumen es: "+volumen);

        //termina calculo de la esfera

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("ZONA ESFERICA");
        /*se vuelven a pedir los valores porque es un calculo de una zona
          en especifico de la esfera */
        System.out.print("Ingrese el radio mayor: ");
        radiomayor = scanner.nextDouble();
        System.out.print("Ingrese el radio menor: ");
        radiomenor = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = scanner.nextDouble();

        System.out.println("::::::::::::::::::::::::::::::");
        areaZonaEsferica = 2 * (3.1416) * radiomayor * altura;
        volumenZonaEsferica = ((3.1416) * altura * ((altura*altura) + 3*(radiomenor*radiomenor) + 3*(radiomayor*radiomayor)))/6;
        System.out.println("el area de la zona esferica es: "+ areaZonaEsferica);
        System.out.println("el voluemen de la zona esfercia es: "+ volumenZonaEsferica);

        //termina calculo de la zona esferica

        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("CASQUETE ESFERICO");
        /*se vuelven a pedir los valores porque es un calculo de una zona
          en especifico de la esfera */
        System.out.print("Ingrese el radio mayor: ");
        radiomayorCasquete = scanner.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        alturaCasquete = scanner.nextDouble();

        System.out.println("::::::::::::::::::::::::::::::");
        areaCasquete = 2 * (3.1416) * radiomayorCasquete * alturaCasquete;
        volumenCasquete = (((3.1416) * (alturaCasquete*alturaCasquete)) * ((3*radiomayorCasquete) - alturaCasquete))/3;
        System.out.println("el area del casquete esferico es: "+ areaCasquete);
        System.out.println("el volumen del casquete esferico es: "+ volumenCasquete);
            }
            case 6->{

            }
            case 7->{

            }
            case 8->{

            }
            case 9->{

            }
            case 10->{

            }
            case 11->{

            }
            case 12->{

            }
            case 13->{

            }
            case 14->{

            }
            case 15->{

            }
            case 16->{

            }
        
                
        }
    }
}

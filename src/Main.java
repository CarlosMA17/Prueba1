import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        Impresora impresora = new Impresora(false);
        String tamaño;
        String nombre;

        while (salida) {

            System.out.println("\nSeleccione una opción:\n" +
                    "1.\tEncender impresora.\n" +
                    "2.\tApagar impresora.\n" +
                    "3.\tAñadir trabajo.\n" +
                    "4.\tVer lista de trabajos\n" +
                    "5.\tImprimir\n" +
                    "6.\tSalir.\n");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("encendiendo impresora...\n");
                    impresora.encender();
                    System.out.println("impresora encendida\n\n");
                    break;
                case 2:
                    System.out.println("apagando impresora...\n");
                    impresora.apagar();
                    System.out.println("impresora apagada\n\n");

                    break;
                case 3:
                    System.out.println("introduzca el trabajo que quiere añadir:");
                    System.out.println("introduzca el nombre:");
                    sc = new Scanner(System.in);
                    nombre = sc.nextLine();
                    System.out.println("introduzca el tamaño del archivo:");
                    tamaño = sc.nextLine();
                    System.out.println("creando y añadiendo trabajo...");
                    Documento documento = new Documento(nombre, tamaño);
                    impresora.añadirTrabajo(documento);
                    break;
                case 4:
                    System.out.println(impresora);
                    break;
                case 5:
                    String impresion = impresora.toString();
                    impresora.eliminarLista();
                    System.out.println(impresion);
                    break;
                case 6:
                    salida=false;
                    break;
            }

        }

    }
}

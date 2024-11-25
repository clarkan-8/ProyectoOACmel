//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
int prioridad, tiempoD, tiempoI,tiempoPro,opc;
String dispositivo;
boolean bandera=true;
while (bandera){
            System.out.println("\tBienvenido al Proyecto de OAC\nNombre:Melany González\nElija una de las opciones\n1.Agregar\n2.Ejecutar\n3.Imprimir elementos\n4. Salir");
       opc=sn.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Escriba el nombre del dispositivo");
                dispositivo = sn.next();
                System.out.println("Escriba la prioridad");
                prioridad = sn.nextInt();
                System.out.println("Escriba el tiempo de espera");
                tiempoD = sn.nextInt();
                System.out.println("Escriba el tiempo de inicio");
                tiempoI = sn.nextInt();
                System.out.println("Escriba el tiempo de procesamiento");
            case 2:
                System.out.println("ejucutando...");
            case 3:
                System.out.println("--------------------------------------\n|Imprimiendo Dispositivos y prioridad|\n--------------------------------------");

            case 4:
                bandera = false;
        }
    System.out.println("Saliendo del programa");
        }
    }
}
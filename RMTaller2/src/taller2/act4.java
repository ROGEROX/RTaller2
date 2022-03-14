package taller2;
import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
       int ndias;
       float km,gasolina,kilometroLitro,estacionamiento,peaje;
       
       Scanner vr = new Scanner(System.in);
       System.out.print("Cuantos días ha durado el viaje: ");
       ndias = vr.nextInt();
       System.out.print("Cuantos kilometros recorrio: ");
       km = vr.nextFloat();
       System.out.print("Costo del litro de gasolina: ");
       gasolina = vr.nextFloat();
       
       kilometroLitro = km*gasolina/ndias;
       System.out.print("Costo del estacionamiento: ");
       estacionamiento = vr.nextFloat();
       System.out.print("Costo del peaje: ");
       peaje = vr.nextFloat();
       
        System.out.printf("\nEl total a pagar por el viaje realizado es de %.2f\n",
        kilometroLitro+estacionamiento*ndias+peaje*ndias);
    }
}

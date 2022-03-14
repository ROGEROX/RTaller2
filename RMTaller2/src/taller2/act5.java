package taller2;
import java.util.Scanner;
        
public class act5 {
    public static void main(String[] args) {
        int man=52,piñ=55,per=55,nar=45,fre=32,mel=54,nunM,nunPi,nunPe,nunN,nunF,nunMe,calTotal,calM,calPi,calPe,calN,calF,calMe;
        
        Scanner cal = new Scanner(System.in);
        System.out.print("¿Cuantas manzanas desea comer? ");
        nunM = cal.nextInt();
        calM = nunM*man;
        
        System.out.print("¿Cuantas piñas desea comer? ");
        nunPi = cal.nextInt();
        calPi = nunPi*piñ;
        
        System.out.print("¿Cuantas peras desea comer? ");
        nunPe = cal.nextInt();
        calPe = nunPe*per;
        
        System.out.print("¿Cuantas naranjas desea comer? ");
        nunN = cal.nextInt();
        calN = nunN*nar;
        
        System.out.print("¿Cuantas fresas desea comer? ");
        nunF = cal.nextInt();
        calF = nunF*fre;
        
        System.out.print("¿Cuantos melones desea comer? ");
        nunMe = cal.nextInt();
        calMe = nunMe*mel;
        
        calTotal =calM+calPi+calPe+calN+calF+calMe;
        
        System.out.printf("El total de calorias consumidas son: %d\n",calTotal);
        
    }
    
}

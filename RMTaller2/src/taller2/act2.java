package taller2;

public class act2 {
    public static void main(String[] args) {
        
        float dato1=15,dato2=20,dato3=25;
        
        float suma = dato1+dato2+dato3;
        float prom = suma/3;
        float producto = dato1*dato2*dato3;
        float cociente = (dato1+dato2)/dato3;
        float mod = (dato1+dato2)%dato3;
        
        System.out.printf("Los numeros son: %.0f,%.0f,%.0f\n", dato1,dato2,dato3);
        System.out.printf("Suma %.2f\nPromedio: %.2f\nProducto: %.2f\nCociente: "
                + "%.2f\nModulo: %.2f\n", suma,prom,producto,cociente,mod);
    }
    
}

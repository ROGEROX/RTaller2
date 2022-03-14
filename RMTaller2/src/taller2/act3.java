package taller2;

public class act3 {
    public static void main(String[] args) {
        String producto = "Televisor";
        float precio = 2500000;
        
        float IVA = precio * 0.19f;
        float ingresos = 4000000;
        float utilidad = (ingresos - precio)/ingresos;
        float precioParcial = precio * utilidad + IVA;
        
        float precioFinal = precio + precioParcial;
        
        System.out.printf("El precio del %s es de %.2f\n",producto,precioFinal);
    }
}

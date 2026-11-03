package Taller_Cafeteria;

public class Ejercico_2 {
    public static void main(String[] args) {
        double subtotal = 44500.0;
        double limiteDescuento = 30000.0;
        double porcentajeDescuento= 0.15;

        boolean tieneDescuento = subtotal > limiteDescuento;
        double  valorDescuento = tieneDescuento ? (subtotal * porcentajeDescuento) : 0.0;
        double  totalValor= subtotal - valorDescuento;
        System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDescuento);
        System.out.printf("Valor del descuento: $%,.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%,.2f%n", totalValor);



    }
}

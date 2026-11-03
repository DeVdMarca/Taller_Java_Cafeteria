package Taller_Cafeteria;

public class Ejercicio_1 {
    public static void main(String[] args) {

        // ejericio 1

        String  nombrePructo ="Avena";
        double precioUnitario = 5.500;
        int  cantidadInventario = 10;
        boolean disponible = true;
        char codigoProducto = 'A';

        System.out.println(String.format("producto:  %s" , nombrePructo));
        System.out.println(String.format("precio unitario:  $%.2f" , precioUnitario));
        System.out.println(String.format("cantidad de inventario: %d unidades" , cantidadInventario));
        System.out.println(String.format("¿Está disponible hoy?: %b" , disponible));
        System.out.println(String.format("Código del producto: %c" , codigoProducto));




    }
}

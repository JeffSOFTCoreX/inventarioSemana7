package app;

import modelo.Producto;

public class Principal {

    public static void main(String[] args) {

        Producto producto = new Producto("Teclado", 10);

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Stock inicial: " + producto.getStock());

        producto.setStock(15);
        
        
        producto.setStock(-5);
        


        System.out.println("Stock actualizado: " + producto.getStock());
    }
}
package Inventario;

import java.util.HashMap;

public class AppInventarioSupermercado {
    public static void main(String[] args) {
        
        Producto producto = new Producto("1234N", "Teclado",50.0, 100);
    }

    public static void menu() {
        System.out.println("---- Inventario ----");
        System.out.println("1. Añadir producto");
    }
}

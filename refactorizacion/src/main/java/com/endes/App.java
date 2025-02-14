package com.endes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductManager manager = new ProductManager();

        // Agregar productos
        manager.addProduct("Monitor", 250);
        manager.addProduct("Teclado", 50);
        manager.addProduct("Mouse", 25);
        manager.addProduct("Impresora", 150);

        // Listar productos
        manager.listProducts();

        // Buscar productos
        manager.findProduct("Teclado");
        manager.findProduct("Scanner"); // Producto ine
    }
}

package com.endes;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	 private List<Producto> products;

	    public ProductManager() {
	        products = new ArrayList<>();
	    }
	    public void addProduct(String name, double price) {
	        try {
	            Producto product = new Producto();
	            products.add(product);
	            System.out.println("Producto agregado: " + product);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error al agregar producto: " + e.getMessage());
	        }
	    }
	    public void listProducts() {
	        if (products.isEmpty()) {
	            System.out.println("No hay productos para listar.");
	            return;
	        }
	        for (int i = 0; i < products.size(); i++) {
	            System.out.println("Producto " + (i + 1) + ": " + products.get(i));
	        }
	    }
	    public void findProduct(String searchName) {
	        Producto foundProduct = null;
	        for (Producto product : products) {
	            if (product.getName().equalsIgnoreCase(searchName)) {
	                foundProduct = product;
	                break;
	            }
	        }
	        if (foundProduct != null) {
	            System.out.println("Producto encontrado: " + foundProduct);
	        } else {
	            System.out.println("Producto no encontrado: " + searchName);
	        }
	    }
	}


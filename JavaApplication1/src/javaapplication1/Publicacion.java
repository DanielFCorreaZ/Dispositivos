/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class Publicacion {
      Scanner lector = new Scanner (System.in);
private String precio, nombre;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio() {
        System.out.println("Ingrese el precio de la obra");
        precio = lector.next();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre de la obra");
        nombre = lector.next();
    }

}

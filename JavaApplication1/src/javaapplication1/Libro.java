/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author multi05
 */
public class Libro extends Publicacion {
 private String año,numpag;

    public String getAño() {
        return año;
    }

    public void setAño() {
        System.out.println("Ingrese el año de publicacion del libro");
        año =lector.next();
    }

    public String getNumpag() {
        return numpag;
    }

    public void setNumpag() {
        System.out.println("Ingrese el numero de paginas del libro");
        numpag = lector.next();
    }


    }
 


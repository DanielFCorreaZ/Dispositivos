/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Disco extends Publicacion {
 private String tiempo;

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo() {
      System.out.println("Ingrese la duracion en minutos del disco");
        tiempo =lector.next();
    }


 
}

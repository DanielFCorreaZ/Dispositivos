/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto19;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class circulo {
 private double radio;
 Scanner lector = new Scanner (System.in);
    public double getRadio() {
        return radio;
    }

    public void setRadio() {
        System.out.println("Ingresar el radio");
        radio = lector.nextDouble();
    }
    public double area(){
        return radio*radio*Math.PI;
    }
    public double perim(){
        return 2*Math.PI*radio;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto19;

/**
 *
 * @author ASUS
 */
public class cilindrohueco extends cilindro {
  private double radioint;

    public double getRadioint() {
        return radioint;
    }

    public void setRadioint() {
        System.out.println("Ingresar el radio el cilindro hueco");
        radioint =lector.nextDouble();
    }
    
    public double areacihu(){
        return (area()-(2*Math.PI*radioint*radioint)+(2*Math.PI*radioint*getAltura()));
    }
    public double volucihu(){
        return (volumen()-(getAltura()*radioint*Math.PI));
    }
}

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
public class cilindro extends circulo {
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura() {
        System.out.println("Ingresar la altura");
        altura =lector.nextDouble();
    }
    public double areaci(){
        return ((perim()*altura)+(2*area()));
    }
    public double volumen(){
        return area()*altura;
    }
}

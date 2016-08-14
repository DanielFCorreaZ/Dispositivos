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
public class Principal {
  public static void main(String[] args){ 
        // TODO code application logic here
    int op;
    Scanner lector = new Scanner (System.in);
    circulo circu = new circulo();
    cilindro cili = new cilindro();
    cilindrohueco cilihue = new cilindrohueco();
    
do{    
   System.out.println("Digite el numero de la accion a realizar: "); 
   System.out.println("1.Ingresar datos del circulo");
   System.out.println("2.Ingresar datos del cilindro");
   System.out.println("3.ingresar datos del cilindro hueco");
   System.out.println("4.Visualizar datos del circulo");
   System.out.println("5.Visualizar datos del cilindro");
   System.out.println("6.Visualizar datos del cilindro hueco");
   System.out.println("0.Salir"); 
   op=lector.nextInt();
switch(op){
    case 0: break;
    case 1: circu.setRadio();
        break;
    case 2: cili.setRadio();
            cili.setAltura();
        break;
    case 3: cilihue.setRadio();
            cilihue.setAltura();
            cilihue.setRadioint();
        break;
    case 4: System.out.println("El area: "+circu.area()+" Perimetro: "+circu.perim());  
        break;    
    case 5: System.out.println("El area: "+cili.areaci()+" Volumen: "+cili.volumen());  
        break;
    case 6: System.out.println("El area: "+cilihue.areacihu()+" Volumen: "+cilihue.volucihu());  
        break;
    
    default: System.out.println("Numero incorrecto"); 
}  
}while(op!=0);    
}

}  


/*
 16. Una editorial de libros y discos desea crear fichas que almacenen el título y el precio de
cada publicación. Crear la correspondiente clase (denominada Publicación) que implemente
los datos anteriores. A partir de esta clase, diseñar dos clases derivadas: Libro, con el
número de páginas, año de publicación y precio; y la clase Disco, con duración en minutos y
precio Cada una de las tres clases tendrá una función mostrar(), para visualizar sus datos.
Escribir un programa que cree instancias de las clases Libro y Disco, solicite datos al usuario
y a continuación los visualice.

 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author multi05
 */
public class JavaClases4 {
public static void main(String[] args){ 
        // TODO code application logic here
    int op;
    Scanner lector = new Scanner (System.in);
    Libro libro = new Libro();
    Disco disco = new Disco();
    
do{    
   System.out.println("Digite el numero de la accion a realizar: "); 
   System.out.println("1.Ingresar datos de libro");
   System.out.println("2.Ingresar datos de disco");
   System.out.println("3.Visualizar libro");
   System.out.println("4.Visualizar disco");
   System.out.println("0.Salir"); 
   op=lector.nextInt();
switch(op){
    case 0: 
        break;
    case 1:  libro.setNombre();
             libro.setPrecio();
             libro.setAño();
             libro.setNumpag();             
        break;
    case 2:  disco.setNombre();
             disco.setPrecio();
             disco.setTiempo();
        break;
    case 3:  System.out.println("Nombre: "+libro.getNombre()+" Precio: "+libro.getPrecio()+" Año de publicacion "+libro.getAño()+" Numero de paginas: "+libro.getNumpag());
        break;    
    case 4:  System.out.println("Nombre: "+disco.getNombre()+" Precio: "+disco.getPrecio()+" Duracion en minutos: "+disco.getTiempo());
        break;
 
    default: System.out.println("Numero incorrecto"); 
}  
}while(op!=0);    
}

}
    

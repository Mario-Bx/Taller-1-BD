/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1Libros;

/**
 *
 * @author Mario-Bx
 */
public class ConjuntoLibros {
    
    
    public static void main(String[] args) {
        
        Libros a[]=new Libros[10];
        Libros L; 
        
        a[0]=L=new Libros("MArio", "Remo de Nat", 90, 8);
        a[1]=L=new Libros("Markos", "Luna nueva", 980, 3);
        a[2]=L=new Libros("Antontio", "-caminando", 89, 6);
        
        a[0].imprimir();
        
        
    }
    
    
    
}

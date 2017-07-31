/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Mario-Bx
 */
public class Persona {
    
    String nombre;
    String apellido;
    int ceduala;
    int telefono;

    public Persona(String nombre, String apellido, int ceduala, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ceduala = ceduala;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCeduala() {
        return ceduala;
    }

    public void setCeduala(int ceduala) {
        this.ceduala = ceduala;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + ", APellido: " + apellido + ", #Cc: " + ceduala + ", Telefono: " + telefono + '}';
    }
    
    
//    public void imprimir(){
//        System.out.println("Nombre: " + nombre + ", APellido: " + apellido + ", #Cc: " + ceduala + ", Telefono: " + telefono);
//    }
    
//    public static void main(String[] args) {
//        Persona p = new Persona("Mario", "bolaños", 1019, 312);
//        
//        p.imprimir();
//    }
    
}

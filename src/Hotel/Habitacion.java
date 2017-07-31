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
public class Habitacion {
    int numHabitaciobn;
    int maxOcupantes;
    Persona responsable;
    int precio;
    Persona [] huespedes; 

    public Habitacion(int numHabitaciobn, int maxOcupantes, Persona responsable, int precio) {
        this.numHabitaciobn = numHabitaciobn;
        this.maxOcupantes = maxOcupantes;
        this.responsable = responsable;
        this.precio = precio;
        huespedes = new Persona[maxOcupantes];
    }

    public Persona[] getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(Persona[] huespedes) {
        this.huespedes = huespedes;
    }

    public int getNumHabitaciobn() {
        return numHabitaciobn;
    }

    public void setNumHabitaciobn(int numHabitaciobn) {
        this.numHabitaciobn = numHabitaciobn;
    }

    public int getMaxOcupantes() {
        return maxOcupantes;
    }

    public void setMaxOcupantes(int maxOcupantes) {
        this.maxOcupantes = maxOcupantes;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "Habitacion{" + "numHabitaciobn=" + numHabitaciobn + ", maxOcupantes=" + maxOcupantes + ", responsable=" + responsable + ", precio=" + precio + '}';
    }
    
    
    
    
    public static void main(String[] args) {
        Habitacion h = new Habitacion(23, 3, new Persona("Mario", "bolaños", 1019, 312), 2346534);
        System.out.println(h.getResponsable());
        Persona p;
        
        h.huespedes[0]=p=new Persona("", "", 0, 0);
        h.huespedes[1]=p=new Persona("Nataly", "Vega", 1223, 210);
        
        System.out.println(h.huespedes[0].toString());
        
        
        
        
    }
}

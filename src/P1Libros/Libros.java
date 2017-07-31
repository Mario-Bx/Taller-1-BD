/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1Libros;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 * @author Mario-Bx
 */
public class Libros {

    //variables nativas de la clase// this.(Referencia a las variablesnativas)
    String titulo;
    String autor;
    int Npag;
    int calificacion;

    ////Construcntor
    public Libros(String T, String A, int N, int C) {
        this.titulo = T;
        this.autor = A;
        this.Npag = N;
        if (C <= 10 && C > 0) {
            this.calificacion = C;
        }
    }
    // Metodos
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpag() {
        return Npag;
    }

    public void setNpag(int Npag) {
        this.Npag = Npag;
    }

    public int getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(int calificacion) {    
        this.calificacion = calificacion;
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", #Paginas: " + Npag + ", Calificacion: " + calificacion);
    }

}

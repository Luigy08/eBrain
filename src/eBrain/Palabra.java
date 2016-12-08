/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import java.util.LinkedList;

/**
 *
 * @author luigy
 */
public class Palabra {
    private String nombre;
    private LinkedList<ConexionConceptual> adyacencias;

    public Palabra() {
    }

    public Palabra(String nombre, LinkedList<ConexionConceptual> adyacencias) {
        this.nombre = nombre;
        this.adyacencias = adyacencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<ConexionConceptual> getAdyacencias() {
        return adyacencias;
    }

    public void setAdyacencias(LinkedList<ConexionConceptual> adyacencias) {
        this.adyacencias = adyacencias;
    }

    @Override
    public String toString() {
        return "Palabra{" + "nombre=" + nombre + ", adyacencias=" + adyacencias + '}';
    }
    
}

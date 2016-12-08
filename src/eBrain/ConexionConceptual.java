/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

/**
 *
 * @author luigy
 */
public class ConexionConceptual {
    private String id;
    private int importancia;
    private Palabra cabeza;
    private Palabra cola;

    public ConexionConceptual() {
    }

    public ConexionConceptual(String id,int importancia, Palabra cabeza, Palabra cola) {
        this.importancia = importancia;
        this.cabeza = cabeza;
        this.cola = cola;
        this.id = id;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public Palabra getCabeza() {
        return cabeza;
    }

    public void setCabeza(Palabra cabeza) {
        this.cabeza = cabeza;
    }

    public Palabra getCola() {
        return cola;
    }

    public void setCola(Palabra cola) {
        this.cola = cola;
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return "ConexionConceptual{" + "importancia=" + importancia + ", cabeza=" + cabeza + ", cola=" + cola + '}';
    }
    
}
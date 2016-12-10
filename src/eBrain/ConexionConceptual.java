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
    private Palabra puntoA;
    private Palabra puntoB;

    public ConexionConceptual() {
    }

    public ConexionConceptual(String id, int importancia, Palabra puntoA, Palabra puntoB) {
        this.id = id;
        this.importancia = importancia;
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public Palabra getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Palabra puntoA) {
        this.puntoA = puntoA;
    }

    public Palabra getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Palabra puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "ConexionConceptual{" + "Id: " + id + ", Importancia: " + importancia + ", puntoA: " + puntoA + ", puntoB: " + puntoB + '}';
    }
    

   
    
}

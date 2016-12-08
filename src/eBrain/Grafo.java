/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import org.graphstream.graph.Graph;

/**
 *
 * @author danie
 */
public class Grafo {
    private Graph mapa;

    public Grafo() {
    }

    public Grafo(Graph mapa) {
        this.mapa = mapa;
    }

    public Graph getMapa() {
        return mapa;
    }

    public void setMapa(Graph mapa) {
        this.mapa = mapa;
    }
    public void addPalabra(Palabra p){
        mapa.addNode(p.getNombre());
    }
    public void addConexion(ConexionConceptual conexion){
        mapa.addEdge(conexion.getId(),conexion.getCabeza().getNombre(),conexion.getCola().getNombre(),true)
                .setAttribute("weight", conexion.getImportancia());        
    }    
    
}

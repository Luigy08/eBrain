/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import java.util.LinkedList;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author luigy
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mapaMental g = new mapaMental();
        Palabra p = new Palabra("Daniel");
        Palabra p2 = new Palabra("Danie2");
        g.getMapa().addNode(p.getNombre());
        g.getMapa().addNode(p2.getNombre());
        ConexionConceptual c = new ConexionConceptual("AB",5,p,p2);
        g.addConexion(c);
        
        //Graph grafo = new SingleGraph("Mapa");
        //grafo.addNode(p.getNombre());
        //g.addPalabra(p);
        
    }
    
}

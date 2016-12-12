/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import java.io.IOException;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.algorithm.Dijkstra.Element;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author luigy
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Graph graph = new SingleGraph("Tutorial 1");
 	graph.addNode("A" );
	graph.addNode("B" );
	graph.addNode("C" );
        
	graph.addEdge("AB", "A", "B");
	graph.addEdge("BC", "B", "C");
	graph.addEdge("CA", "C", "A");
        int cont=1;
        for (Edge e : graph.getEachEdge()) {
            e.addAttribute("length", cont);
           // e.addAttribute("ui.style", "fill-color: blue;");
            cont++;
        }
        
        Dijkstra d=new Dijkstra(Element.EDGE, "weight", "length");
        Graph mapa = graph;
        
        d.init(mapa);
        d.setSource(mapa.getNode("A"));
        d.compute();
        
        for (Node node : d.getPathNodes(mapa.getNode("C"))) {
            node.addAttribute("ui.style", "fill-color: blue;"); 
        }
        for (Edge edge : d.getTreeEdges()) 
             edge.addAttribute("ui.style", "fill-color: red;");
        for (Node node : mapa) 
             System.out.printf("%s->%s:%6.2f%n", d.getSource(), node, d.getPathLength(node)); 
        
        
        mapa.display().setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);
         
        
    }
}

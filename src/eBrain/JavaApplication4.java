/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBrain;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.layout.HierarchicalLayout;
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
        Graph graph = new SingleGraph("Test");

            Viewer viewer = graph.display(false);
            HierarchicalLayout hl = new HierarchicalLayout();
            viewer.enableAutoLayout(hl);
            graph.setStrict(false);
            graph.setAutoCreate(false); 
            graph.addNode("A" );        
            graph.addNode("B" );
            graph.addNode("C" );
            graph.addNode("D");
            graph.addNode("E");


            graph.getNode("A").addAttribute("ui.label", "A");
            graph.getNode("B").addAttribute("ui.label", "B");
            graph.addEdge("A-B", "A", "B",true);
            graph.addEdge("A-C", "A", "C",true);
            graph.addEdge("B-D", "B", "D",true);
            graph.addEdge("B-E", "B", "E",true);
                
    }
}

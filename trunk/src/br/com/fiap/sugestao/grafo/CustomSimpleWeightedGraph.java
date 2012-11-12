package br.com.fiap.sugestao.grafo;

import org.jgrapht.graph.SimpleWeightedGraph;

public class CustomSimpleWeightedGraph<V, E> extends SimpleWeightedGraph<V, E>
{
	private static final long serialVersionUID = 1L;

	public CustomSimpleWeightedGraph(Class<? extends E> edgeClass) {
		super(edgeClass);
		// TODO Auto-generated constructor stub
	}
        @Override
	public void setEdgeWeight(E e, double weight) {
	    super.setEdgeWeight(e, weight);
	    ((MyWeightEdge)e).setWeight(weight);
        }        
}

package br.com.fiap.sugestao.grafo;

import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class MyWeightEdge extends DefaultWeightedEdge
{
	private static final long serialVersionUID = 1L;
	public double weight = WeightedGraph.DEFAULT_EDGE_WEIGHT;;
	public String ret = "";
       
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
        
        @Override
	public String toString()
	{
		ret = String.valueOf(weight);
		return(ret);
	}
}
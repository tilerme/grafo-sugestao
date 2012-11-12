package br.com.fiap.sugestao.grafo;

import java.util.ArrayList;
import java.util.HashSet;

import br.com.fiap.sugestao.Visitacao.Visitacao;

public class Vertice 
{
	private String vertice;
	private String descricao;
	
	public Vertice(String vertice)
	{
		this.vertice = vertice;
	}
	public Vertice()
	{
	}
	
	public String getVertice() {
		return vertice;
	}

	public void setVertice(String vertice) {
		this.vertice = vertice;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public HashSet<Vertice> getVertices(ArrayList<Visitacao> visitacoes)
	{
		HashSet<Vertice> vertices = new HashSet<Vertice>();
		
		for (Visitacao visit : visitacoes)
		{
			vertices.add(new Vertice(visit.getPerfil().getPerfil()));
			vertices.add(new Vertice("I"+visit.getProduto().getCodigo()));
		}
		return(vertices);
	}

	public boolean equals(Object obj)
	{
        if (obj == this) return true;  
        Vertice outro = (Vertice) obj;  
        return this.vertice.equals(outro.vertice);  
	}
	public int hashCode() {
		return 0;
	}
}

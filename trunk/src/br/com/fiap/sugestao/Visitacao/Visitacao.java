package br.com.fiap.sugestao.Visitacao;

import java.io.Serializable;

import br.com.fiap.sugestao.Visitacao.Perfil;
import br.com.fiap.sugestao.Visitacao.Produto;

public class Visitacao implements Serializable
{
	private static final long serialVersionUID = -4229299563351979580L;
	private Produto produto;
	private Perfil perfil;
	private int idade;
	private String sexo;	
	
	public Visitacao(Produto produto, int idade, String sexo)
	{
		this.perfil = new Perfil(idade,sexo);
		this.sexo = sexo;
		this.produto = produto;
		this.idade = idade;		
	}

	public Produto getProduto() {
		return produto;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}
}


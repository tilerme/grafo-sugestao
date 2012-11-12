package br.com.fiap.sugestao.Visitacao;

import java.io.Serializable;

public class Produto implements Serializable
{
	private static final long serialVersionUID = 8109594410174631680L;
	private int codigo;
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}

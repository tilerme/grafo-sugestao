package br.com.fiap.sugestao.Visitacao;

import java.io.Serializable;

public class Perfil  implements Serializable
{
	private static final long serialVersionUID = -357034351771285768L;
	private String perfil;
	private String descricao;
	private String sexo;
	
	public Perfil(int idade, String sexo)
	{
		setPerfil(idade,sexo);
	}
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(int idade, String sexo) {
		this.sexo = sexo;
		
		if(idade > 0 && idade <= 12)
		{
			descricao = "Criança";
			if(sexo.equals("M"))
				perfil	= "P01M";
			else
				perfil	= "P01F";
		}
		else if(idade <= 18)
		{
			descricao = "Adolescente";
			if(sexo.equals("M"))
				perfil	= "P02M";
			else
				perfil	= "P02F";
		}
		else if(idade <= 30)
		{
			descricao = "Adulto1";
			if(sexo.equals("M"))
				perfil	= "P03M";
			else
				perfil	= "P03F";
		}
		else if(idade <= 40)
		{
			descricao = "Adulto2";
			if(sexo.equals("M"))
				perfil	= "P04M";
			else
				perfil	= "P04F";
		}
		else if(idade <= 50)
		{
			descricao = "Adulto3";
			if(sexo.equals("M"))
				perfil	= "P05M";
			else
				perfil	= "P05F";
		}
		else if(idade <= 60)
		{
			descricao = "Adulto4";
			if(sexo.equals("M"))
				perfil	= "P06M";
			else
				perfil	= "P06F";;
		}
		else
		{
			descricao = "Idoso";
			if(sexo.equals("M"))
				perfil	= "P07M";
			else
				perfil	= "P07F";
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

package br.com.fiap.sugestao.grafo;

import java.util.ArrayList;

import br.com.fiap.sugestao.Visitacao.Visitacao;

public class Aresta {

    private String de;
    private String para;
    private int peso;

    public Aresta(String de, String para, int peso) {
        this.de = de;
        this.para = para;
        this.peso = peso;
    }

    public Aresta() {
    }

    public ArrayList<Aresta> getArestas(ArrayList<Visitacao> visitacoes) {
        ArrayList<Aresta> arestas = new ArrayList<Aresta>();
        String auxde;
        String auxpara;
        boolean para = false;
        for (Visitacao visitacao : visitacoes) {
            auxde = visitacao.getPerfil().getPerfil();
            auxpara = "I" + visitacao.getProduto().getCodigo();
            para = false;
            for (Aresta ar : arestas) {
                if (ar.getDe().equals(auxde) && ar.getPara().equals(auxpara)) {
                    ar.peso++;
                    para = true;
                    break;
                }
            }
            if (!para) {
                arestas.add(new Aresta(auxde, auxpara, 1));
            }
        }
        return (arestas);
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
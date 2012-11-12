package br.com.fiap.sugestao.InOut;

import java.util.ArrayList;
import br.com.fiap.sugestao.Visitacao.Visitacao;
import java.io.FileOutputStream;
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class VisitacaoInOut
{
    String caminho = "";
    FileOutputStream fos;  
    ObjectOutputStream oos;  
        public VisitacaoInOut(String caminho)
        {
            this.caminho = caminho;
        }    
	public void IncluirVisitacoes(ArrayList<Visitacao> visitacoes)
	{
        try{
        	File file = new File(caminho);
        	
        	if(file.exists())
        	{
        		file.delete();
        	}   	
            fos = new FileOutputStream(caminho, true);  
            oos = new ObjectOutputStream(fos);  
            oos.writeObject(visitacoes);
            oos.flush();  
            fos.close();  
            oos.close();  
        }catch(IOException ioe){  
            JOptionPane.showMessageDialog(new JFrame(),"Erro na Serializacao!!");  
        }  	
	}
	public ArrayList<Visitacao> LerVisitacoes()
	{
		FileInputStream fis;
		ObjectInputStream ois;
		ArrayList<Visitacao> array = new ArrayList<Visitacao>();
        try{
            fis = new FileInputStream(caminho);  
            ois = new ObjectInputStream(fis);  
			array = (ArrayList<Visitacao>)ois.readObject();
            fis.close();  
            ois.close();  
        }catch(IOException ioe){  
            JOptionPane.showMessageDialog(new JFrame(),"Erro na leitura do arquivo serializado!!");  
        }catch(ClassNotFoundException ioe1){  
            JOptionPane.showMessageDialog(new JFrame(),"Erro na leitura do arquivo serializado!!");   
        }
        return(array);
	}
        public void IncluirVisitacao(Visitacao visitacao)
        {
            ArrayList<Visitacao> arquivo = LerVisitacoes();
            
            arquivo.add(visitacao);
            
            IncluirVisitacoes(arquivo);
        }
}
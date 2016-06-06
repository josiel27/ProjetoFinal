/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;


/**
 *
 * @author jejo
 */
public class Imprimir {
    public void imprimirGrafico(Image image) throws IOException{
           
        FileWriter arq = new FileWriter("D:\\Orcamentos\\Grafico.doc");//cria o arquivo
        PrintWriter gravarArq = new PrintWriter(arq);
        
        
        gravarArq.println("Orçamento Banzos Instituto de Música "); //linha de conteudo do txt
        gravarArq.println(" ");
        gravarArq.println(image);
     
               
        arq.close();

    }

}

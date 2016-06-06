/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jejo
 */
public class ConexaoBanco {
    public Statement stm;//prepara e realiza pesquisa no Banco de Dados
    public ResultSet rs;//armazena o resultado de uma pesquisa passada para o statement
    public String driver = "org.postgresql.Driver";//resp por identificar o serviço de banco de dados
    public String caminho = "jdbc:postgresql://localhost:5432/BanzosPF" ;
    public String usuario = "postgres";
    public String senha = "postgres";
    public Connection conn;// responsalvel por realizar a conexao do banco de dados
    
    public void conecta(){
        try {//tenta conectar
            System.setProperty("jdbc.Drivers", driver);//seta a propiedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão com o banco de dados
        } catch (SQLException ex) {//se nao conseguir conectar, cai aqui
            JOptionPane.showMessageDialog(null, "Erro de conexão com o Banco de Dados!"+ex.getMessage());
        }
    }
    public void ExecutaSQL(String sql){
        try {
            stm = conn.createStatement();
            stm.executeUpdate(sql);//UPDATE usado no lugar de QUERY, para não ter retorno do BD              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL!\n"+ex.getMessage());
        }
    }    
    public void InsertSQL(String sql){
        try {
            stm = conn.createStatement();
            stm.executeUpdate(sql);//UPDATE usado no lugar de QUERY, para não ter retorno do BD  
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadatrar!\n"+ex.getMessage());
        }
    }
    public void UpdateSQL(String sql){
        try {
            stm = conn.createStatement();
            stm.executeUpdate(sql);//UPDATE usado no lugar de QUERY, para não ter retorno do BD  
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!\n"+ex.getMessage());
        }        
    }
    public void SelectSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao executar sql!\n Erro: "+ex.getMessage());

        }
    }
    public void DeleteSQP (String sql){
        try { 
            stm = conn.createStatement();
            stm.executeUpdate(sql);//UPDATE usado no lugar de QUERY, para não ter retorno do BD
            
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql!\n Erro: "+ex.getMessage());
        }
        
    }    
    public void desconecta(){     //metodo para fechar a conexao com o banco
        try {
            conn.close(); //fecha a conexao    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados!\n Erro: "+ex.getMessage());
        }
    }
}

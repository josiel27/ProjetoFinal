/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utilitarios.ConexaoBanco;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Talorne
 */
public class ControladorAproveitamento {
     ConexaoBanco conexao = new ConexaoBanco();
    public void IncluirAproveitamento(String turma, String aluno, Double nota, Double frequencia){  
        conexao.conecta();
        int mat = 0;
        String sql = "SELECT matricula FROM tb_aluno WHERE nome ='"+aluno+"'";
        conexao.SelectSQL(sql);
        
         try {
             conexao.rs.next();
             mat = Integer.parseInt(conexao.rs.getString("matricula"));
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Falha ao achar o aluno");
         }
        
        sql= "UPDATE rl_aluno_turma SET nota = "+nota+", frequencia = "+frequencia+
                    "WHERE matricula ="+ mat;
        conexao.UpdateSQL(sql);           
        conexao.desconecta();
    }
}

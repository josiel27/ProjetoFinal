/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utilitarios.ConexaoBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Talorne
 */
public class ControladorAluno {
    ConexaoBanco conexao = new ConexaoBanco();

    public void IncluirAluno(int matricula, String nome, String cpf, String rg, String telefone, String data_nascimento, String email, String endereco, int cod_sexo, int cod_estado_civil, int cod_situacao_matricula, int cod_plano) {
        conexao.conecta();//incia a conexao ao bd
        String sql = "INSERT INTO tb_aluno(matricula, nome, cpf, rg, telefone, data_nascimento, email, endereco, cod_sexo, cod_estado_civil, cod_situacao_matricula, cod_plano_matricula)\n" +
                     "Values ("+matricula+", '"+nome+"', '"+cpf+"', '"+rg+"', '"+telefone+"', '"+data_nascimento+"', '"+email+"', '"+endereco+"', "+cod_sexo+", "+cod_estado_civil+", "+cod_situacao_matricula+","+cod_plano+")";
        conexao.InsertSQL(sql);        
        conexao.desconecta();
    }
    
    public void AlterarAluno(int matricula, String nome, String cpf, String rg, String telefone, String data_nascimento, String email, String endereco, int cod_sexo, int cod_estado_civil, int cod_situacao_matricula, int cod_plano) {
        conexao.conecta();//incia a conexao ao bd
        String sql = "UPDATE tb_aluno SET nome = '"+nome+"', cpf = '"+cpf+"', rg = '"+rg+"', telefone = '"+telefone+"', \n" +
                     "data_nascimento = '"+data_nascimento+"', email = '"+email+"', endereco = '"+endereco+"', \n" +
                     "cod_sexo = "+cod_sexo+", cod_estado_civil = "+cod_estado_civil+", cod_situacao_matricula = "+cod_situacao_matricula+", \n" +
                     "cod_plano_matricula = "+cod_plano+" \n" +
                     "WHERE matricula = "+matricula+"";
                conexao.UpdateSQL(sql);        
        conexao.desconecta();
    }  
        
    public TableModel listarAlunos() {
        conexao.conecta();//incia a conexao ao bd
         String sql = "SELECT A.matricula, A.nome, A.cpf, A.rg, A.telefone, A.data_nascimento, A.email, A.endereco, S.sexo, EC.estado_civil, SM.situacao_matricula, SM.descricao_situacao\n" +
                            "FROM tb_aluno A \n" +
                            "INNER JOIN \n" +
                            "tb_sexo S \n" +
                            "ON A.cod_sexo = S.cod_sexo \n" +
                            "INNER JOIN \n" +
                            "tb_estado_civil EC \n" +
                            "ON A.cod_estado_civil = EC.cod_estado_civil \n" +
                            " INNER JOIN \n" +
                            "tb_situacao_matricula SM \n" +
                            "ON A.cod_situacao_matricula = SM.cod_situacao_matricula \n" +
                            "Where SM.cod_situacao_matricula = 1 \n" +
                            "ORDER BY matricula ASC";
         
        conexao.SelectSQL(sql);
        
        return DbUtils.resultSetToTableModel(conexao.rs);
    }
    
    public int pegarMatricula() {
        conexao.conecta();//incia a conexao ao bd
        String sql = "SELECT matricula FROM tb_aluno";
        int mat = 0;
        
        try {
            conexao.SelectSQL(sql);
            while (conexao.rs.next()) {
            mat = Integer.parseInt(conexao.rs.getString("matricula"));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAluno.class.getName()).log(Level.SEVERE, null, ex);
        }            
        conexao.desconecta();//fecha a conexao com o BD     
        return mat + 1;
    }

    public void AtualizarSituacaoMatricula(String cpf, String situacao, String descricao) {

    }
    public void IncluirTurmaAluno(int matricula, int cod_turma_periodo) {
        conexao.conecta();//incia a conexao ao bd 
        String sql= "INSERT INTO rl_aluno_turma (matricula, cod_turma_periodo)\n" +
                    "VALUES("+matricula+","+cod_turma_periodo+")"; 
//  Insert sem msg de retorno
        conexao.ExecutaSQL(sql);
        conexao.desconecta();
    }
    
    public TableModel gerarRelatorioAlunosInadimplentes() {
        conexao.conecta();//incia a conexao ao bd
        conexao.SelectSQL("");
        return DbUtils.resultSetToTableModel(conexao.rs);
    }

    public void AlterarTurmaAluno(int matricula, int cod_turma_periodo) {
       conexao.conecta();//incia a conexao ao bd 

       
       String sql= "INSERT INTO rl_aluno_turma (matricula, cod_turma_periodo)\n" +
            "VALUES("+matricula+","+cod_turma_periodo+")";         
        
//  Insere um novo cadastro de turmas sem msg de retorno
        conexao.ExecutaSQL(sql);
        
        conexao.desconecta();//fecha a conexao ao bd 
    }
    


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import MODEL.ConselheiroM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConselheiroDAO {
    
        static public ConselheiroM valida(String user, String senha) throws SQLException{
        PreparedStatement pst;
        String sql;
           sql = "select * from Conselheiro where Login = ? and Senha = ?";
           pst = Conexao.getInstance().prepareStatement(sql);
           pst.setString(1, user);
           pst.setString(2, senha);
           ConselheiroM usuario;
           usuario = null;
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               usuario = new ConselheiroM(rs.getInt("ID"),
                       rs.getString("Nome"), 
                       rs.getString("Telefone"),
                       rs.getString("Celular"),
                       rs.getString("Login"),
                       rs.getString("Senha"));
            }
            pst.close();
            return usuario;
    }
        
        
        static public void salvar (ConselheiroM conselheiro) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Conselheiro values (?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, conselheiro.getNome());
        pst.setString(3, conselheiro.getTelefone());
        pst.setString(4, conselheiro.getCelular());
        pst.setString(5, conselheiro.getLogin()); 
        pst.setString(6, conselheiro.getSenha());        
        pst.execute();
        pst.close();
    }
        
          static public void excluir(ConselheiroM conselheiro) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Conselheiro where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, conselheiro.getId());
        pst.execute();
        pst.close();
    }
          
             static public void alterar(ConselheiroM conselheiro) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Conselheiro set "
                 + "Nome = ?, "
                 + "Telefone = ?, "
                 + "Celular = ?, "
                 + "Login  = ?, "
                 + "Senha  = ?, "
                      
                 + "where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, conselheiro.getNome());
        pst.setString(2, conselheiro.getTelefone());
        pst.setString(3, conselheiro.getCelular());
        pst.setString(4, conselheiro.getLogin());
        pst.setString(5, conselheiro.getSenha());  
        pst.setInt(6, conselheiro.getId());
         pst.execute();
         pst.close();
     }
    
        
    
}

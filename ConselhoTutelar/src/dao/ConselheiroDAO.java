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
    
}

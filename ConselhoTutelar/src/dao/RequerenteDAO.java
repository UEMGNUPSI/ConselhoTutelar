package dao;

import MODEL.RequerenteM;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RequerenteDAO {
    
    static public void Salvar (RequerenteM requerente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Requerente values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, requerente.getNome());
        pst.setString(3, requerente.getNascimento());
        pst.setString(4, requerente.getTelefone1());
        pst.setString(5, requerente.getTelefone2());
        pst.setString(6, requerente.getCelular()); 
        pst.setString(7, requerente.getEndereço());
        pst.setString(8, requerente.getNumero());
        pst.setString(9, requerente.getBairro());
        pst.setString(10, requerente.getCidade());
        pst.setString(11, requerente.getEstado());
        pst.setString(12, requerente.getEstadoCivil());
        pst.setString(13, requerente.getObservação());
        pst.execute();
        pst.close();
    }
       
    static public void Excluir(RequerenteM requerente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Requerente where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, requerente.getId());
        pst.execute();
        pst.close();
    }       
        
    static public void Alterar(RequerenteM requerente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Requerente set "
                 + "Nome = ?, "
                 + "Nascimento = ?, "
                 + "Telefone1 = ?, "
                 + "Telefone2 = ?, "
                 + "Celular  = ?, "
                 + "Endereço  = ?, "
                 + "Numero  = ?, "
                 + "Bairro  = ?, "
                 + "Cidade  = ?, "
                 + "Estado  = ?, "
                 + "EstadoCivil  = ?, "
                 + "Observacao  = ?, "
                
                 + "where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, requerente.getNome());
        pst.setString(2, requerente.getNascimento());
        pst.setString(3, requerente.getTelefone1());
        pst.setString(4, requerente.getTelefone2());
        pst.setString(5, requerente.getCelular());
        pst.setString(6, requerente.getEndereço());  
        pst.setString(7, requerente.getNumero());  
        pst.setString(8, requerente.getBairro());  
        pst.setString(9, requerente.getCidade());  
        pst.setString(10, requerente.getEstado());  
        pst.setString(11, requerente.getEstadoCivil());  
        pst.setString(12, requerente.getObservação());   
        pst.setInt(13, requerente.getId());
        pst.execute();
        pst.close();
     }
    
}

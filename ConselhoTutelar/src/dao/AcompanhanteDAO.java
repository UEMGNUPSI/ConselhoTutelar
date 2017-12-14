
package dao;

import MODEL.AcompanhanteM;
import MODEL.AtendimentoM;
import MODEL.NucleoM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AcompanhanteDAO {
    
        public void Salvar (AcompanhanteM acompanhante) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Acompanhante values (?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, acompanhante.getNome());
        pst.setString(3, acompanhante.getTelefone());
        pst.setString(4, acompanhante.getCelular());
        pst.setString(5, acompanhante.getEndereco());
        pst.setString(6, acompanhante.getNumero());
        pst.setString(7, acompanhante.getBairro());
        pst.setString(8, acompanhante.getCidade());
        pst.setString(9, acompanhante.getEstado());
        pst.setInt(10, acompanhante.getAtendimento_Id().getId());
        
        pst.execute();
        pst.close();
     }
    
        
         public void Excluir(AcompanhanteM acompanhante) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Acompanhante where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, acompanhante.getId());
        pst.execute();
        pst.close();
    } 
         
          public void Alterar(AcompanhanteM acompanhante) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Acompanhante set "
                 + "Nome = ?, "
                 + "Telefone = ?, "
                 + "Celular = ?, "
                 + "Endereço = ?, "
                 + "Numero = ?, "
                 + "Bairro = ?, "
                 + "Cidade = ?, "
                 + "Estado = ? "
                 //+ "Atendimento_ID = ?, "
                 + "where ID = ?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, acompanhante.getNome());
        pst.setString(2, acompanhante.getTelefone());
        pst.setString(3, acompanhante.getCelular());
        pst.setString(4, acompanhante.getEndereco());
        pst.setString(5, acompanhante.getNumero());
        pst.setString(6, acompanhante.getBairro());
        pst.setString(7, acompanhante.getCidade());
        pst.setString(8, acompanhante.getEstado());
        //pst.setInt(9, acompanhante.getAtendimento_Id().getId());        
        pst.setInt(9, acompanhante.getId());
        pst.execute();
        pst.close();
     }
          
              public List<AcompanhanteM> ListaTodos() throws SQLException{ 
    List<AcompanhanteM> listaTodos = new ArrayList<>();

        String sql = "select * from Acompanhante order by Nome ";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new AcompanhanteM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("Telefone"),
                                   rs.getString("Celular"),
                                   rs.getString("Endereço"),
                                   rs.getString("Numero"),
                                   rs.getString("Bairro"),
                                   rs.getString("Cidade"),
                                   rs.getString("Estado"),
                                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID"))));
                                  
          }
    pst.close();
    return listaTodos;
    }
              
    public List<AcompanhanteM> ListaTodosAlterar(int id) throws SQLException{ 
        List<AcompanhanteM> listaTodos = new ArrayList<>();
        String sql = "select * from Acompanhante Where Atendimento_ID = ?  ";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaTodos.add(new AcompanhanteM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("Telefone"),
                                   rs.getString("Celular"),
                                   rs.getString("Endereço"),
                                   rs.getString("Numero"),
                                   rs.getString("Bairro"),
                                   rs.getString("Cidade"),
                                   rs.getString("Estado"),
                                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID"))));
                                  
        }
        pst.close();
        return listaTodos;
    }
    
                static public AcompanhanteM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        AcompanhanteM acompanhante = null;
        
        sql = "select * from Acompanhante where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           acompanhante = new AcompanhanteM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("Telefone"),                                     
                   rs.getString("Celular"),
                   rs.getString("Endereço"),
                   rs.getString("Numero"),
                   rs.getString("Bairro"),
                   rs.getString("Cidade"),
                   rs.getString("Estado"), 
                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID")));
                   
        }
        pst.close();
        
        return acompanhante;
    }
    
        
}

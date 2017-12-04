
package dao;

import MODEL.CriançaM;
import MODEL.NucleoM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NucleoDAO {
    
    public void Salvar (NucleoM nucleo) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into NucleoFamiliar values (?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, nucleo.getNome());
        pst.setString(3, nucleo.getParentesco());
        pst.setString(4, nucleo.getEndereco());        
        pst.setString(5, nucleo.getNumero());
        pst.setString(6, nucleo.getBairro());        
        pst.setString(7, nucleo.getTelefone());
        pst.setString(8, nucleo.getCelular());
        pst.setString(9, nucleo.getResponsabilidade());
        pst.setInt(10, nucleo.getAtendimento_Id().getId());
        
        pst.execute();
        pst.close();
     }
    
      public void Excluir(NucleoM nucleo) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from NucleoFamiliar where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, nucleo.getId());
        pst.execute();
        pst.close();
    }       
    
         public void Alterar(NucleoM nucleo) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update NucleoFamiliar set "
                 + "Nome = ?, "
                 + "Parentesco = ?, "
                 + "Endereco = ?, "
                 + "Numero = ?, "
                 + "Bairro = ?, "
                 + "Telefone = ?, "
                 + "Celular = ?, "
                 + "Responsabilidade = ? "                 
                
                 + "where ID = ?";
        
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, nucleo.getNome());
        pst.setString(2, nucleo.getParentesco());
        pst.setString(3, nucleo.getEndereco());
        pst.setString(4, nucleo.getNumero());
        pst.setString(5, nucleo.getBairro());
        pst.setString(6, nucleo.getTelefone());
        pst.setString(7, nucleo.getCelular());
        pst.setString(8, nucleo.getResponsabilidade());
        //pst.setInt(9, nucleo.getAtendimento_Id().getId());
        
        pst.setInt(9, nucleo.getId());
        pst.execute();
        pst.close();
     }
    
    public List<NucleoM> ListaTodos() throws SQLException{ 
    List<NucleoM> listaTodos = new ArrayList<>();

        String sql = "select * from NucleoFamiliar order by Nome ";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new NucleoM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("Parentesco"),
                                   rs.getString("Endereco"),
                                   rs.getString("Numero"),
                                   rs.getString("Bairro"),
                                   rs.getString("Telefone"),
                                   rs.getString("Celular"),
                                   rs.getString("Responsabilidade"),
                                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID"))));
                                  
          }
    pst.close();
    return listaTodos;
    }
    
     static public NucleoM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        NucleoM nucleo = null;
        
        sql = "select * from NucleoFamiliar where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           nucleo = new NucleoM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("Parentesco"),                                     
                   rs.getString("Endereco"),
                   rs.getString("Numero"),
                   rs.getString("Bairro"),
                   rs.getString("Telefone"),
                   rs.getString("Celular"),
                   rs.getString("Responsabilidade"), 
                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID")));
                   
        }
        pst.close();
        
        return nucleo;
    }
    
}

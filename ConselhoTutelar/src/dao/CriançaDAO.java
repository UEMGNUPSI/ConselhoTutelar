
package dao;


import MODEL.AtendimentoM;
import MODEL.ConselheiroM;
import MODEL.CriançaM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CriançaDAO {
    
     public void Salvar (CriançaM criança) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Crianca values (?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, criança.getNome());
        pst.setString(3, criança.getDataNascimento());
        pst.setString(4, criança.getEndereco());
        pst.setString(5, criança.getNumero());
        pst.setString(6, criança.getBairro());
        pst.setString(7, criança.getTelefone());
        pst.setInt(8, criança.getAtendimento_Id().getId());
        
        pst.execute();
        pst.close();
     }
     
     
      public void Excluir(CriançaM criança) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Crianca where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, criança.getId());
        pst.execute();
        pst.close();
    }       
    
        public void Alterar(CriançaM criança) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Crianca set "
                 + "Nome = ?, "
                 + "DataNascimento = ?, "
                 + "Endereco = ?, "
                 + "Numero = ?, "
                 + "Bairro = ?, "
                 + "Telefone = ? "
                 //+ "Atendimento_ID = ?"
                
                 + "where ID = ?";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, criança.getNome());
        pst.setString(2, criança.getDataNascimento());
        pst.setString(3, criança.getEndereco());
        pst.setString(4, criança.getNumero());
        pst.setString(5, criança.getBairro());
        pst.setString(6, criança.getTelefone());
        //pst.setInt(7, criança.getAtendimento_Id().getId());        
        pst.setInt(7, criança.getId());
        pst.execute();
        pst.close();
     }
        
     
         public List<CriançaM> ListaTodos(int id) throws SQLException{ 
    List<CriançaM> listaTodos = new ArrayList<>();

        String sql = "select * from Crianca where Atendimento_id = ? order by Nome";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
    ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new CriançaM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("DataNascimento"),
                                   rs.getString("Endereco"),
                                   rs.getString("Numero"),
                                   rs.getString("Bairro"),
                                   rs.getString("Telefone"),
                                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID"))));
                                  
          }
    pst.close();
    return listaTodos;
    }
         
    public List<CriançaM> ListaTodosAlterar(int id) throws SQLException{ 
        List<CriançaM> listaTodos = new ArrayList<>();
        String sql = "select * from Crianca where Atendimento_ID = ? order by Nome";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaTodos.add(new CriançaM(
                    rs.getInt("ID"), 
                    rs.getString("Nome"),
                    rs.getString("DataNascimento"),
                    rs.getString("Endereco"),
                    rs.getString("Numero"),
                    rs.getString("Bairro"),
                    rs.getString("Telefone"),
                    AtendimentoDAO.Busca(rs.getInt("Atendimento_ID"))));      
        }
        pst.close();
        return listaTodos;
    }
         
                //"select * from Crianca where Atendimento_ID = ? 
         
    static public CriançaM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        CriançaM criança = null;
        
        sql = "select * from Crianca where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           criança = new CriançaM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("DataNascimento"),
                   rs.getString("Endereco"),
                   rs.getString("Numero"),
                   rs.getString("Bairro"),
                   rs.getString("Telefone"),
                   AtendimentoDAO.Busca(rs.getInt("Atendimento_ID")));
                   
        }
        pst.close();
        
        return criança;
    }
}

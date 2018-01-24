
package dao;


import MODEL.AtendimentoM;
import MODEL.RequerenteM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAO {
    
    
    static public int Salvar (AtendimentoM atendimento) throws SQLException{
        PreparedStatement pst;
        String sql;
        int idAtendimento = 0;
        sql = "insert into Atendimento values (?,?,?,?,?,?,?)";
        pst = pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1,0);
        pst.setString(2, atendimento.getData());
        pst.setString(3, atendimento.getPasta());
        pst.setString(4, atendimento.getRelatoResumido());
        pst.setInt(5, atendimento.getRequerente_id().getId());
        pst.setInt(6, atendimento.getConselheiro1_id().getId());
        pst.setInt(7, atendimento.getConselheiro2_id().getId());
        pst.execute();
        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next()) {
            idAtendimento = rs.getInt(1);
        }
        pst.close();
        return idAtendimento;
    
    }
    
     public void Excluir(AtendimentoM atendimento) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Atendimento where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, atendimento.getId());
        pst.execute();
        pst.close();
    }       
     
     
       public void Alterar(AtendimentoM atendimento) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Atendimento set "
                 + "Data = ?, "
                 + "Pasta = ?, "
                 + "RelatoResumido = ?, "
                 + "Requerente_ID = ?, "
                 + "Conselheiro1_ID = ?, "
                 + "Conselheiro2_ID = ? "
    
                 + "where ID = ?";        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, atendimento.getData());
        pst.setString(2, atendimento.getPasta());
        pst.setString(3, atendimento.getRelatoResumido());
        pst.setInt(4, atendimento.getRequerente_id().getId());
        pst.setInt(5, atendimento.getConselheiro1_id().getId());
        pst.setInt(6, atendimento.getConselheiro2_id().getId());
 
        pst.setInt(7, atendimento.getId());
        pst.execute();
        pst.close();
     }
       
          
    public List<AtendimentoM> ListaTodos() throws SQLException{ 
    List<AtendimentoM> listaTodos = new ArrayList<>();

        String sql = "select * from Atendimento order by Id desc";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new AtendimentoM(rs.getInt("ID"), 
                                   rs.getString("Data"),
                                   rs.getString("Pasta"),
                                   rs.getString("RelatoResumido"),
                                   RequerenteDAO.busca(rs.getInt("Requerente_ID")),
                                   ConselheiroDAO.busca(rs.getInt("Conselheiro1_ID")),
                                   ConselheiroDAO.busca(rs.getInt("Conselheiro2_ID"))));
                          
          }
    pst.close();
    return listaTodos;
    }
    
    
    static public AtendimentoM Busca(int id) throws SQLException{
        String sql = "select * from Atendimento where ID = ?";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        AtendimentoM atendimento = null;
        ResultSet rs = pst.executeQuery();
            while (rs.next()){
            atendimento = new AtendimentoM(rs.getInt("ID"), 
                                       rs.getString("Data"),
                                       rs.getString("Pasta"),
                                       rs.getString("RelatoResumido"),
                                       RequerenteDAO.busca(rs.getInt("Requerente_ID")),
                                       ConselheiroDAO.busca(rs.getInt("Conselheiro1_ID")),
                                       ConselheiroDAO.busca(rs.getInt("Conselheiro2_ID")));
              }
        pst.close();
        return atendimento;
    }
        
        public List<AtendimentoM> FiltroBuscaRequerente(String Name) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<AtendimentoM> ListaBusca = new ArrayList<>();
        int cont = 0;
        String nome = "%"+Name+"%";

        sql = "select Atendimento.ID, Atendimento.Data, Atendimento.Pasta, Atendimento.RelatoResumido, Atendimento.Requerente_ID, Atendimento.Conselheiro1_ID, Atendimento.Conselheiro2_ID from Atendimento, Requerente where Atendimento.Requerente_ID = Requerente.ID and Requerente.Nome like ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, nome);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           ListaBusca.add(new AtendimentoM(rs.getInt("ID"), 
                                   rs.getString("Data"),
                                   rs.getString("Pasta"),
                                   rs.getString("RelatoResumido"),
                                   RequerenteDAO.busca(rs.getInt("Requerente_ID")),
                                   ConselheiroDAO.busca(rs.getInt("Conselheiro1_ID")),
                                   ConselheiroDAO.busca(rs.getInt("Conselheiro2_ID"))));      
                   cont++;    
        }
        if(cont == 0){
            return null;
        }
        pst.execute();
        pst.close();                           
        
        return ListaBusca;
    }
    
    
}

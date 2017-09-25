package dao;

import MODEL.RequerenteM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RequerenteDAO {
    
    public void Salvar (RequerenteM requerente) throws SQLException{
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
       
    public void Excluir(RequerenteM requerente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Requerente where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, requerente.getId());
        pst.execute();
        pst.close();
    }       
        
    public void Alterar(RequerenteM requerente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Requerente set "
                 + "Nome = ?, "
                 + "Nascimento = ?, "
                 + "Telefone1 = ?, "
                 + "Telefone2 = ?, "
                 + "Celular  = ?, "
                 + "Endereco  = ?, "
                 + "Numero  = ?, "
                 + "Bairro  = ?, "
                 + "Cidade  = ?, "
                 + "Estado  = ?, "
                 + "EstadoCivil  = ?, "
                 + "Observacao  = ? "
                
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
    
    public List<RequerenteM> ListaTodos() throws SQLException{ 
    List<RequerenteM> listaTodos = new ArrayList<>();

        String sql = "select * from Requerente order by Nome";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new RequerenteM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("Nascimento"),
                                   rs.getString("Telefone1"),
                                   rs.getString("Telefone2"),
                                   rs.getString("Celular"),
                                   rs.getString("Endereco"),
                                   rs.getString("Numero"),
                                   rs.getString("Bairro"),
                                   rs.getString("Cidade"),
                                   rs.getString("Estado"),
                                   rs.getString("EstadoCivil"),
                                   rs.getString("Observacao")));
          }
    pst.close();
    return listaTodos;
    }
    
    public RequerenteM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        RequerenteM requerente = null;
        
        sql = "select * from Requerente where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           requerente = new RequerenteM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("Nascimento"),
                   rs.getString("Telefone1"),
                   rs.getString("Telefone2"),
                   rs.getString("Celular"),
                   rs.getString("Endereco"),
                   rs.getString("Numero"),
                   rs.getString("Bairro"),
                   rs.getString("Cidade"),
                   rs.getString("Estado"),                   
                   rs.getString("EstadoCivil"),
                   rs.getString("Observacao"));
                   
        }
        pst.close();
        
        return requerente;
    }

    public List<RequerenteM> FiltroBusca(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<RequerenteM> ListaBusca = new ArrayList<>();
        int cont = 0;
        
        String name = "%"+Nome+"%";
        
        sql = "select * from Requerente where Nome like ? order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           ListaBusca.add(new RequerenteM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("Nascimento"),
                   rs.getString("Telefone1"),
                   rs.getString("Telefone2"),
                   rs.getString("Celular"),
                   rs.getString("Endereco"),
                   rs.getString("Numero"),
                   rs.getString("Bairro"),
                   rs.getString("Cidade"),
                   rs.getString("Estado"),                   
                   rs.getString("EstadoCivil"),
                   rs.getString("Observacao")));
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

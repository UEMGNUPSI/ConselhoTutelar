package dao;
import MODEL.ConselheiroM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ConselheiroDAO {
    
    public ConselheiroM Valida(String user, String senha) throws SQLException{
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
        
        
    public void Salvar (ConselheiroM conselheiro) throws SQLException{
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
        
    public void Excluir(ConselheiroM conselheiro) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Conselheiro where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, conselheiro.getId());
        pst.execute();
        pst.close();
    }
          
    public void Alterar(ConselheiroM conselheiro) throws SQLException{
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
    
    public List<ConselheiroM> ListaTodos() throws SQLException{ 
        List<ConselheiroM> listaTodos;
        listaTodos = new ArrayList<>();

        String sql = "select * from Conselheiro order by Nome";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

    while (rs.next()){
        listaTodos.add(new ConselheiroM(rs.getInt("ID"), 
                                   rs.getString("Nome"),
                                   rs.getString("Telefone"),
                                   rs.getString("Celular"),
                                   rs.getString("Login"),
                                   rs.getString("Senha")));
                                   
          }
    pst.close();
    return listaTodos;
    }
        
    public ConselheiroM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        ConselheiroM conselheiro = null;
        
        sql = "select * from Requerente where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           conselheiro = new ConselheiroM(
                   rs.getInt("ID"),
                   rs.getString("Nome"),
                   rs.getString("Telefone"),
                   rs.getString("Celular"),
                   rs.getString("Login"),
                   rs.getString("Senha"));
                   
        }
        pst.close();
        
        return conselheiro;
    }
}

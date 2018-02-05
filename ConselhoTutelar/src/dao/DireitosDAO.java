package dao;
import MODEL.DireitosM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DireitosDAO {
    
    public void Salvar (DireitosM direitos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Direitos values (?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, direitos.getNumero());
        pst.setString(3, direitos.getDescricao());   
        pst.execute();
        pst.close();
    }
            
    public void Excluir(DireitosM direitos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Direitos where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, direitos.getId());
        pst.execute();
        pst.close();
    }
        
    public void Alterar(DireitosM direitos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Direitos set "
                 + "Numero = ?, "
                 + "Descricao = ? "
                      
                 + "where ID = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, direitos.getNumero());
        pst.setString(2, direitos.getDescricao());  
        pst.setInt(3, direitos.getId());
        pst.execute();
        pst.close();
     }
            
    public List<DireitosM> ListaTodos() throws SQLException{ 
        List<DireitosM> listaTodos;
        listaTodos = new ArrayList<>();

        String sql = "select * from Direitos order by ID";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

      while (rs.next()){
        listaTodos.add(new DireitosM(rs.getInt("ID"), 
                                   rs.getString("Numero"),
                                   rs.getString("Descricao"),
                                   rs.getString("")));
                                   
          }
     pst.close();
     return listaTodos;
    }
    
    public DireitosM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        DireitosM direito = null;
        
        sql = "select * from Direitos where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           direito = new DireitosM(
                   rs.getInt("ID"),
                   rs.getString("Numero"),
                   rs.getString("Descricao"),
                   rs.getString(""));
                   
        }
        pst.close();
        
        return direito;
    }
    
    public List<DireitosM> FiltroBusca(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<DireitosM> ListaBusca = new ArrayList<>();
        int cont = 0;
        
        String name = "%"+Nome+"%";
        
        sql = "select * from Direitos where Numero like ? order by Numero";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           ListaBusca.add(new DireitosM(
                   rs.getInt("ID"),
                   rs.getString("Numero"),
                   rs.getString("Descricao"),
                   rs.getString("")));
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

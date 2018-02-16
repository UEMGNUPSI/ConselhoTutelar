
package dao;

import MODEL.AtendimentoM;
import MODEL.DireitosM;
import MODEL.FatosM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FatosDAO {
    
    AtendimentoDAO atendimentodao = new AtendimentoDAO();
    DireitosDAO direitosdao = new DireitosDAO();
    
      public void Salvar (List<DireitosM> listafatos, int atendimento) throws SQLException{
        PreparedStatement pst;
        String sql;
        for(DireitosM fatos : listafatos){
            
            sql = "insert into Atendimento_has_Direitos values (?,?,?,?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1,0);            
            pst.setInt(2, atendimento);
            pst.setInt(3, fatos.getId());
            pst.setString(4, fatos.getComentario());
            pst.execute();
            pst.close();
        }
    }
    
     
       public void Alterar(FatosM fatos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Atendimento_has_Direitos set "
                 + "ID = ?,"
                 + "Atendimento_ID = ?, "
                 + "Direitos_ID = ? "
                 + "Comentario = ? "
                 
                 + "where Atendimento_ID = ? and Direitos_ID = ? ";        
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, fatos.getId());
        pst.setInt(2, fatos.getAtendimento_Id().getId());
        pst.setInt(3, fatos.getDireitos_Id().getId());
  
        pst.execute();
        pst.close();
     }
    
    public List<FatosM> ListaTodosAlterar(int id) throws SQLException{ 
        List<FatosM> listaTodos = new ArrayList<>();
        String sql = "select * from atendimento_has_direitos where Atendimento_ID = ?";
        PreparedStatement pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaTodos.add(new FatosM(
                    rs.getInt("ID"), 
                    atendimentodao.Busca(rs.getInt("Atendimento_ID")),
                    direitosdao.busca(rs.getInt("Direitos_ID"))));      
        }
        pst.close();
        return listaTodos;
    }
       
}

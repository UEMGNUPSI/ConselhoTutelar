
package dao;

import MODEL.AtendimentoM;
import MODEL.DireitosM;
import MODEL.FatosM;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class FatosDAO {
    
     public void Salvar1 (FatosM fatos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Atendimento_has_Direitos values (?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setInt(2, fatos.getAtendimento_Id());
        pst.setInt(3, fatos.getDireitos_Id());
        
        pst.execute();
        pst.close();
    }
     public void Salvar (List<DireitosM> listafatos, int atendimento) throws SQLException{
        PreparedStatement pst;
        String sql;
        for(DireitosM fatos : listafatos){
            
            sql = "insert into Atendimento_has_Direitos values (?,?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1,0);
            pst.setInt(2, atendimento);
            pst.setInt(3, fatos.getId());
            pst.execute();
            pst.close();
        }
    }
    
     
       public void Alterar(FatosM fatos) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Atendimento_has_Direitos set "
                 + "Atendimento_ID = ?, "
                 + "Direitos_ID = ?, "
                 
                 + "where Atendimento_ID = ? and Direitos_ID = ? ";        
        
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, fatos.getAtendimento_Id());
        pst.setInt(2, fatos.getDireitos_Id());
  
        pst.execute();
        pst.close();
     }
    
       
}

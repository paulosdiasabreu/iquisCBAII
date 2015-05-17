package dataBase;

import iquiscbaii.SetorJar;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalvarSetor extends ConectaDB{
    
    public boolean salvar(SetorJar objSetor) throws SQLException{
        
        ConectaDB con = new ConectaDB();
        
        String SQL = "INSERT into setordeinstalacao(setor) VALUES (?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, objSetor.getSetor());
        
        
        //verificar linhas afetadas
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        }  
    }
}

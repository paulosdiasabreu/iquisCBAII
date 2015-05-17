package dataBase;

import iquiscbaii.UnidadeJar;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalvarUnidade extends ConectaDB{
    
    public boolean salvar(UnidadeJar objUni) throws SQLException{
        
        ConectaDB con = new ConectaDB();
        
        String SQL = "INSERT into unidadedeinstalacao(unidade) VALUES (?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, objUni.getUnidade());
        
        
        //verificar linhas afetadas
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}

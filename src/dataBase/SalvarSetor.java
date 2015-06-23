package dataBase;

import iquiscbaii.SetorJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<SetorJar> ConsultaTudo() throws SQLException{
        
        List<SetorJar> todosSetores = new ArrayList<SetorJar>();
        
        ConectaDB con = new ConectaDB();
        
        String SQL = "SELECT idSetor, setor FROM setordeinstalacao";
        
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);      
        ResultSet rs = ps.executeQuery(SQL);
        
        //rs.first();
        
        while(rs.next()){
            SetorJar set = new SetorJar();
            set.setIdSetor(new Integer (rs.getInt("idSetor")));
            set.setSetor(rs.getString("setor"));
            
            todosSetores.add(set);
        }
        
        return todosSetores;
    }
    
}

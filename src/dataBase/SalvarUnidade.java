package dataBase;

import iquiscbaii.UnidadeJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public Integer idUnidade;
    public String unidade;
    
    public List<UnidadeJar> ConsultaTudo() throws SQLException{
        
        List<UnidadeJar> todasUnidades = new ArrayList<UnidadeJar>();
        
        ConectaDB con = new ConectaDB();
        
        String SQL = "SELECT idUnidade, unidade FROM unidadedeinstalacao";
        
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);      
        ResultSet rs = ps.executeQuery(SQL);
        
        //rs.first();
        
        while(rs.next()){
            UnidadeJar uni = new UnidadeJar();
            uni.setIdUnidadeDeInstalacao(new Integer (rs.getInt("idUnidade")));
            uni.setUnidade(rs.getString("unidade"));
            todasUnidades.add(uni);
        }
        
        return todasUnidades;
    }
    
}

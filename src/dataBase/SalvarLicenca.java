package dataBase;

import iquiscbaii.BemAtivoJar;
import iquiscbaii.LicencaJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalvarLicenca extends ConectaDB {
    
    ConectaDB con;
    
    public List<BemAtivoJar> todosImobilizados() throws SQLException{
        con = new ConectaDB();
        
        String SQL = "SELECT idBemAtivo, numeroImobilizado FROM bemativo";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        List<BemAtivoJar> listaImobilizado = new ArrayList<BemAtivoJar>();
        
            while(rs.next()){
                BemAtivoJar imobilizado = new BemAtivoJar();
                imobilizado.setIdBemAtivo(rs.getInt("idBemAtivo"));
                imobilizado.setNumeroImobilizado(rs.getInt("numeroImobilizado"));
                listaImobilizado.add(imobilizado);
            }
        
        return listaImobilizado;
        
    }
    
    public boolean salvarLicenca(LicencaJar objLicenca) throws SQLException{
        con = new ConectaDB();
        
        String SQL = "INSERT into licenca_software(BemAtivo_idBemAtivo, versaoSoftware, licencaSoftware) values (?,?,?);";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, objLicenca.getBemAtivo_idBemAtivo());
        ps.setString(2, objLicenca.getVersaoSoftware());
        ps.setString(3, objLicenca.getLicencaSoftware());
        
        
        //verificar linhas afetadas
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        }
    
    }
    
}

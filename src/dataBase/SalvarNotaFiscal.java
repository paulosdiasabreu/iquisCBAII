package dataBase;

import iquiscbaii.FornecedoresJar;
import iquiscbaii.NotaFiscalJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalvarNotaFiscal extends ConectaDB {
    
    ConectaDB con;
    
    /*
    Este método cria uma lista para consultar os fornecedores
    */
    public List<FornecedoresJar> todosFornecedores() throws SQLException{
        con = new ConectaDB();
        String SQL = "SELECT idFornecedores,inscricaoCpfCnpj,razaoSocial FROM fornecedores";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        List<FornecedoresJar> lista = new ArrayList<FornecedoresJar>();
        
            while(rs.next()){
                FornecedoresJar fornecedores = new FornecedoresJar();
                fornecedores.setIdFornecedores(rs.getInt("idFornecedores"));
                fornecedores.setInscricaoCpfCnpj(rs.getString("inscricaoCpfCnpj"));
                fornecedores.setRazaoSocial(rs.getString("razaoSocial"));
                lista.add(fornecedores);
            }
        
        return lista;
    }
    
    public boolean salvarNF(NotaFiscalJar objNF) throws SQLException{
        con = new ConectaDB();
        
        String SQL = "INSERT into notafiscal(Fornecedores_idFornecedores, numeroNF, imagemNF) values (?,?,LOAD_FILE(?));";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, objNF.getFornecedores_idFornecedores());
        ps.setInt(2, objNF.getNumeroNF());
        ps.setString(3, objNF.getImagemNF());
        
        //verificar linhas afetadas
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        }
        
        //return true;
    }
    
}

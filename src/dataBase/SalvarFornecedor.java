   package dataBase;

import iquiscbaii.FornecedoresJar;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class SalvarFornecedor extends ConectaDB{
    
    public boolean salvar(FornecedoresJar ObjFornecedores) throws SQLException{
        
        ConectaDB con = new ConectaDB();
        
        String SQL = "INSERT into fornecedores(inscricaoCpfCnpj,inscricaoEstadual,razaoSocial,nomeFantasia,telefone,email) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, ObjFornecedores.getInscricaoCpfCnpj());
        ps.setString(2, ObjFornecedores.getInscricaoEstadual());
        ps.setString(3, ObjFornecedores.getRazaoSocial());
        ps.setString(4, ObjFornecedores.getNomeFantasia());
        ps.setString(5, ObjFornecedores.getTelefone());
        ps.setString(6, ObjFornecedores.getEmail());
        
        //verificar linhas afetadas
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        } 
    }
    
    public List<FornecedoresJar> consultaFornecedores() throws SQLException{
        
        List<FornecedoresJar> todosFornecedores = new ArrayList<FornecedoresJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT * FROM fornecedores";
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);      
        ResultSet rs = ps.executeQuery(SQL);
        
        while(rs.next()){
            FornecedoresJar forn = new FornecedoresJar();
            forn.setIdFornecedores(rs.getInt("idFornecedores"));
            forn.setRazaoSocial(rs.getString("razaoSocial"));
            forn.setNomeFantasia(rs.getString("nomeFantasia"));
            forn.setInscricaoCpfCnpj(rs.getString("inscricaoCpfCnpj"));
            forn.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
            forn.setTelefone(rs.getString("telefone"));
            forn.setEmail(rs.getString("email"));
            todosFornecedores.add(forn);
        }
        
        return todosFornecedores;
    }
    
}

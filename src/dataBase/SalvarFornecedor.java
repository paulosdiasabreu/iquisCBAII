package dataBase;

import iquiscbaii.FornecedoresJar;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

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
    
}

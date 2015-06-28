package ConsultaDB;

import dataBase.ConectaDB;
import iquiscbaii.FornecedoresJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaForn extends ConectaDB{
    
    public List<FornecedoresJar> consultaRazao(String razao) throws SQLException{
        
        List<FornecedoresJar> razaoFornecedores = new ArrayList<FornecedoresJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT * FROM fornecedores WHERE razaoSocial LIKE '%"+razao+"%'";
        
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
            razaoFornecedores.add(forn);
        }
        
        return razaoFornecedores;
    }
    
    public List<FornecedoresJar> consultaInscricao(String inscricao) throws SQLException{
        
        List<FornecedoresJar> inscricaoFornecedores = new ArrayList<FornecedoresJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT * FROM fornecedores WHERE inscricaoCpfCnpj =" + inscricao;
        
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
            inscricaoFornecedores.add(forn);
        }
        
        return inscricaoFornecedores;
    }
    
    public List<FornecedoresJar> consultaFantasia(String fantasia) throws SQLException{
        
        List<FornecedoresJar> fantasiaFornecedores = new ArrayList<FornecedoresJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT * FROM fornecedores WHERE nomeFantasia LIKE '%"+fantasia+"%'";
        
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
            fantasiaFornecedores.add(forn);
        }
        
        return fantasiaFornecedores;
    }
    
}

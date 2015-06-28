package ConsultaDB;

import dataBase.ConectaDB;
import iquiscbaii.NotaFiscalJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaNF {
    
    public List<NotaFiscalJar> consultaInscricao(String inscricao) throws SQLException{
        
        List<NotaFiscalJar> porInscricao = new ArrayList<NotaFiscalJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT fab.inscricaoCpfCnpj, fab.razaoSocial, nf.numeroNF "
                + "FROM notafiscal nf join fornecedores fab on nf.Fornecedores_idFornecedores = fab.idFornecedores "
                + "where fab.inscricaoCpfCnpj = " + inscricao ;
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);      
        ResultSet rs = ps.executeQuery(SQL);
        
        while(rs.next()){
            NotaFiscalJar nf = new NotaFiscalJar();
            nf.setInscricao(rs.getString("fab.inscricaoCpfCnpj"));
            nf.setRazaoSocial(rs.getString("fab.razaoSocial"));
            nf.setNumeroNF(rs.getInt("nf.numeroNF"));
            porInscricao.add(nf);
        }
        
        return porInscricao;
    }
    
    public List<NotaFiscalJar> consultaRazao(String razao) throws SQLException{
        
        List<NotaFiscalJar> porInscricao = new ArrayList<NotaFiscalJar>();
        ConectaDB con = new ConectaDB();
        String SQL = "SELECT fab.inscricaoCpfCnpj, fab.razaoSocial, nf.numeroNF FROM notafiscal nf join fornecedores fab on nf.Fornecedores_idFornecedores = fab.idFornecedores where fab.razaoSocial LIKE '%"+razao+"%'" ;
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);      
        ResultSet rs = ps.executeQuery(SQL);
        
        while(rs.next()){
            NotaFiscalJar nf = new NotaFiscalJar();
            nf.setInscricao(rs.getString("fab.inscricaoCpfCnpj"));
            nf.setRazaoSocial(rs.getString("fab.razaoSocial"));
            nf.setNumeroNF(rs.getInt("nf.numeroNF"));
            porInscricao.add(nf);
        }
        
        return porInscricao;
    }
    
}

package dataBase;

import iquiscbaii.BemAtivoJar;
import iquiscbaii.NotaFiscalJar;
import iquiscbaii.SetorJar;
import iquiscbaii.UnidadeJar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalvarBemAtivo extends ConectaDB {
    
    ConectaDB con;
    private Object modeloTU;
    
    public List<NotaFiscalJar> todasAsNotas() throws SQLException{
    con = new ConectaDB();
    
    String SQL = "SELECT idNotaFiscal, numeroNF FROM notafiscal ";
    
    PreparedStatement ps = con.getConexao().prepareStatement(SQL);
    ResultSet rs = ps.executeQuery();
    
    List<NotaFiscalJar> listaNota = new ArrayList<NotaFiscalJar>();
    
    while(rs.next()){
        NotaFiscalJar nf = new NotaFiscalJar();
        nf.setIdNotaFiscal(rs.getInt("idNotaFiscal"));
        nf.setNumeroNF(rs.getInt("numeroNF"));
        listaNota.add(nf);
    }
    
    return listaNota;
}
    
    public List<UnidadeJar> todasUnidades() throws SQLException{
        con = new ConectaDB();
        
        String SQL = "SELECT idUnidade, unidade FROM unidadedeinstalacao";
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        List<UnidadeJar> listaUnidade = new ArrayList<UnidadeJar>();
        
        while(rs.next()){
            UnidadeJar uni = new UnidadeJar();
            uni.setIdUnidadeDeInstalacao(rs.getInt("idUnidade"));
            uni.setUnidade(rs.getString("unidade"));
            listaUnidade.add(uni);
        }
        
        return listaUnidade;
        
    }
    
    public List<SetorJar> todosSetor() throws SQLException{
        con = new ConectaDB();
        
        String SQL = "SELECT idSetor, setor FROM setordeinstalacao";
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        List<SetorJar> listaSetor = new ArrayList<SetorJar>();
        
        while(rs.next()){
            SetorJar uni = new SetorJar();
            uni.setIdSetor(rs.getInt("idSetor"));
            uni.setSetor(rs.getString("setor"));
            listaSetor.add(uni);
        }
        
        return listaSetor;
        
    }
    
    public boolean salvarBem(BemAtivoJar objBemAtivo) throws SQLException{
        
        con = new ConectaDB();
        
        String SQL = "INSERT INTO bemativo (SetorDeInstalacao_idSetor, UnidadeDeInstalacao_idUnidade, "
                + "NotaFiscal_idNotaFiscal, fabricante, modelo, numeroDeSerie, descricaoProduto, numeroImobilizado) "
                + "values (?,?,?,?,?,?,?,?)" ;
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, objBemAtivo.getSetorDeInstalacao_idSetor());
        ps.setInt(2, objBemAtivo.getUnidadeDeInstalacao_idUnidadeDeInstalacao());
        ps.setInt(3, objBemAtivo.getNotaFiscal_idNotaFiscal());
        ps.setString(4, objBemAtivo.getFabricante());
        ps.setString(5, objBemAtivo.getModelo());
        ps.setString(6, objBemAtivo.getNumeroDeSerie());
        ps.setString(7, objBemAtivo.getDescricaoProduto());
        ps.setInt(8, objBemAtivo.getNumeroImobilizado());
        
        int registros = ps.executeUpdate();
        if(registros > 0){
            return true;
        }else{
            return false;
        }
        
        //return true;
    }
    
    
    
    
    
}

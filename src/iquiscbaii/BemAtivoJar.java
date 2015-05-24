package iquiscbaii;

public class BemAtivoJar {
    
    private Integer idBemAtivo;
    private Integer notaFiscal_idNotaFiscal;
    private Integer unidadeDeInstalacao_idUnidadeDeInstalacao;
    private Integer setorDeInstalacao_idSetor;
    private String fabricante;
    private String modelo;
    private String numeroDeSerie;
    private String descricaoProduto;
    private Integer numeroImobilizado;

    
    public void setIdBemAtivo(Integer idBemAtivo) {
        this.idBemAtivo = idBemAtivo;
    }

    public void setNotaFiscal_idNotaFiscal(Integer notaFiscal_idNotaFiscal) {
        this.notaFiscal_idNotaFiscal = notaFiscal_idNotaFiscal;
    }

    public void setUnidadeDeInstalacao_idUnidadeDeInstalacao(Integer unidadeDeInstalacao_idUnidadeDeInstalacao) {
        this.unidadeDeInstalacao_idUnidadeDeInstalacao = unidadeDeInstalacao_idUnidadeDeInstalacao;
    }
    
    public void setSetorDeInstalacao_idSetor(Integer setorDeInstalacao_idSetor) {
        this.setorDeInstalacao_idSetor = setorDeInstalacao_idSetor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setNumeroImobilizado(Integer numeroImobilizado) {
        this.numeroImobilizado = numeroImobilizado;
    }
    
    public Integer getIdBemAtivo() {
        return idBemAtivo;
    }

    public Integer getNotaFiscal_idNotaFiscal() {
        return notaFiscal_idNotaFiscal;
    }

    public Integer getUnidadeDeInstalacao_idUnidadeDeInstalacao() {
        return unidadeDeInstalacao_idUnidadeDeInstalacao;
    }
    
    public Integer getSetorDeInstalacao_idSetor() {
        return setorDeInstalacao_idSetor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public Integer getNumeroImobilizado() {
        return numeroImobilizado;
    }

    @Override
    public String toString(){
        return numeroImobilizado.toString() ;
    }

    
    
    
    
    
}

package iquiscbaii;

public class UnidadeJar {
    
    //deve ser implementado de forma que o setor e a unidade sejam classes diferentes
    
    private Integer idUnidadeDeInstalacao;
    private String unidade;
    

    public void setIdUnidadeDeInstalacao(Integer idUnidadeDeInstalacao) {
        this.idUnidadeDeInstalacao = idUnidadeDeInstalacao;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getIdUnidadeDeInstalacao() {
        return idUnidadeDeInstalacao;
    }

    public String getUnidade() {
        return unidade;
    }
    
    @Override
    public String toString(){
        return unidade.toString() ;
    }   
    
}

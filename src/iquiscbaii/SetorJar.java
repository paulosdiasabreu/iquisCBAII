package iquiscbaii;

public class SetorJar {
    
    private Integer idSetor;
    private String setor;

    public void setIdSetor(Integer idSetor) {
        this.idSetor = idSetor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public Integer getIdSetor() {
        return idSetor;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public String toString(){
        return setor.toString() ;
    }
    
}

package iquiscbaii;

public class NotaFiscalJar {
    private Integer Fornecedores_idFornecedores;
    private Integer idNotaFiscal;
    private Integer numeroNF;
    private String imagemNF;
    private String razaoSocial;
    private String inscricao;

    public void setFornecedores_idFornecedores(int Fornecedores_idFornecedores) {
        this.Fornecedores_idFornecedores = Fornecedores_idFornecedores;
    }
    
    public void setIdNotaFiscal(int idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }
    
    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }
    
    public void setImagemNF(String imagemNF) {
        this.imagemNF = imagemNF;
    }
    
    //metodos get
    public Integer getFornecedores_idFornecedores() {
        return Fornecedores_idFornecedores;
    }
    
    public Integer getIdNotaFiscal() {
        return idNotaFiscal;
    }    

    public Integer getNumeroNF() {
        return numeroNF;
    }

    public String getImagemNF() {
        return imagemNF;
    }
    
    @Override
    public String toString(){
        return numeroNF.toString() ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
 
}

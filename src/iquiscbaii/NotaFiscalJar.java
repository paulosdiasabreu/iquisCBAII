package iquiscbaii;

public class NotaFiscalJar {
    private int Fornecedores_idFornecedores;
    private int idNotaFiscal;
    private int numeroNF;
    private String imagemNF;

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
    public int getFornecedores_idFornecedores() {
        return Fornecedores_idFornecedores;
    }
    
    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }    

    public int getNumeroNF() {
        return numeroNF;
    }

    public String getImagemNF() {
        return imagemNF;
    }
 
}

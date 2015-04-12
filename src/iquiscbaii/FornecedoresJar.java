
package iquiscbaii;


public class FornecedoresJar {
    
    //Atributos
    
    private String inscricaoCpfCnpj;
    private String inscricaoEstadual;
    private String razaoSocial;
    private String nomeFantasia;
    private String telefone;
    private String email;

    public FornecedoresJar() {
    }
    
    
    public FornecedoresJar(String inscricaoCpfCnpj, String inscricaoEstadual, String razaoSocial, String nomeFantasia, String telefone, String email) {
        this.inscricaoCpfCnpj = inscricaoCpfCnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.email = email;
    }
    
    
    
    //Métodos SET
    public void setInscricaoCpfCnpj(String inscricaoCpfCnpj){
        this.inscricaoCpfCnpj = inscricaoCpfCnpj;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public void setRazaoSocial (String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    //Métodos GET
    
    public String getInscricaoCpfCnpj(){
        return inscricaoCpfCnpj;
    }
    
    public String getInscricaoEstadual(){
        return inscricaoEstadual;
    }
    
    public String getRazaoSocial(){
        return razaoSocial;
    }
    
    public String getNomeFantasia(){
        return nomeFantasia;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }

    
    
}
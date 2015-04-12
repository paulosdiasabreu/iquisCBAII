/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iquisDB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author casa
 */
@Entity
@Table(name = "enderecos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e")})
public class Enderecos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEnderecos")
    private Integer idEnderecos;
    @Basic(optional = false)
    @Column(name = "Fornecedores_idFornecedores")
    private int fornecedoresidFornecedores;
    @Column(name = "enderecoLogradouro")
    private String enderecoLogradouro;
    @Column(name = "enderecoNumero")
    private Integer enderecoNumero;
    @Column(name = "enderecoComplemento")
    private String enderecoComplemento;
    @Column(name = "enderecoBairro")
    private String enderecoBairro;
    @Column(name = "enderecoCEP")
    private String enderecoCEP;
    @Column(name = "enderecoCidade")
    private String enderecoCidade;
    @Column(name = "enderecoEstado")
    private String enderecoEstado;
    @Column(name = "enderecoPais")
    private String enderecoPais;

    public Enderecos() {
    }

    public Enderecos(Integer idEnderecos) {
        this.idEnderecos = idEnderecos;
    }

    public Enderecos(Integer idEnderecos, int fornecedoresidFornecedores) {
        this.idEnderecos = idEnderecos;
        this.fornecedoresidFornecedores = fornecedoresidFornecedores;
    }

    public Integer getIdEnderecos() {
        return idEnderecos;
    }

    public void setIdEnderecos(Integer idEnderecos) {
        this.idEnderecos = idEnderecos;
    }

    public int getFornecedoresidFornecedores() {
        return fornecedoresidFornecedores;
    }

    public void setFornecedoresidFornecedores(int fornecedoresidFornecedores) {
        this.fornecedoresidFornecedores = fornecedoresidFornecedores;
    }

    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }

    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }

    public Integer getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(Integer enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(String enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public String getEnderecoPais() {
        return enderecoPais;
    }

    public void setEnderecoPais(String enderecoPais) {
        this.enderecoPais = enderecoPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnderecos != null ? idEnderecos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecos)) {
            return false;
        }
        Enderecos other = (Enderecos) object;
        if ((this.idEnderecos == null && other.idEnderecos != null) || (this.idEnderecos != null && !this.idEnderecos.equals(other.idEnderecos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.Enderecos[ idEnderecos=" + idEnderecos + " ]";
    }
    
}

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
@Table(name = "fornecedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f")})
public class Fornecedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFornecedores")
    private Integer idFornecedores;
    @Column(name = "inscricaoCpfCnpj")
    private String inscricaoCpfCnpj;
    @Column(name = "inscricaoEstadual")
    private String inscricaoEstadual;
    @Column(name = "razaoSocial")
    private String razaoSocial;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;

    public Fornecedores() {
    }

    public Fornecedores(Integer idFornecedores) {
        this.idFornecedores = idFornecedores;
    }

    public Integer getIdFornecedores() {
        return idFornecedores;
    }

    public void setIdFornecedores(Integer idFornecedores) {
        this.idFornecedores = idFornecedores;
    }

    public String getInscricaoCpfCnpj() {
        return inscricaoCpfCnpj;
    }

    public void setInscricaoCpfCnpj(String inscricaoCpfCnpj) {
        this.inscricaoCpfCnpj = inscricaoCpfCnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFornecedores != null ? idFornecedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.idFornecedores == null && other.idFornecedores != null) || (this.idFornecedores != null && !this.idFornecedores.equals(other.idFornecedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.Fornecedores[ idFornecedores=" + idFornecedores + " ]";
    }
    
}

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
@Table(name = "unidadedeinstalacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadeDeInstalacao.findAll", query = "SELECT u FROM UnidadeDeInstalacao u")})
public class UnidadeDeInstalacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUnidadeDeInstalacao")
    private Integer idUnidadeDeInstalacao;
    @Column(name = "filial_Setor")
    private String filialSetor;
    @Column(name = "localizacao")
    private String localizacao;

    public UnidadeDeInstalacao() {
    }

    public UnidadeDeInstalacao(Integer idUnidadeDeInstalacao) {
        this.idUnidadeDeInstalacao = idUnidadeDeInstalacao;
    }

    public Integer getIdUnidadeDeInstalacao() {
        return idUnidadeDeInstalacao;
    }

    public void setIdUnidadeDeInstalacao(Integer idUnidadeDeInstalacao) {
        this.idUnidadeDeInstalacao = idUnidadeDeInstalacao;
    }

    public String getFilialSetor() {
        return filialSetor;
    }

    public void setFilialSetor(String filialSetor) {
        this.filialSetor = filialSetor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadeDeInstalacao != null ? idUnidadeDeInstalacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadeDeInstalacao)) {
            return false;
        }
        UnidadeDeInstalacao other = (UnidadeDeInstalacao) object;
        if ((this.idUnidadeDeInstalacao == null && other.idUnidadeDeInstalacao != null) || (this.idUnidadeDeInstalacao != null && !this.idUnidadeDeInstalacao.equals(other.idUnidadeDeInstalacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.UnidadeDeInstalacao[ idUnidadeDeInstalacao=" + idUnidadeDeInstalacao + " ]";
    }
    
}

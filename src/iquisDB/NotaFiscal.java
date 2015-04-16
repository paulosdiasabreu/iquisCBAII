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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author casa
 */
@Entity
@Table(name = "notafiscal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NotaFiscal.findAll", query = "SELECT n FROM NotaFiscal n")})
public class NotaFiscal implements Serializable {
    @Lob
    @Column(name = "imagemNF")
    private byte[] imagemNF;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNotaFiscal")
    private Integer idNotaFiscal;
    @Basic(optional = false)
    @Column(name = "Fornecedores_idFornecedores")
    private int fornecedoresidFornecedores;
    @Column(name = "numeroNF")
    private Integer numeroNF;

    public NotaFiscal() {
    }

    public NotaFiscal(Integer idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public NotaFiscal(Integer idNotaFiscal, int fornecedoresidFornecedores) {
        this.idNotaFiscal = idNotaFiscal;
        this.fornecedoresidFornecedores = fornecedoresidFornecedores;
    }

    public Integer getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdNotaFiscal(Integer idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public int getFornecedoresidFornecedores() {
        return fornecedoresidFornecedores;
    }

    public void setFornecedoresidFornecedores(int fornecedoresidFornecedores) {
        this.fornecedoresidFornecedores = fornecedoresidFornecedores;
    }

    public Integer getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(Integer numeroNF) {
        this.numeroNF = numeroNF;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotaFiscal != null ? idNotaFiscal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaFiscal)) {
            return false;
        }
        NotaFiscal other = (NotaFiscal) object;
        if ((this.idNotaFiscal == null && other.idNotaFiscal != null) || (this.idNotaFiscal != null && !this.idNotaFiscal.equals(other.idNotaFiscal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.NotaFiscal[ idNotaFiscal=" + idNotaFiscal + " ]";
    }

    public byte[] getImagemNF() {
        return imagemNF;
    }

    public void setImagemNF(byte[] imagemNF) {
        this.imagemNF = imagemNF;
    }
    
}

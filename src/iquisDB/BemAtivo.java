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
@Table(name = "bemativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BemAtivo.findAll", query = "SELECT b FROM BemAtivo b")})
public class BemAtivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBemAtivo")
    private Integer idBemAtivo;
    @Basic(optional = false)
    @Column(name = "NotaFiscal_idNotaFiscal")
    private int notaFiscalidNotaFiscal;
    @Basic(optional = false)
    @Column(name = "UnidadeDeInstalacao_idUnidadeDeInstalacao")
    private int unidadeDeInstalacaoidUnidadeDeInstalacao;
    @Column(name = "fabricante")
    private String fabricante;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "numeroDeSerie")
    private String numeroDeSerie;
    @Column(name = "descricaoProduto")
    private String descricaoProduto;
    @Column(name = "numeroImobilizado")
    private Integer numeroImobilizado;

    public BemAtivo() {
    }

    public BemAtivo(Integer idBemAtivo) {
        this.idBemAtivo = idBemAtivo;
    }

    public BemAtivo(Integer idBemAtivo, int notaFiscalidNotaFiscal, int unidadeDeInstalacaoidUnidadeDeInstalacao) {
        this.idBemAtivo = idBemAtivo;
        this.notaFiscalidNotaFiscal = notaFiscalidNotaFiscal;
        this.unidadeDeInstalacaoidUnidadeDeInstalacao = unidadeDeInstalacaoidUnidadeDeInstalacao;
    }

    public Integer getIdBemAtivo() {
        return idBemAtivo;
    }

    public void setIdBemAtivo(Integer idBemAtivo) {
        this.idBemAtivo = idBemAtivo;
    }

    public int getNotaFiscalidNotaFiscal() {
        return notaFiscalidNotaFiscal;
    }

    public void setNotaFiscalidNotaFiscal(int notaFiscalidNotaFiscal) {
        this.notaFiscalidNotaFiscal = notaFiscalidNotaFiscal;
    }

    public int getUnidadeDeInstalacaoidUnidadeDeInstalacao() {
        return unidadeDeInstalacaoidUnidadeDeInstalacao;
    }

    public void setUnidadeDeInstalacaoidUnidadeDeInstalacao(int unidadeDeInstalacaoidUnidadeDeInstalacao) {
        this.unidadeDeInstalacaoidUnidadeDeInstalacao = unidadeDeInstalacaoidUnidadeDeInstalacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getNumeroImobilizado() {
        return numeroImobilizado;
    }

    public void setNumeroImobilizado(Integer numeroImobilizado) {
        this.numeroImobilizado = numeroImobilizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBemAtivo != null ? idBemAtivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BemAtivo)) {
            return false;
        }
        BemAtivo other = (BemAtivo) object;
        if ((this.idBemAtivo == null && other.idBemAtivo != null) || (this.idBemAtivo != null && !this.idBemAtivo.equals(other.idBemAtivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.BemAtivo[ idBemAtivo=" + idBemAtivo + " ]";
    }
    
}

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
@Table(name = "licenca_software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LicencaSoftware.findAll", query = "SELECT l FROM LicencaSoftware l")})
public class LicencaSoftware implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLicenca_Software")
    private Integer idLicencaSoftware;
    @Basic(optional = false)
    @Column(name = "BemAtivo_idBemAtivo")
    private int bemAtivoidBemAtivo;
    @Column(name = "versaoSoftware")
    private String versaoSoftware;
    @Column(name = "licencaSoftware")
    private String licencaSoftware;

    public LicencaSoftware() {
    }

    public LicencaSoftware(Integer idLicencaSoftware) {
        this.idLicencaSoftware = idLicencaSoftware;
    }

    public LicencaSoftware(Integer idLicencaSoftware, int bemAtivoidBemAtivo) {
        this.idLicencaSoftware = idLicencaSoftware;
        this.bemAtivoidBemAtivo = bemAtivoidBemAtivo;
    }

    public Integer getIdLicencaSoftware() {
        return idLicencaSoftware;
    }

    public void setIdLicencaSoftware(Integer idLicencaSoftware) {
        this.idLicencaSoftware = idLicencaSoftware;
    }

    public int getBemAtivoidBemAtivo() {
        return bemAtivoidBemAtivo;
    }

    public void setBemAtivoidBemAtivo(int bemAtivoidBemAtivo) {
        this.bemAtivoidBemAtivo = bemAtivoidBemAtivo;
    }

    public String getVersaoSoftware() {
        return versaoSoftware;
    }

    public void setVersaoSoftware(String versãoSoftware) {
        this.versaoSoftware = versãoSoftware;
    }

    public String getLicencaSoftware() {
        return licencaSoftware;
    }

    public void setLicencaSoftware(String licencaSoftware) {
        this.licencaSoftware = licencaSoftware;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicencaSoftware != null ? idLicencaSoftware.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LicencaSoftware)) {
            return false;
        }
        LicencaSoftware other = (LicencaSoftware) object;
        if ((this.idLicencaSoftware == null && other.idLicencaSoftware != null) || (this.idLicencaSoftware != null && !this.idLicencaSoftware.equals(other.idLicencaSoftware))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "iquisDB.LicencaSoftware[ idLicencaSoftware=" + idLicencaSoftware + " ]";
    }
    
}

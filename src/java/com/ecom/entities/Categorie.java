/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecom.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abroun
 */
@Entity
@Table(name = "categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
    @NamedQuery(name = "Categorie.findByIdCat", query = "SELECT c FROM Categorie c WHERE c.idCat = :idCat"),
    @NamedQuery(name = "Categorie.findByNomcategorie", query = "SELECT c FROM Categorie c WHERE c.nomcategorie = :nomcategorie"),
    @NamedQuery(name = "Categorie.findByPhotocat", query = "SELECT c FROM Categorie c WHERE c.photocat = :photocat")})
public class Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAT")
    private Integer idCat;
    @Size(max = 15)
    @Column(name = "NOMCATEGORIE")
    private String nomcategorie;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DESCRIPTIONCAT")
    private String descriptioncat;
    @Column(name = "PHOTOCAT")
    private Short photocat;

    public Categorie() {
    }

    public Categorie(Integer idCat) {
        this.idCat = idCat;
    }

    public Integer getIdCat() {
        return idCat;
    }

    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public String getNomcategorie() {
        return nomcategorie;
    }

    public void setNomcategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }

    public String getDescriptioncat() {
        return descriptioncat;
    }

    public void setDescriptioncat(String descriptioncat) {
        this.descriptioncat = descriptioncat;
    }

    public Short getPhotocat() {
        return photocat;
    }

    public void setPhotocat(Short photocat) {
        this.photocat = photocat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCat != null ? idCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.idCat == null && other.idCat != null) || (this.idCat != null && !this.idCat.equals(other.idCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ecom.entities.Categorie[ idCat=" + idCat + " ]";
    }
    
}

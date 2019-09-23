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
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByIdProduit", query = "SELECT p FROM Produit p WHERE p.idProduit = :idProduit"),
    @NamedQuery(name = "Produit.findByIdCat", query = "SELECT p FROM Produit p WHERE p.idCat = :idCat"),
    @NamedQuery(name = "Produit.findByPrix", query = "SELECT p FROM Produit p WHERE p.prix = :prix"),
    @NamedQuery(name = "Produit.findByQuantite", query = "SELECT p FROM Produit p WHERE p.quantite = :quantite"),
    @NamedQuery(name = "Produit.findBySelectione", query = "SELECT p FROM Produit p WHERE p.selectione = :selectione"),
    @NamedQuery(name = "Produit.findByPhotoprd", query = "SELECT p FROM Produit p WHERE p.photoprd = :photoprd"),
    @NamedQuery(name = "Produit.findByDescriptionprd", query = "SELECT p FROM Produit p WHERE p.descriptionprd = :descriptionprd")})
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRODUIT")
    private Integer idProduit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAT")
    private int idCat;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DESINGNATION")
    private String desingnation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIX")
    private Double prix;
    @Column(name = "QUANTITE")
    private Integer quantite;
    @Column(name = "SELECTIONE")
    private Boolean selectione;
    @Column(name = "PHOTOPRD")
    private Short photoprd;
    @Size(max = 30)
    @Column(name = "DESCRIPTIONPRD")
    private String descriptionprd;

    public Produit() {
    }

    public Produit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Produit(Integer idProduit, int idCat) {
        this.idProduit = idProduit;
        this.idCat = idCat;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getDesingnation() {
        return desingnation;
    }

    public void setDesingnation(String desingnation) {
        this.desingnation = desingnation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Boolean getSelectione() {
        return selectione;
    }

    public void setSelectione(Boolean selectione) {
        this.selectione = selectione;
    }

    public Short getPhotoprd() {
        return photoprd;
    }

    public void setPhotoprd(Short photoprd) {
        this.photoprd = photoprd;
    }

    public String getDescriptionprd() {
        return descriptionprd;
    }

    public void setDescriptionprd(String descriptionprd) {
        this.descriptionprd = descriptionprd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduit != null ? idProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idProduit == null && other.idProduit != null) || (this.idProduit != null && !this.idProduit.equals(other.idProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ecom.entities.Produit[ idProduit=" + idProduit + " ]";
    }
    
}

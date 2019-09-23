/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecom.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abroun
 */
@Entity
@Table(name = "lignecommande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lignecommande.findAll", query = "SELECT l FROM Lignecommande l"),
    @NamedQuery(name = "Lignecommande.findById", query = "SELECT l FROM Lignecommande l WHERE l.id = :id"),
    @NamedQuery(name = "Lignecommande.findByIdProduit", query = "SELECT l FROM Lignecommande l WHERE l.idProduit = :idProduit"),
    @NamedQuery(name = "Lignecommande.findByQuantitelinge", query = "SELECT l FROM Lignecommande l WHERE l.quantitelinge = :quantitelinge"),
    @NamedQuery(name = "Lignecommande.findByPrixligne", query = "SELECT l FROM Lignecommande l WHERE l.prixligne = :prixligne")})
public class Lignecommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ID_PRODUIT")
    private Integer idProduit;
    @Column(name = "QUANTITELINGE")
    private Integer quantitelinge;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIXLIGNE")
    private Double prixligne;

    public Lignecommande() {
    }

    public Lignecommande(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Integer getQuantitelinge() {
        return quantitelinge;
    }

    public void setQuantitelinge(Integer quantitelinge) {
        this.quantitelinge = quantitelinge;
    }

    public Double getPrixligne() {
        return prixligne;
    }

    public void setPrixligne(Double prixligne) {
        this.prixligne = prixligne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lignecommande)) {
            return false;
        }
        Lignecommande other = (Lignecommande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ecom.entities.Lignecommande[ id=" + id + " ]";
    }
    
}

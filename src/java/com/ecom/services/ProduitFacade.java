/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecom.services;

import com.ecom.entities.Produit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abroun
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {
    @PersistenceContext(unitName = "eCommerceJavaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }
    
}

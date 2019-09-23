/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecom.services;

import com.ecom.entities.Categorie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abroun
 */
@Stateless
public class CategorieFacade extends AbstractFacade<Categorie> {
    @PersistenceContext(unitName = "eCommerceJavaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieFacade() {
        super(Categorie.class);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecom.services;

import com.ecom.entities.Lignecommande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abroun
 */
@Stateless
public class LignecommandeFacade extends AbstractFacade<Lignecommande> {
    @PersistenceContext(unitName = "eCommerceJavaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LignecommandeFacade() {
        super(Lignecommande.class);
    }
    
}

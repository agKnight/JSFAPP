/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jsf.entities.Suppliers;

/**
 *
 * @author Aaron
 */
@Stateless
public class SuppliersFacade extends AbstractFacade<Suppliers> {
    @PersistenceContext(unitName = "CSD322_LAB4_Aknight_Fall14PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SuppliersFacade() {
        super(Suppliers.class);
    }
    
}

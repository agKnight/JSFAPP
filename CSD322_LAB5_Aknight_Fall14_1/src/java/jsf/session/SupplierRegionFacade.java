/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jsf.entities.SupplierRegion;

/**
 *
 * @author Aaron
 */
@Stateless
public class SupplierRegionFacade extends AbstractFacade<SupplierRegion> {
    @PersistenceContext(unitName = "CSD322_LAB4_Aknight_Fall14PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupplierRegionFacade() {
        super(SupplierRegion.class);
    }
    
}

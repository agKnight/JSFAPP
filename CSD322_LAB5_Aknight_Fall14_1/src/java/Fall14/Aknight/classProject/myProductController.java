/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fall14.Aknight.classProject;

import jsf.entities.Products;
import jsf.session.ProductsFacade;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Aaron
 */
@Named("myProductController")
@SessionScoped
public class myProductController implements Serializable {

    /**
     * Creates a new instance of myProductController
     */
    private Products current;
    private Products addNew;
    private List<Products> items = null;
    private ArrayList<Products> addToCart = new ArrayList();
    @EJB
    private jsf.session.ProductsFacade ejbFacade;

    public myProductController() {
    }

    private ProductsFacade getFacade() {
        return ejbFacade;
    }

    public List<Products> getItems() {
        items = getFacade().findAll();
        return items;
    }

    public String addItem(Products add) {

        getAddToCart().add(add);
        return null;
    }

    public String viewCart() {
        return "viewCart";
    }

    /**
     * @return the addToCart
     */
    public ArrayList<Products> getAddToCart() {
        return addToCart;
    }
}

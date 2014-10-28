package Fall14.Aknight.classProject;

import jsf.entities.Customers;
import jsf.session.CustomersFacade;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;



/**
 *
 * @author Aaron Knight
 */
@Named("myCustomersController")
@SessionScoped
public class MyCustomersController implements Serializable {
    
    
    private Customers current;
    private List<Customers> items = null;
    @EJB
    private jsf.session.CustomersFacade ejbFacade;
    
    public MyCustomersController() {
    }
    /**
     * This method will take the customer object information
     * and set the current variable to hold that information
     * 
     * @return current customer information
     */
    public Customers getSelected() {
        if (current == null) {
            current = new Customers();
            return current;
        }
        return current;
    }

    private CustomersFacade getFacade() {
        return ejbFacade;
    }

    public List<Customers> getItems() {
        items = getFacade().findAll();
        return items;
    }
    
    public String create() {
    current = new Customers();
    
    return "created";
    }
    public String createNew() {
        try {
            
            getFacade().create(current);
            return create();
            
            } catch (Exception e) {
            
            return null;
        }
        
    }
    
    public String update() {
        try {
            getFacade().edit(current);
            
            return "View";
        } catch (Exception e) {
            
            return null;
        }
    }
    
    public String Edit(Customers In) {
        current = In;
        
        return "myEdit";
    }
    
    public String View(Customers In){
    current=In;
    return "myView";
    }
    
    /**
     *
     * @param In accepts the selected record
     * @return to the display page upon deletion
     * 
     * This method will not delete the initial records that came 
     * with the creation of the connection to the database
     * any new records that are created can be deleted. if you try and delete the
     * sample records the transaction will be canceled by JSF.
     */
    public String Delete(Customers In) {
        current = In;
        getFacade().remove(current);
        return "deleted";
    }

}

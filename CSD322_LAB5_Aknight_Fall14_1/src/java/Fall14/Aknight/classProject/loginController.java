/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fall14.Aknight.classProject;

import java.io.Serializable;
import javax.faces.bean.NoneScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Aaron
 */
@Named("loginController")
@NoneScoped
public class loginController implements Serializable {

    /**
     * Creates a new instance of loginController
     */
    @Inject
    user user;

    public loginController() {
    }

    public String verifyUser() {
        if (!user.getName().equals("testApp") || !user.getPassword().equals("12345")) {
            return "failure";
        } else {
            return "success";
        }
    }

}

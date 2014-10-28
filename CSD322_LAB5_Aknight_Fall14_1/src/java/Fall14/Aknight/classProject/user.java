/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fall14.Aknight.classProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author Aaron
 */
@Named("user")
@SessionScoped
public class user implements Serializable {

	private String testVariable;
    private String name;
    private String password;
    private String newName;
    private String newPassword;
    private String confirmPassword;
    private ArrayList<user> registeredUsers = new ArrayList();
    /**
     * Creates a new instance of user
     */
    public user() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String newRegistration() {
        return "register";
    }

    /**
     * @return the registeredUsers
     */
    public ArrayList<user> getRegisteredUsers() {
        return registeredUsers;
    }

    /**
     * @return the newName
     */
    public String getNewName() {
        return newName;
    }

    /**
     * @param newName the newName to set
     */
    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * @return the newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword the newPassword to set
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
//    public void createUser(){
//    if(this.newPassword.equals(this.confirmPassword)){
//    registeredUsers.add(newName);
//    }
//    }
    
}

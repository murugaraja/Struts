/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

import java.util.ArrayList;

/**
 *
 * @author eswar@vaannila.com
 */
public class UserForm extends org.apache.struts.action.ActionForm {
    
   private ArrayList userList;
   

    public UserForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the userList
     */
    public ArrayList getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList userList) {
        this.userList = userList;
    }

   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author eswar@vaannila.com
 */
public class UserAction extends org.apache.struts.action.Action {
    
    private final static String SUCCESS = "success";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList hobbiesList = new ArrayList();
        UserForm userForm = (UserForm)form;
        userForm.setName("Eswar");
        userForm.setAge(21);
        userForm.setHeight(5.11f);
        userForm.setWeight(70f);
        userForm.setFavouriteFood("Fish and Chicken");
        hobbiesList.add("Music");
        hobbiesList.add("Art");
        hobbiesList.add("Dance");
        userForm.setHobbies(hobbiesList);
        return mapping.findForward(SUCCESS);
    }
}

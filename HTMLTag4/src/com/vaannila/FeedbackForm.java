/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

/**
 *
 * @author eswar@vaannila.com
 */
public class FeedbackForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    
    private String sex;
    
    private String comments;
    

    public FeedbackForm() {
        super();
        // TODO Auto-generated constructor stub
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
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    
    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    
}

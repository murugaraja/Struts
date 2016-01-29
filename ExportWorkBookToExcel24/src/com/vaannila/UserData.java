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
public class UserData {

    private String userName;
    private String emailId;
    private String location;

   public UserData()
    {

    }

    public UserData(String userName, String emailId, String location)
    {
        this.userName = userName;
        this.emailId = emailId;
        this.location = location;
    }

    public ArrayList loadData()
    {
        ArrayList userList = new ArrayList();
        userList.add(new UserData("Rachel Green","rachel.green@friends.com","New York"));
        userList.add(new UserData("Monica Geller","monica.geller@friends.com","New York"));
        userList.add(new UserData("Phoebe Buffay","phoebe.buffay@friends.com","New York"));
        userList.add(new UserData("Joey Tribbiani","joey.tribbiani@friends.com","New York"));
        userList.add(new UserData("Chandler Bing","chandler.bing@friends.com","New York"));
        userList.add(new UserData("Ross Geller","ross.geller@friends.com","New York"));
        return userList;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @return the locaiton
     */
    public String getLocation() {
        return location;
    }

}

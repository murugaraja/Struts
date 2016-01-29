/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

import org.displaytag.decorator.TableDecorator;



/**
 *
 * @author eswar@vaannila.com
 */
public class ActorDecorator extends TableDecorator {

    

    public String getUserName()
    {
        ActorData actorData = (ActorData)getCurrentRowObject();
        return actorData.getUserName();
    }

    public String getEmailId()
    {
        ActorData actorData = (ActorData)getCurrentRowObject();
        String emailId = "<a href=\"mailto:"+actorData.getEmailId()+"\">"+actorData.getEmailId()+ "</a>";
        return emailId;
    }

}

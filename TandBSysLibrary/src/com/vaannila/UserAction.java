package com.vaannila;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserAction extends org.apache.struts.action.Action {
	private final static String ADMIN = "admin";
	private final static String USER = "user";
	private final static String FAIL = "fail";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ActionForward actionForward;
		UserForm userForm = (UserForm) form;
		
		if (userForm.getUserName().equals("admin")) {
			
			if (userForm.getPassword().equals("admin")) {
				actionForward =  mapping.findForward(ADMIN);
				
			} else {
				actionForward =  mapping.findForward(USER);
			}
		} else {
			actionForward =  mapping.findForward(FAIL);
		}
		return actionForward;
	}
}

package com.vaannila;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class ExcelAction extends org.apache.struts.action.Action {
    
    private final static String SUCCESS = "success";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception {
        ExcelForm excelForm = (ExcelForm) form;
        UserData userData = new UserData();
        excelForm.setUserList(userData.loadData());
        return mapping.findForward(SUCCESS);
    }
}
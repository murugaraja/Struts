/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaannila;

import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author eswar@vaannila.com
 */
public class ExcelCreator {

    public HSSFWorkbook createWorkbook(ArrayList userList) throws Exception {

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("User Data");

        /**
         * Setting the width of the first three columns.
         */
        sheet.setColumnWidth(0, 3500);
        sheet.setColumnWidth(1, 7500);
        sheet.setColumnWidth(2, 5000);

        /**
         * Style for the header cells.
         */
        HSSFCellStyle headerCellStyle = wb.createCellStyle();
        HSSFFont boldFont = wb.createFont();
        boldFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        headerCellStyle.setFont(boldFont);

        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(new HSSFRichTextString("User Name"));
        cell = row.createCell(1);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(new HSSFRichTextString("Email Id"));
        cell = row.createCell(2);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(new HSSFRichTextString("Location"));

        for (int index = 1; index < userList.size(); index++) {
            row = sheet.createRow(index);
            cell = row.createCell(0);
            UserData userData = (UserData) userList.get(index);
            HSSFRichTextString userName = new HSSFRichTextString(userData.getUserName());
            cell.setCellValue(userName);
            cell = row.createCell(1);
            HSSFRichTextString emailId = new HSSFRichTextString(userData.getEmailId());
            cell.setCellValue(emailId);
            cell = row.createCell(2);
            HSSFRichTextString location = new HSSFRichTextString(userData.getLocation());
            cell.setCellValue(location);
        }
        return wb;
    }
}

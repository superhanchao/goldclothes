package com.imi.goldcolthes.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintUtil {
    public void printJSON(String str, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setContentType("application/json; charset=UTF-8");
        out.write(str);
        out.close();
    }

    public void printXML(String str, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setContentType("application/xml; charset=UTF-8");
        out.write(str);
        out.close();
    }

    public void printText(String str, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setContentType("text/html; charset=UTF-8");
        out.write(str);
        out.close();
    }

    public void printObject(HttpServletResponse response, byte[] data, String fileName) {

        // fileName = URLEncoder.encode(fileName, "UTF-8");

        try {
            fileName = new String(fileName.getBytes("gbk"), "iso-8859-1");
            response.reset();
            response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
            response.addHeader("Content-Length", "" + data.length);
            response.setContentType("application/octet-stream;charset=UTF-8");
            OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
            outputStream.write(data);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件名称链接文件类型
     * 
     */
    public String fileNameLinkType(String fileName, String fileType) {
        return fileName + "." + fileType;
    }
}

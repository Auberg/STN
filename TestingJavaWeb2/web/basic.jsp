<%-- 
    Document   : basic
    Created on : Oct 30, 2016, 8:22:48 AM
    Author     : Steven Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE>Reading Header Information</TITLE>
    </HEAD>

    <BODY>
        <H1>Reading Header Information</H1>
        Here are the request headers and their data:
        <BR>
        <% java.util.Enumeration names = request.getHeaderNames();
        while(names.hasMoreElements()){
            String name = (String) names.nextElement();
            out.println(name + ":<BR>" + request.getHeader(name) + "<BR><BR>");
        }
        %>
    </BODY>
</HTML>

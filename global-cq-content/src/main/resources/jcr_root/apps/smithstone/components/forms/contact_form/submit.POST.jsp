<%@include file="/libs/foundation/global.jsp"%>
<%@include file="/libs/wcm/global.jsp"%>
<%@page import="com.day.cq.mailer.MailService"%>
<%@ page import="org.apache.commons.mail.Email" %>
<%@ page import="org.apache.commons.mail.SimpleEmail" %>
<%@ page import="org.apache.commons.mail.EmailException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collection" %>

<%

    MailService mailService = sling.getService(MailService.class); // <1>


    try {
        Email email = new SimpleEmail(); // <2>

        StringBuilder builder = new StringBuilder();

        builder.append("Title: " + request.getParameter("title"));
        builder.append("First Name: " + request.getParameter("firstname"));
        builder.append("Last Name: " + request.getParameter("lastname"));
        builder.append("Telephone: " + request.getParameter("telephone"));
        builder.append("Mobile: " + request.getParameter("mobile"));

        email.setFrom(request.getParameter("email"));

        email.setMsg(builder.toString()); // <3>
        email.addTo("stephen@smithstone.co.uk");

        mailService.send(email); // <4>

    } catch (EmailException e) {
        e.printStackTrace(System.err);
    }

%>
<h1>Form Submitted</h1>

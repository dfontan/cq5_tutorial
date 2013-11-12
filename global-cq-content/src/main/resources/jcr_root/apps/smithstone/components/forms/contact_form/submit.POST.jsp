<%@include file="/libs/foundation/global.jsp"%>
<%@include file="/libs/wcm/global.jsp"%>
<%@ page import="smithstone.components.forms.ContactFormHandler" %> <!-- <1> -->

<%
    ContactFormHandler contactFormHandler = new ContactFormHandler(sling, request); // <2>
    contactFormHandler.sendEmail();
%>
<h1>Form Submitted</h1>

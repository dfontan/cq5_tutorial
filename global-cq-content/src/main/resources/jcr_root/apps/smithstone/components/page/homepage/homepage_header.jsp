<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="smithstone" uri="http://smithstone.co.uk/global" %>

<smithstone:pageHeaderFactory out="pageHeader"/>

<jsp:useBean id="pageHeader" type="smithstone.pages.PageHeader" scope="request"/>   <!-- <2> -->

<title><c:out value="${pageHeader.title}"/></title>

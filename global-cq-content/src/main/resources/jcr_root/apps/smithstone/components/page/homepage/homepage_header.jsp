<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:useBean id="pageHeader" type="smithstone.pages.PageHeader" scope="request"/>   <!-- <5> -->

<title><c:out value="${pageHeader.title}"/> </title>                                <!-- <6> -->


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:useBean id="pageHeader" class="smithstone.pages.PageHeader" scope="request"/>

    <jsp:useBean id="titleProvider" class="smithstone.pages.FakeTitleProvider"/>

    <jsp:setProperty name="pageHeader" property="titleProvider" value="${titleProvider}"/>

    <jsp:include page="/apps/smithstone/components/page/homepage/homepage_header.jsp"/>

</head>
<body>

</body>
</html>

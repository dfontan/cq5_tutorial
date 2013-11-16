<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:useBean id="view" class="smithstone.components.forms.FakeContactFormView"/>
<jsp:useBean id="model" class="smithstone.components.forms.FakeContactFormModel"/>

<jsp:useBean id="form" class="smithstone.forms.ContactForm" scope="request"/>
<jsp:setProperty name="form" property="view" value="${view}"/>
<jsp:setProperty name="form" property="model" value="${model}"/>

<jsp:include page="/apps/smithstone/components/forms/contact_form/form.jsp"/>

</body>
</html>

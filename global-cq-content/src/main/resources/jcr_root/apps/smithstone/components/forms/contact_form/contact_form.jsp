<%@ taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@include file="/libs/foundation/global.jsp"%> <!-- <1> -->

<jsp:useBean id="view" class="smithstone.components.forms.adapter.CQContactFormView"/>
<jsp:setProperty name="view" property="properties" value="${properties}"/>

<jsp:useBean id="model" class="smithstone.components.forms.adapter.CQContactFormModel"/>
<jsp:setProperty name="model" property="resource" value="${resource}"/>

<jsp:useBean id="form" class="smithstone.forms.ContactForm" scope="request"/>
<jsp:setProperty name="form" property="model" value="${model}"/>
<jsp:setProperty name="form" property="view" value="${view}"/>


<cq:include script="form.jsp"/>

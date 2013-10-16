<%@page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@include file="/libs/foundation/global.jsp"%>
<cq:defineObjects/>

<!DOCTYPE html>
<!--[if lt IE 7]>  <html class="ie ie6 lte9 lte8 lte7" lang=""> <![endif]-->
<!--[if IE 7]>     <html class="ie ie7 lte9 lte8 lte7" lang=""> <![endif]-->
<!--[if IE 8]>     <html class="ie ie8 lte9 lte8" lang=""> <![endif]-->
<!--[if IE 9]>     <html class="ie ie9 lte9" lang=""> <![endif]-->
<!--[if gt IE 9]>  <html lang=""> <![endif]-->
<!--[if !IE]><!--> <html lang=""><!--<![endif]-->

<head>
    <cq:include script="/libs/wcm/core/components/init/init.jsp" />
    <jsp:useBean id="pageHeader" class="smithstone.pages.cq.CQPageTitle" scope="request"/>         <!-- <1> -->
    <jsp:setProperty name="pageHeader" property="cqPage" value="${currentPage}"/>                   <!-- <2> -->
    <cq:include script="homepage_header.jsp"/>                                                      <!-- <3> -->

</head>
    <cq:include script="homepage_body.jsp"/>                                                        <!-- <4> -->
</html>

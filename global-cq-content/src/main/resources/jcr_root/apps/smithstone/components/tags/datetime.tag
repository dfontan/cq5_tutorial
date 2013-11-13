<%@ tag import="smithstone.cq.domain.DateTime" %>
<%@attribute name="sling" type="org.apache.sling.api.scripting.SlingScriptHelper" %>

<p>Current Date Time Is : <%= new DateTime(sling).getDateTime()%></p>

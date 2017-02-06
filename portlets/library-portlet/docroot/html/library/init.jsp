<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.ActionRequest" %>

<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%@ page import="com.library.LibraryConstants" %>
<%@ page import="com.slayer.model.LMSBook" %>
<%@ page import="com.slayer.model.impl.LMSBookImpl" %>
<%@ page import="com.slayer.service.LMSBookLocalServiceUtil" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<c:set var="cp" scope="page" value="${renderRequest.contextPath}" />
<c:set var="ns" scope="page" value="${renderResponse.namespace}" />

<%
// Used in: search_list.jsp, search_list_actions.jsp
PortletURL iteratorURL = renderResponse.createRenderURL();
%>

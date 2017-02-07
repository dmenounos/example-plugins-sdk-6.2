<%@ include file="/html/init.jsp" %>

<%@ page import="com.library.LibraryConstants" %>

<%@ page import="com.slayer.model.LMSBook" %>
<%@ page import="com.slayer.model.impl.LMSBookImpl" %>
<%@ page import="com.slayer.service.LMSBookLocalServiceUtil" %>

<%
// Used in: book_list.jsp, book_list_actions.jsp
PortletURL iteratorURL = renderResponse.createRenderURL();
%>

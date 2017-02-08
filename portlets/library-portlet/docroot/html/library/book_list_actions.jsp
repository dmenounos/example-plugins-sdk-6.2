<%@ include file="/html/library/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>

<%
ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
LMSBook book = (LMSBook) row.getObject();

PortletURL bookViewURL = renderResponse.createRenderURL();
bookViewURL.setWindowState(LiferayWindowState.POP_UP);
bookViewURL.setParameter("bookId", Long.toString(book.getBookId()));
bookViewURL.setParameter("hideHeader", Boolean.toString(true));
bookViewURL.setParameter("jspPage", LibraryConstants.PAGE_BOOK_VIEW);

PortletURL bookFormURL = renderResponse.createRenderURL();
bookFormURL.setParameter("bookId", Long.toString(book.getBookId()));
bookFormURL.setParameter("jspPage", LibraryConstants.PAGE_BOOK_FORM);
bookFormURL.setParameter("backURL", currentURL.toString());

PortletURL deleteBookURL = renderResponse.createActionURL();
deleteBookURL.setParameter(ActionRequest.ACTION_NAME, LibraryConstants.ACTION_DELETE_BOOK);
deleteBookURL.setParameter("bookId", Long.toString(book.getBookId()));
deleteBookURL.setParameter("redirectURL", currentURL.toString());
%>

<liferay-ui:icon-menu>
	<% String bookPopupJS = "javascript:bookList.bookPopup('" + bookViewURL + "');"; %>
	<liferay-ui:icon image="view"   message="View Book"   url="<%=bookPopupJS.toString()%>" />
	<liferay-ui:icon image="edit"   message="Edit Book"   url="<%=bookFormURL.toString()%>" />
	<liferay-ui:icon image="delete" message="Delete Book" url="<%=deleteBookURL.toString()%>" />
</liferay-ui:icon-menu>

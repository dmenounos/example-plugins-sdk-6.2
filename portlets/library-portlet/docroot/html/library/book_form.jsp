<%@ include file="/html/library/init.jsp" %>

<h1>Add / Edit Form</h1>

<%
LMSBook lmsBook = null;
long bookId = ParamUtil.getLong(request, "bookId");
if (bookId > 0L) {
	// Modify mode
	lmsBook = LMSBookLocalServiceUtil.fetchLMSBook(bookId);
} else {
	// Create mode
	lmsBook = new LMSBookImpl();
}

PortletURL successURL = renderResponse.createRenderURL();
successURL.setParameter("jspPage", bookId > 0L ? LibraryConstants.PAGE_SEARCH_LIST : LibraryConstants.PAGE_DEFAULT);

PortletURL updateBookURL = renderResponse.createActionURL();
updateBookURL.setParameter(ActionRequest.ACTION_NAME, LibraryConstants.ACTION_UPDATE_BOOK);
updateBookURL.setParameter("redirectURL", successURL.toString());
%>

<aui:form name="fm" method="post" action="<%=updateBookURL%>">
	<aui:input name="bookId" type="hidden" value="<%=lmsBook.getBookId()%>" />
	<aui:input label="book-title" name="bookTitle" value="<%=lmsBook.getBookTitle()%>">
		<aui:validator name="required" errorMessage="The book title is required." />
	</aui:input>
	<aui:input label="book-author" name="author" value="<%=lmsBook.getAuthor()%>" />
	<aui:button type="submit" value="Save" />
</aui:form>

<a href="<portlet:renderURL/>">Go Back</a>

<aui:script>
Liferay.Util.focusFormField(document.${ns}fm.${ns}bookTitle);
</aui:script>

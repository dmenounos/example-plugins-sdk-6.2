<%@ include file="/html/library/init.jsp" %>

<portlet:renderURL var="bookFormURL">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_FORM%>" />
	<portlet:param name="backURL" value="<%=currentURL.toString()%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteBooksURL" name="<%=LibraryConstants.ACTION_DELETE_BOOKS%>">
	<portlet:param name="redirectURL" value="<%=currentURL.toString()%>" />
</portlet:actionURL>

<portlet:actionURL var="searchBooksURL" name="<%=LibraryConstants.ACTION_SEARCH_BOOKS%>" />

<div class="book-list">

	<aui:button-row cssClass="action-buttons">
		<aui:button value="create-book" href="${bookFormURL}" cssClass="create-book-button" />
		<c:if test="${not empty searchResults}">
			<aui:button value="delete-books" disabled="true" cssClass="delete-books-button disabled" />
		</c:if>
		<aui:form name="searchForm" action="${searchBooksURL}" cssClass="form-inline search-form">
			<aui:input label="" placeholder="search-term" name="searchTerm" value="${searchTerm}" />
			<aui:button type="submit" value="Search" />
		</aui:form>
	</aui:button-row>

	<aui:form name="searchResultsForm" action="${deleteBooksURL}">
		<aui:input name="bookIds" type="hidden" />

		<liferay-ui:search-container delta="50" iteratorURL="${currentURL}" 
			orderByCol="${orderByCol}" orderByType="${orderByType}" 
			rowChecker="<%=new RowChecker(renderResponse)%>" 
			emptyResultsMessage="Sorry. There are no items to display.">

			<%
			List<LMSBook> searchResults = (List<LMSBook>) renderRequest.getAttribute(LibraryConstants.SEARCH_RESULTS_ATTR);
			searchResults = ListUtil.subList(searchResults, searchContainer.getStart(), searchContainer.getEnd());
			renderRequest.setAttribute(LibraryConstants.SEARCH_RESULTS_ATTR, searchResults);
			%>

			<liferay-ui:search-container-results results="${searchResults}" total="${searchResultsTotal}" />

			<liferay-ui:search-container-row modelVar="book" className="LMSBook" keyProperty="bookId">

				<portlet:renderURL var="bookViewURL">
					<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_VIEW%>" />
					<portlet:param name="backURL" value="<%=currentURL.toString()%>" />
					<portlet:param name="bookId"  value="<%=Long.toString(book.getBookId())%>" />
				</portlet:renderURL>

				<liferay-ui:search-container-column-text name="Book Title" property="bookTitle" href="<%=bookViewURL.toString()%>" 
					orderable="true" orderableProperty="bookTitle" />

				<liferay-ui:search-container-column-text name="Author" property="author" 
					orderable="true" orderableProperty="author" />

				<liferay-ui:search-container-column-text name="Date Added">
					<fmt:formatDate value="<%=book.getCreateDate()%>" pattern="dd/MMM/yyyy" />
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-jsp name="Actions" path="<%=LibraryConstants.PAGE_BOOK_LIST_ACTIONS%>" />

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>
	</aui:form>
</div>

<script>
$(function() {
	bookList = new BookList({
		ns: '${ns}',
		'confirm-delete-selected-books' : '<%=UnicodeLanguageUtil.get(pageContext, "confirm-delete-selected-books")%>'
	});
});
</script>

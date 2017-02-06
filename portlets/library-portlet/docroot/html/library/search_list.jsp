<%@ include file="/html/library/init.jsp" %>

<%@ page import="java.util.Collections" %>
<%@ page import="org.apache.commons.beanutils.BeanComparator" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>

<%
List<LMSBook> booksTemp = (List<LMSBook>) request.getAttribute(LibraryConstants.SEARCH_RESULTS_ATTR);
List<LMSBook> books = ListUtil.copy(booksTemp);

String orderByCol = (String) request.getAttribute("orderByCol");
String orderByType = (String) request.getAttribute("orderByType");
BeanComparator comp = new BeanComparator(orderByCol);
Collections.sort(books, comp);
if (orderByType.equalsIgnoreCase("desc")) {
	Collections.reverse(books);
}
%>

<portlet:renderURL var="bookFormURL">
	<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_FORM%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteBooksURL" name="<%=LibraryConstants.ACTION_DELETE_BOOKS%>">
	<portlet:param name="redirectURL" value="<%=iteratorURL.toString()%>" />
</portlet:actionURL>

<div class="book-list">

		<aui:button-row>

			<aui:button value="create-book" href="${bookFormURL}"
				cssClass="create-book-button" />

			<c:if test="<%=!books.isEmpty()%>">
				<aui:button value="delete-books" disabled="true"
					cssClass="delete-books-button disabled" />
			</c:if>

		</aui:button-row>

	<aui:form name="searchResultsForm" method="post" action="<%=deleteBooksURL%>">
		<aui:input name="bookIds" type="hidden" />

		<liferay-ui:search-container delta="50" iteratorURL="<%=iteratorURL%>" 
			orderByCol="<%=orderByCol%>" orderByType="<%=orderByType%>" 
			rowChecker="<%=new RowChecker(renderResponse)%>" 
			emptyResultsMessage="Sorry. There are no items to display.">

			<liferay-ui:search-container-results total="<%=books.size()%>" 
			    results="<%=ListUtil.subList(books, searchContainer.getStart(), searchContainer.getEnd())%>" />

			<liferay-ui:search-container-row modelVar="book" className="LMSBook" keyProperty="bookId">

				<portlet:renderURL var="bookViewURL">
					<portlet:param name="bookId"  value="<%=Long.toString(book.getBookId())%>" />
					<portlet:param name="backURL" value="<%=themeDisplay.getURLCurrent()%>" />
					<portlet:param name="jspPage" value="<%=LibraryConstants.PAGE_BOOK_VIEW%>" />
				</portlet:renderURL>

				<liferay-ui:search-container-column-text name="Book Title" property="bookTitle" href="<%=bookViewURL.toString()%>" 
					orderable="true" orderableProperty="bookTitle" />

				<liferay-ui:search-container-column-text name="Author" property="author" 
					orderable="true" orderableProperty="author" />

				<liferay-ui:search-container-column-text name="Date Added">
					<fmt:formatDate value="<%=book.getCreateDate()%>" pattern="dd/MMM/yyyy" />
				</liferay-ui:search-container-column-text>

				<liferay-ui:search-container-column-jsp name="Actions" path="<%=LibraryConstants.PAGE_SEARCH_LIST_ACTIONS%>" />

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
		</liferay-ui:search-container>
	</aui:form>
</div>

<aui:script>
AUI().use(function() {
	BookList = InitBookList('${ns}', {
		'confirm-delete-selected-books' : '<%=UnicodeLanguageUtil.get(pageContext, "confirm-delete-selected-books")%>'
	});
});
</aui:script>

<%@ include file="/html/library/init.jsp" %>

<portlet:actionURL var="searchBooksURL" name="<%=LibraryConstants.ACTION_SEARCH_BOOKS%>" />

<aui:form name="searchForm" action="<%=searchBooksURL%>">
	<aui:input label="search-term" name="searchTerm" value="${searchTerm}" />
	<aui:button type="submit" value="Search" />
</aui:form>

<%@ include file="/html/library/init.jsp" %>

<%
long bookId        = ParamUtil.getLong(request, "bookId");
String backURL     = ParamUtil.getString(request, "backURL");
boolean hideHeader = ParamUtil.getBoolean(request, "hideHeader");

LMSBook lmsBook = null;
if (bookId > 0L) {
	lmsBook = LMSBookLocalServiceUtil.fetchLMSBook(bookId);
}
%>

<c:if test="<%=!hideHeader%>">
	<liferay-ui:header title="Book Details" 
		 backLabel="&laquo; Back to List" 
		 backURL="<%=backURL%>" />
</c:if>

<c:if test="<%=Validator.isNotNull(lmsBook)%>">
	<table border="1">
		<tr>
			<td>Book Title</td>
			<td><%=lmsBook.getBookTitle()%></td>
		</tr>
		<tr>
			<td>Author</td>
			<td><%=lmsBook.getAuthor()%></td>
		</tr>
		<tr>
			<td>Date Added</td>
			<td><%=lmsBook.getCreateDate()%></td>
		</tr>
		<tr>
			<td>Last Modified</td>
			<td><%=lmsBook.getModifiedDate()%></td>
		</tr>
	</table>
</c:if>

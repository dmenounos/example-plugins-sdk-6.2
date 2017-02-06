package com.library;

public interface LibraryConstants {

	String ACTION_UPDATE_BOOK  = "updateBook";
	String ACTION_DELETE_BOOK  = "deleteBook";
	String ACTION_DELETE_BOOKS = "deleteBooks";
	String ACTION_SEARCH_BOOKS = "searchBooks";

	String PAGE_DEFAULT             = "/html/library/view.jsp";
	String PAGE_SEARCH_FORM         = "/html/library/search_form.jsp";
	String PAGE_SEARCH_LIST         = "/html/library/search_list.jsp";
	String PAGE_SEARCH_LIST_ACTIONS = "/html/library/search_list_actions.jsp";
	String PAGE_BOOK_FORM           = "/html/library/book_form.jsp";
	String PAGE_BOOK_VIEW           = "/html/library/book_view.jsp";

	String SEARCH_TERM_PARAM        = "searchTerm";
	String SEARCH_RESULTS_ATTR      = "searchResults";
}

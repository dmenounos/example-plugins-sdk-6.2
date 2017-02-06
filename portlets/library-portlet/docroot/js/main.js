function InitBookList(ns, cfg) {

	//
	// search_list.jsp
	//

	var BookList = {};

	AUI().use('aui-base', function(A) {
		var deleteBooksButton = A.one('.book-list .delete-books-button');
		deleteBooksButton.on('click', function() {
			BookList.submitFormForAction();
		});

		var booksGrid = A.one('.book-list .lfr-search-container');
		booksGrid.delegate('click', function(event) {
			var disabled = booksGrid.one(':checked') == null;
			disableDeleteBooksButton(disabled);
		}, ':checkbox');

		disableDeleteBooksButton(true);

		function disableDeleteBooksButton(disabled) {
			deleteBooksButton.attr('disabled', disabled);
			deleteBooksButton.toggleClass('disabled', disabled);
		}
	});

	Liferay.provide(BookList, 'submitFormForAction', function() {
		var accepted = confirm(cfg['confirm-delete-selected-books']);
		if (accepted) {
			var searchResultsForm = document[ns+'searchResultsForm'];
			var hiddenField = searchResultsForm[ns+'bookIds'];
			hiddenField.value = Liferay.Util.listCheckedExcept(searchResultsForm, ns+"allRowIds");
			submitForm(searchResultsForm);
		}
	}, ['liferay-util-list-fields']);

	//
	// search_list_actions.jsp
	//

	AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated', function(A) {
		BookList.bookPopup = function(url) {
			var dialog = Liferay.Util.Window.getWindow({
				title: 'Book Details',
				dialog: {
					destroyOnHide: true,
					width: 500,
					height: 400
				},
			})
			.plug(A.Plugin.IO, {
				uri: url
			})
			.render();
		}
	});

	return BookList;
};

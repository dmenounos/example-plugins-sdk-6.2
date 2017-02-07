BookList = Obj.extend(Obj, {

	init: function() {
		var ns = this.ns;

		//
		// book_list.jsp
		//

		AUI().use('aui-base', $.proxy(function(A) {
			var deleteBooksButton = $('.book-list .delete-books-button');
			deleteBooksButton.on('click', $.proxy(function() {
				this.submitFormForAction();
			}, this));

			var booksGrid = $('.book-list .lfr-search-container');
			booksGrid.on('click', ':checkbox', $.proxy(function(event) {
				var disabled = $(':checked', booksGrid).length == 0;
				disableDeleteBooksButton(disabled);
			}, this));

			disableDeleteBooksButton(true);

			function disableDeleteBooksButton(disabled) {
				deleteBooksButton.prop('disabled', disabled);
				deleteBooksButton.toggleClass('disabled', disabled);
			}
		}, this));

		Liferay.provide(this, 'submitFormForAction', $.proxy(function() {
			var accepted = confirm(this['confirm-delete-selected-books']);
			if (accepted) {
				var searchResultsForm = document[ns+'searchResultsForm'];
				var hiddenField = searchResultsForm[ns+'bookIds'];
				hiddenField.value = Liferay.Util.listCheckedExcept(searchResultsForm, ns+"allRowIds");
				submitForm(searchResultsForm);
			}
		}, this), ['liferay-util-list-fields']);

		//
		// book_list_actions.jsp
		//

		AUI().use('aui-base','liferay-util-window','aui-io-plugin-deprecated', $.proxy(function(A) {
			this.bookPopup = function(url) {
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
		}, this));
	}
});

package com.library;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.lang.StringUtils;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.slayer.model.LMSBook;
import com.slayer.service.LMSBookLocalServiceUtil;

public class LibraryPortlet extends MVCPortlet {

	@SuppressWarnings("unchecked")
	public void render(RenderRequest request, RenderResponse response) 
		throws PortletException, IOException {

		String jspPage = ParamUtil.getString(request, "jspPage");

		if (StringUtils.isEmpty(jspPage) || 
			jspPage.equals(LibraryConstants.PAGE_DEFAULT) || 
			jspPage.equals(LibraryConstants.PAGE_SEARCH_LIST)) {

			try {
				String searchTerm = ParamUtil.getString(request, LibraryConstants.SEARCH_TERM_PARAM);

				List<LMSBook> lmsBooks = null;

				if (!Validator.isNull(searchTerm)) {
					// Explicit search operation
					lmsBooks = LMSBookLocalServiceUtil.searchBooks(searchTerm);
				}
				else {
					// Implicit show all operation
					lmsBooks = LMSBookLocalServiceUtil.getLMSBooks(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				}

				if (lmsBooks == null) {
					lmsBooks = Collections.emptyList();
				}

				List<LMSBook> books = ListUtil.copy(lmsBooks);

				// Notice how we define default order column and type
				String orderByCol  = ParamUtil.getString(request, LibraryConstants.ORDER_BY_COL_PATTR, "bookTitle");
				String orderByType = ParamUtil.getString(request, LibraryConstants.ORDER_BY_TYPE_PATTR, "asc");

				Collections.sort(books, new BeanComparator(orderByCol));

				if (orderByType.equalsIgnoreCase("desc")) {
					Collections.reverse(books);
				}

				request.setAttribute(LibraryConstants.SEARCH_TERM_PARAM, searchTerm);
				request.setAttribute(LibraryConstants.SEARCH_RESULTS_ATTR, lmsBooks);
				request.setAttribute(LibraryConstants.ORDER_BY_COL_PATTR, orderByCol);
				request.setAttribute(LibraryConstants.ORDER_BY_TYPE_PATTR, orderByType);
			}
			catch (SystemException e) {
				throw new RuntimeException(e);
			}
		}

		super.render(request, response);
	}

	public void searchBooks(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws IOException, PortletException {

		PortalUtil.copyRequestParameters(actionRequest, actionResponse);
	}

	public void updateBook(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws IOException, PortletException {

		String bookTitle = ParamUtil.getString(actionRequest, "bookTitle");
		String author = ParamUtil.getString(actionRequest, "author");
		System.out.println("Your inputs ==> " + bookTitle + ", " + author);

		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		if (bookId > 0l) {
			LMSBookLocalServiceUtil.modifyBook(bookId, bookTitle, author);
		} else {
			LMSBookLocalServiceUtil.createBook(bookTitle, author);
		}

		// redirect after modify or create
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
	}

	public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws IOException, PortletException {

		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		if (bookId > 0l) { // valid bookId
			try {
				LMSBookLocalServiceUtil.deleteLMSBook(bookId);
			}
			catch (PortalException | SystemException e) {
				throw new RuntimeException(e);
			}
		}

		// redirect after delete
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
	}

	public void deleteBooks(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws IOException, PortletException {

		String bookIds = ParamUtil.getString(actionRequest, "bookIds");
		bookIds = "[" + bookIds + "]";

		// parse the JSON array
		JSONArray jsonArray = null;
		try {
			jsonArray = JSONFactoryUtil.createJSONArray(bookIds);
		}
		catch (JSONException e) {
			throw new RuntimeException(e);
		}

		// process the JSON array
		if (Validator.isNotNull(jsonArray)) {
			for (int i = 0; i < jsonArray.length(); i++) {
				long bookId = jsonArray.getLong(i);
				try {
					LMSBookLocalServiceUtil.deleteLMSBook(bookId);
				}
				catch (PortalException | SystemException e) {
					throw new RuntimeException(e);
				}
			}
		}

		// redirect after delete
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
	}
}

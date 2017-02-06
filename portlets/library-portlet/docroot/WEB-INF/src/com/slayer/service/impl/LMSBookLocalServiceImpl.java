/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.slayer.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.slayer.model.LMSBook;
import com.slayer.model.LMSBorrowing;
import com.slayer.model.impl.LMSBookImpl;
import com.slayer.service.LMSBookLocalServiceUtil;
import com.slayer.service.base.LMSBookLocalServiceBaseImpl;
import com.slayer.service.persistence.LMSBookFinderUtil;
import com.slayer.service.persistence.LMSBorrowingUtil;

/**
 * The implementation of the l m s book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.slayer.service.LMSBookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dmen
 * @see com.slayer.service.base.LMSBookLocalServiceBaseImpl
 * @see com.slayer.service.LMSBookLocalServiceUtil
 */
public class LMSBookLocalServiceImpl extends LMSBookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.slayer.service.LMSBookLocalServiceUtil} to access the l m s book local service.
	 */

	public LMSBook createBook(String bookTitle, String author) {
		try {
			// 1. Instantiate an empty object of type LMSBookImpl
			LMSBook lmsBook = new LMSBookImpl();

			// 2. Generate a unique primary key to be set
			long bookId = CounterLocalServiceUtil.increment();

			// 3. Set the fields for this object
			lmsBook.setBookId(bookId);
			lmsBook.setBookTitle(bookTitle);
			lmsBook.setAuthor(author);
			lmsBook.setCreateDate(new Date());

			// 4. Call the Service Layer API to persist the object
			return addLMSBook(lmsBook);
		}
		catch (SystemException e) {
			throw new RuntimeException(e);
		}
	}

	public LMSBook modifyBook(long bookId, String bookTitle, String author) {
		try {
			// 1. Load an instance of LMSBook
			LMSBook lmsBook = LMSBookLocalServiceUtil.fetchLMSBook(bookId);

			// 2. Check validation rules
			if (Validator.isNotNull(lmsBook)) {

				// 3. Set the fields for this object
				lmsBook.setBookTitle(bookTitle);
				lmsBook.setAuthor(author);
				lmsBook.setModifiedDate(new Date());

				// 4. Call the Service Layer API to persist the object
				lmsBook = updateLMSBook(lmsBook);
			}

			return lmsBook;
		}
		catch (SystemException e) {
			throw new RuntimeException(e);
		}
	}

	public List<LMSBook> searchBooks(String bookTitle) throws SystemException {
		// return lmsBookPersistence.findByBookTitle(bookTitle);

		// DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(LMSBook.class);
		// Property bookTitleProperty = PropertyFactoryUtil.forName("bookTitle");
		// dynamicQuery.add(bookTitleProperty.like("%" + bookTitle + "%"));
		// return dynamicQuery(dynamicQuery);

		return LMSBookFinderUtil.findBooks("%" + bookTitle + "%");
	}

	public List<LMSBorrowing> getBorrowings(long bookId) throws SystemException {
		return LMSBorrowingUtil.findByBookId(bookId);
	}
}

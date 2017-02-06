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

package com.slayer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.slayer.model.LMSBook;

import java.util.List;

/**
 * The persistence utility for the l m s book service. This utility wraps {@link LMSBookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dmen
 * @see LMSBookPersistence
 * @see LMSBookPersistenceImpl
 * @generated
 */
public class LMSBookUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LMSBook lmsBook) {
		getPersistence().clearCache(lmsBook);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LMSBook> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LMSBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LMSBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LMSBook update(LMSBook lmsBook) throws SystemException {
		return getPersistence().update(lmsBook);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LMSBook update(LMSBook lmsBook, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(lmsBook, serviceContext);
	}

	/**
	* Returns the l m s book where bookTitle = &#63; and author = &#63; or throws a {@link com.slayer.NoSuchBookException} if it could not be found.
	*
	* @param bookTitle the book title
	* @param author the author
	* @return the matching l m s book
	* @throws com.slayer.NoSuchBookException if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook findByBookTitle_Author(
		java.lang.String bookTitle, java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence().findByBookTitle_Author(bookTitle, author);
	}

	/**
	* Returns the l m s book where bookTitle = &#63; and author = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookTitle the book title
	* @param author the author
	* @return the matching l m s book, or <code>null</code> if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook fetchByBookTitle_Author(
		java.lang.String bookTitle, java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByBookTitle_Author(bookTitle, author);
	}

	/**
	* Returns the l m s book where bookTitle = &#63; and author = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookTitle the book title
	* @param author the author
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching l m s book, or <code>null</code> if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook fetchByBookTitle_Author(
		java.lang.String bookTitle, java.lang.String author,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBookTitle_Author(bookTitle, author, retrieveFromCache);
	}

	/**
	* Removes the l m s book where bookTitle = &#63; and author = &#63; from the database.
	*
	* @param bookTitle the book title
	* @param author the author
	* @return the l m s book that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook removeByBookTitle_Author(
		java.lang.String bookTitle, java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence().removeByBookTitle_Author(bookTitle, author);
	}

	/**
	* Returns the number of l m s books where bookTitle = &#63; and author = &#63;.
	*
	* @param bookTitle the book title
	* @param author the author
	* @return the number of matching l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBookTitle_Author(java.lang.String bookTitle,
		java.lang.String author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBookTitle_Author(bookTitle, author);
	}

	/**
	* Returns all the l m s books where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @return the matching l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findByBookTitle(
		java.lang.String bookTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBookTitle(bookTitle);
	}

	/**
	* Returns a range of all the l m s books where bookTitle = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookTitle the book title
	* @param start the lower bound of the range of l m s books
	* @param end the upper bound of the range of l m s books (not inclusive)
	* @return the range of matching l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findByBookTitle(
		java.lang.String bookTitle, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBookTitle(bookTitle, start, end);
	}

	/**
	* Returns an ordered range of all the l m s books where bookTitle = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bookTitle the book title
	* @param start the lower bound of the range of l m s books
	* @param end the upper bound of the range of l m s books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findByBookTitle(
		java.lang.String bookTitle, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBookTitle(bookTitle, start, end, orderByComparator);
	}

	/**
	* Returns the first l m s book in the ordered set where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching l m s book
	* @throws com.slayer.NoSuchBookException if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook findByBookTitle_First(
		java.lang.String bookTitle,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence()
				   .findByBookTitle_First(bookTitle, orderByComparator);
	}

	/**
	* Returns the first l m s book in the ordered set where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching l m s book, or <code>null</code> if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook fetchByBookTitle_First(
		java.lang.String bookTitle,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBookTitle_First(bookTitle, orderByComparator);
	}

	/**
	* Returns the last l m s book in the ordered set where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching l m s book
	* @throws com.slayer.NoSuchBookException if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook findByBookTitle_Last(
		java.lang.String bookTitle,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence()
				   .findByBookTitle_Last(bookTitle, orderByComparator);
	}

	/**
	* Returns the last l m s book in the ordered set where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching l m s book, or <code>null</code> if a matching l m s book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook fetchByBookTitle_Last(
		java.lang.String bookTitle,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBookTitle_Last(bookTitle, orderByComparator);
	}

	/**
	* Returns the l m s books before and after the current l m s book in the ordered set where bookTitle = &#63;.
	*
	* @param bookId the primary key of the current l m s book
	* @param bookTitle the book title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next l m s book
	* @throws com.slayer.NoSuchBookException if a l m s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook[] findByBookTitle_PrevAndNext(
		long bookId, java.lang.String bookTitle,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence()
				   .findByBookTitle_PrevAndNext(bookId, bookTitle,
			orderByComparator);
	}

	/**
	* Removes all the l m s books where bookTitle = &#63; from the database.
	*
	* @param bookTitle the book title
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBookTitle(java.lang.String bookTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByBookTitle(bookTitle);
	}

	/**
	* Returns the number of l m s books where bookTitle = &#63;.
	*
	* @param bookTitle the book title
	* @return the number of matching l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBookTitle(java.lang.String bookTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBookTitle(bookTitle);
	}

	/**
	* Caches the l m s book in the entity cache if it is enabled.
	*
	* @param lmsBook the l m s book
	*/
	public static void cacheResult(com.slayer.model.LMSBook lmsBook) {
		getPersistence().cacheResult(lmsBook);
	}

	/**
	* Caches the l m s books in the entity cache if it is enabled.
	*
	* @param lmsBooks the l m s books
	*/
	public static void cacheResult(
		java.util.List<com.slayer.model.LMSBook> lmsBooks) {
		getPersistence().cacheResult(lmsBooks);
	}

	/**
	* Creates a new l m s book with the primary key. Does not add the l m s book to the database.
	*
	* @param bookId the primary key for the new l m s book
	* @return the new l m s book
	*/
	public static com.slayer.model.LMSBook create(long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	* Removes the l m s book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the l m s book
	* @return the l m s book that was removed
	* @throws com.slayer.NoSuchBookException if a l m s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook remove(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence().remove(bookId);
	}

	public static com.slayer.model.LMSBook updateImpl(
		com.slayer.model.LMSBook lmsBook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lmsBook);
	}

	/**
	* Returns the l m s book with the primary key or throws a {@link com.slayer.NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the l m s book
	* @return the l m s book
	* @throws com.slayer.NoSuchBookException if a l m s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook findByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchBookException {
		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	* Returns the l m s book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the l m s book
	* @return the l m s book, or <code>null</code> if a l m s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.LMSBook fetchByPrimaryKey(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	/**
	* Returns all the l m s books.
	*
	* @return the l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the l m s books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of l m s books
	* @param end the upper bound of the range of l m s books (not inclusive)
	* @return the range of l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the l m s books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.LMSBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of l m s books
	* @param end the upper bound of the range of l m s books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.LMSBook> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the l m s books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of l m s books.
	*
	* @return the number of l m s books
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LMSBookPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LMSBookPersistence)PortletBeanLocatorUtil.locate(com.slayer.service.ClpSerializer.getServletContextName(),
					LMSBookPersistence.class.getName());

			ReferenceRegistry.registerReference(LMSBookUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LMSBookPersistence persistence) {
	}

	private static LMSBookPersistence _persistence;
}
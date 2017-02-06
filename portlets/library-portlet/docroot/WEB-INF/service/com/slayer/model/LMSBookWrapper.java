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

package com.slayer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LMSBook}.
 * </p>
 *
 * @author dmen
 * @see LMSBook
 * @generated
 */
public class LMSBookWrapper implements LMSBook, ModelWrapper<LMSBook> {
	public LMSBookWrapper(LMSBook lmsBook) {
		_lmsBook = lmsBook;
	}

	@Override
	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	@Override
	public String getModelClassName() {
		return LMSBook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookTitle", getBookTitle());
		attributes.put("author", getAuthor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String bookTitle = (String)attributes.get("bookTitle");

		if (bookTitle != null) {
			setBookTitle(bookTitle);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}
	}

	/**
	* Returns the primary key of this l m s book.
	*
	* @return the primary key of this l m s book
	*/
	@Override
	public long getPrimaryKey() {
		return _lmsBook.getPrimaryKey();
	}

	/**
	* Sets the primary key of this l m s book.
	*
	* @param primaryKey the primary key of this l m s book
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lmsBook.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the book ID of this l m s book.
	*
	* @return the book ID of this l m s book
	*/
	@Override
	public long getBookId() {
		return _lmsBook.getBookId();
	}

	/**
	* Sets the book ID of this l m s book.
	*
	* @param bookId the book ID of this l m s book
	*/
	@Override
	public void setBookId(long bookId) {
		_lmsBook.setBookId(bookId);
	}

	/**
	* Returns the company ID of this l m s book.
	*
	* @return the company ID of this l m s book
	*/
	@Override
	public long getCompanyId() {
		return _lmsBook.getCompanyId();
	}

	/**
	* Sets the company ID of this l m s book.
	*
	* @param companyId the company ID of this l m s book
	*/
	@Override
	public void setCompanyId(long companyId) {
		_lmsBook.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this l m s book.
	*
	* @return the group ID of this l m s book
	*/
	@Override
	public long getGroupId() {
		return _lmsBook.getGroupId();
	}

	/**
	* Sets the group ID of this l m s book.
	*
	* @param groupId the group ID of this l m s book
	*/
	@Override
	public void setGroupId(long groupId) {
		_lmsBook.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this l m s book.
	*
	* @return the user ID of this l m s book
	*/
	@Override
	public long getUserId() {
		return _lmsBook.getUserId();
	}

	/**
	* Sets the user ID of this l m s book.
	*
	* @param userId the user ID of this l m s book
	*/
	@Override
	public void setUserId(long userId) {
		_lmsBook.setUserId(userId);
	}

	/**
	* Returns the user uuid of this l m s book.
	*
	* @return the user uuid of this l m s book
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook.getUserUuid();
	}

	/**
	* Sets the user uuid of this l m s book.
	*
	* @param userUuid the user uuid of this l m s book
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_lmsBook.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this l m s book.
	*
	* @return the user name of this l m s book
	*/
	@Override
	public java.lang.String getUserName() {
		return _lmsBook.getUserName();
	}

	/**
	* Sets the user name of this l m s book.
	*
	* @param userName the user name of this l m s book
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_lmsBook.setUserName(userName);
	}

	/**
	* Returns the create date of this l m s book.
	*
	* @return the create date of this l m s book
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _lmsBook.getCreateDate();
	}

	/**
	* Sets the create date of this l m s book.
	*
	* @param createDate the create date of this l m s book
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_lmsBook.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this l m s book.
	*
	* @return the modified date of this l m s book
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _lmsBook.getModifiedDate();
	}

	/**
	* Sets the modified date of this l m s book.
	*
	* @param modifiedDate the modified date of this l m s book
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_lmsBook.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the book title of this l m s book.
	*
	* @return the book title of this l m s book
	*/
	@Override
	public java.lang.String getBookTitle() {
		return _lmsBook.getBookTitle();
	}

	/**
	* Sets the book title of this l m s book.
	*
	* @param bookTitle the book title of this l m s book
	*/
	@Override
	public void setBookTitle(java.lang.String bookTitle) {
		_lmsBook.setBookTitle(bookTitle);
	}

	/**
	* Returns the author of this l m s book.
	*
	* @return the author of this l m s book
	*/
	@Override
	public java.lang.String getAuthor() {
		return _lmsBook.getAuthor();
	}

	/**
	* Sets the author of this l m s book.
	*
	* @param author the author of this l m s book
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_lmsBook.setAuthor(author);
	}

	@Override
	public boolean isNew() {
		return _lmsBook.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lmsBook.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lmsBook.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lmsBook.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lmsBook.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lmsBook.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lmsBook.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lmsBook.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lmsBook.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lmsBook.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lmsBook.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LMSBookWrapper((LMSBook)_lmsBook.clone());
	}

	@Override
	public int compareTo(com.slayer.model.LMSBook lmsBook) {
		return _lmsBook.compareTo(lmsBook);
	}

	@Override
	public int hashCode() {
		return _lmsBook.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.slayer.model.LMSBook> toCacheModel() {
		return _lmsBook.toCacheModel();
	}

	@Override
	public com.slayer.model.LMSBook toEscapedModel() {
		return new LMSBookWrapper(_lmsBook.toEscapedModel());
	}

	@Override
	public com.slayer.model.LMSBook toUnescapedModel() {
		return new LMSBookWrapper(_lmsBook.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lmsBook.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lmsBook.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lmsBook.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LMSBookWrapper)) {
			return false;
		}

		LMSBookWrapper lmsBookWrapper = (LMSBookWrapper)obj;

		if (Validator.equals(_lmsBook, lmsBookWrapper._lmsBook)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LMSBook getWrappedLMSBook() {
		return _lmsBook;
	}

	@Override
	public LMSBook getWrappedModel() {
		return _lmsBook;
	}

	@Override
	public void resetOriginalValues() {
		_lmsBook.resetOriginalValues();
	}

	private LMSBook _lmsBook;
}
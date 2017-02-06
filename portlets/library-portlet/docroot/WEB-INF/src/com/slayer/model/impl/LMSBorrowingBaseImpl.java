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

package com.slayer.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.slayer.model.LMSBorrowing;

import com.slayer.service.LMSBorrowingLocalServiceUtil;

/**
 * The extended model base implementation for the LMSBorrowing service. Represents a row in the &quot;LMS_LMSBorrowing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LMSBorrowingImpl}.
 * </p>
 *
 * @author dmen
 * @see LMSBorrowingImpl
 * @see com.slayer.model.LMSBorrowing
 * @generated
 */
public abstract class LMSBorrowingBaseImpl extends LMSBorrowingModelImpl
	implements LMSBorrowing {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l m s borrowing model instance should use the {@link LMSBorrowing} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LMSBorrowingLocalServiceUtil.addLMSBorrowing(this);
		}
		else {
			LMSBorrowingLocalServiceUtil.updateLMSBorrowing(this);
		}
	}
}
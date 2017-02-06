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
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author dmen
 */
public class LMSBookFinderUtil {
	public static java.util.List<com.slayer.model.LMSBook> findBooks(
		java.lang.String bookTitle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findBooks(bookTitle);
	}

	public static LMSBookFinder getFinder() {
		if (_finder == null) {
			_finder = (LMSBookFinder)PortletBeanLocatorUtil.locate(com.slayer.service.ClpSerializer.getServletContextName(),
					LMSBookFinder.class.getName());

			ReferenceRegistry.registerReference(LMSBookFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LMSBookFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LMSBookFinderUtil.class, "_finder");
	}

	private static LMSBookFinder _finder;
}
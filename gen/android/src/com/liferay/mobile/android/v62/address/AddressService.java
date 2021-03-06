/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.address;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AddressService extends BaseService {
	public AddressService(Session session) {
		super(session);
	}

	public JSONObject addAddress(String className, long classPK,
		String street1, String street2, String street3, String city,
		String zip, long regionId, long countryId, int typeId, boolean mailing,
		boolean primary) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("street1", street1);
			_params.put("street2", street2);
			_params.put("street3", street3);
			_params.put("city", city);
			_params.put("zip", zip);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("typeId", typeId);
			_params.put("mailing", mailing);
			_params.put("primary", primary);

			_command.put("/address/add-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addAddress(String className, long classPK,
		String street1, String street2, String street3, String city,
		String zip, long regionId, long countryId, int typeId, boolean mailing,
		boolean primary, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("street1", street1);
			_params.put("street2", street2);
			_params.put("street3", street3);
			_params.put("city", city);
			_params.put("zip", zip);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("typeId", typeId);
			_params.put("mailing", mailing);
			_params.put("primary", primary);
			_params.put("serviceContext", serviceContext);

			_command.put("/address/add-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteAddress(long addressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("addressId", addressId);

			_command.put("/address/delete-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getAddress(long addressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("addressId", addressId);

			_command.put("/address/get-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getAddresses(String className, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/address/get-addresses", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateAddress(long addressId, String street1,
		String street2, String street3, String city, String zip, long regionId,
		long countryId, int typeId, boolean mailing, boolean primary)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("addressId", addressId);
			_params.put("street1", street1);
			_params.put("street2", street2);
			_params.put("street3", street3);
			_params.put("city", city);
			_params.put("zip", zip);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("typeId", typeId);
			_params.put("mailing", mailing);
			_params.put("primary", primary);

			_command.put("/address/update-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}
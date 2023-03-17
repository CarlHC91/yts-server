package org.raspberry.yts.services;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.raspberry.yts.exceptions.ServiceErrorException;

public abstract class BaseService {

	protected String encodeParams(Map<String, String> map) {
		try {
			List<String> list = new ArrayList<>();

			for (Entry<String, String> entry : map.entrySet()) {
				list.add(entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
			}

			return String.join("&", list);
		} catch (IOException ex) {
			throw new ServiceErrorException(ex);
		}
	}

}

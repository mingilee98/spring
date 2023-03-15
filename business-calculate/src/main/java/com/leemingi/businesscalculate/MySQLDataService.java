package com.leemingi.businesscalculate;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {3,2,1};
	}

}

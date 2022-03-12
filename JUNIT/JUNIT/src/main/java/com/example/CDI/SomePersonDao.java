package com.example.CDI;

import javax.inject.Named;

@Named
public class SomePersonDao {

	public int[] getElementPersonDao() {
		return new int[] {3,4,1,8,7,9};
	}
}

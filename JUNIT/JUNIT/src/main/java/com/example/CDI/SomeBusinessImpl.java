package com.example.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeBusinessImpl {
@Inject
SomePersonDao somePersonDao;

public int findGreatest() {
	int gretest=Integer.MIN_VALUE;
	int[] data=somePersonDao.getElementPersonDao();
	for(int val:data) {
		if(val>gretest)
			gretest=val;
	}
	return gretest;
}
}

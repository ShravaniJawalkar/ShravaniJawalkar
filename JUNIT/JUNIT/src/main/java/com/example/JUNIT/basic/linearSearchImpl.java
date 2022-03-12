package com.example.JUNIT.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("linear")
public class linearSearchImpl implements SortingAlgorithm {
	int[] arr= {6,2,1,3,4,7};

	@Override
	public boolean getSortingAlgo(int n) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
	}

}

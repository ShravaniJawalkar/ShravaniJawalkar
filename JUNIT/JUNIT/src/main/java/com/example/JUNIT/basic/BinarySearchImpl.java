package com.example.JUNIT.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("binary")
public class BinarySearchImpl implements SortingAlgorithm{
	
	int[] array= {3,4,2,1,5, 6};

	@Override
	public boolean getSortingAlgo(int n) {
		Arrays.sort(array);
		boolean flag=false;
		int low=0;
		int high=array.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(array[mid]==n)
			{
				flag=true;
				break;
			}else if(array[mid]>n){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return flag;
	}

}

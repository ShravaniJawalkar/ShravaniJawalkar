package com.example.MockitoDemo;

public class SomeBusinessImplimantation {
	private DataService dataService;

	public int findGretestNumber() {
		int[] array=dataService.retriveAllData();
		int maxValue = Integer.MIN_VALUE;
		for (int value : array) {
			if (value > maxValue)
				maxValue = value;
		}
		return maxValue;

	}

	public SomeBusinessImplimantation(DataService dataService) {
		super();
		this.dataService = dataService;
	}
}

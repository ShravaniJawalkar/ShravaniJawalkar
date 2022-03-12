package com.example.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeMockitoDemoApplicationTests {
	
	@Test
	public void testGetFirstAll() {
		DataService dataService = mock(DataService.class);
		when(dataService.retriveAllData()).thenReturn(new int[] { 5, 1, 3, 4, 8, 7 });
		SomeBusinessImplimantation businessImplimantation = new SomeBusinessImplimantation(dataService);
		int result = businessImplimantation.findGretestNumber();
		assertEquals(8, result);
	}

	@Test
	public void testGetGretestAll() {
		DataService dataService = mock(DataService.class);
		when(dataService.retriveAllData()).thenReturn(new int[] { 5 });
		SomeBusinessImplimantation businessImplimantation = new SomeBusinessImplimantation(dataService);
		int result = businessImplimantation.findGretestNumber();
		assertEquals(5, result);
	}
}

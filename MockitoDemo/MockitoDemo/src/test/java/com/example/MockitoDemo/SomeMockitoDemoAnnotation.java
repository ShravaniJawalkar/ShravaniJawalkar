package com.example.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) //user for Junit version=5 
@RunWith(MockitoJUnitRunner.class) //user for Junit version<5 
public class SomeMockitoDemoAnnotation {

	@Mock
	DataService dataService;

	@InjectMocks
	SomeBusinessImplimantation businessImplimantation;

	@Test
	public void testGetFirstAll() {
		when(dataService.retriveAllData()).thenReturn(new int[] { 5, 1, 3, 4, 8, 7 });
		assertEquals(8, businessImplimantation.findGretestNumber());
	}

	@Test
	public void testGetGretestAll() {

		when(dataService.retriveAllData()).thenReturn(new int[] { 5 });
		assertEquals(5, businessImplimantation.findGretestNumber());
	}

	@Test
	public void testGetGretestNoDataAll() {

		when(dataService.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImplimantation.findGretestNumber());
	}
}

package com.example.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class MockitoDemoApplicationTests {
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
	void contextLoads() {
	}

}

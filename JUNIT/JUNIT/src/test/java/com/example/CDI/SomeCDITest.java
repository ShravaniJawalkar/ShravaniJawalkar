package com.example.CDI;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDITest {
	@Mock
	SomePersonDao somePersonDao;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testFindGreatset() {
		Mockito.when(somePersonDao.getElementPersonDao()).thenReturn(new int[] {2,4});
		assertEquals(4, someBusinessImpl.findGreatest());
	}
	@Test
	public void testFind2Greatset() {
		Mockito.when(somePersonDao.getElementPersonDao()).thenReturn(new int[] {7,8,4});
		assertEquals(8, someBusinessImpl.findGreatest());
	}

}

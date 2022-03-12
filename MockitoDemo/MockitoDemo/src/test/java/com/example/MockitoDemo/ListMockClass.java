package com.example.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ListMockClass {
	
	@Test
	public void getTestListBok() {
		List listmock=mock(List.class);
		when(listmock.size()).thenReturn(10);
		assertEquals(10, listmock.size());
	}
	@Test
	public void getTestListSecoBok() {
		List listmock=mock(List.class);
		when(listmock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listmock.size());
		assertEquals(20, listmock.size());
		assertEquals(20, listmock.size());
	}
	@Test
	public void getStringValue() {
		List listmock=mock(List.class);
		when(listmock.get(0)).thenReturn("Some thing");
		assertEquals("Some thing",listmock.get(0));
		assertEquals(null, listmock.get(1));
	}
	@Test
	public void getStringAnyValue() {
		List listmock=mock(List.class);
		when(listmock.get(anyInt())).thenReturn("Some thing");
		assertEquals("Some thing",listmock.get(0));
		assertEquals("Some thing", listmock.get(1));
	}

}

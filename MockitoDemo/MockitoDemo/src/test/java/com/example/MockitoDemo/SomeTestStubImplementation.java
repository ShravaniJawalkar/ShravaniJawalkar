package com.example.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeTestStubImplementation {
	@Test
	public void testFindAllGrestest() {
		SomeBusinessImplimantation s = new SomeBusinessImplimantation(new DataServiceStubImpl());
		int x = s.findGretestNumber();
		assertEquals(7, x);
	}
}

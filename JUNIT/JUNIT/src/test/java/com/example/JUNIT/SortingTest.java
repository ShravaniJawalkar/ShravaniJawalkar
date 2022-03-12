package com.example.JUNIT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.JUNIT.basic.SortingAlgorithm;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JunitApplication.class)
public class SortingTest {
	
	@Autowired
	@Qualifier("linear")
	SortingAlgorithm sort;
	
	@Test
	public void testBinarySearch() {
		assertEquals(true, sort.getSortingAlgo(3));
	}

}

package com.example.JUNIT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JunitApplication.class)
public class JunitApplicationTests {

	@Test
	public void contextLoads() {
	}

}

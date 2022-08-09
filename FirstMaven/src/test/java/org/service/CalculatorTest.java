package org.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculatorTest {
	Calculator c=null;
	@Mock
	CalculatorService service;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAdd() {
		when(service.add(2, 5)).thenReturn(7);
		c=new Calculator(service);
		assertEquals(7, c.perform(2, 5));
		
		
		
	}

}

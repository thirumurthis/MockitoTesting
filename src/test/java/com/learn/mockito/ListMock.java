package com.learn.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListMock {

	@Test
	public void testListMocks() {
		
		List<String> mockList = mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, mockList.size());
		assertEquals(3,mockList.size());
	}
	
	@Test
	public void testListget() {
		List<String> mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("index0");
		assertEquals("index0", mockList.get(0));
		//when there is no get(1) is set the mock returns null
		//this is due to nice mock behavior. (Easymock is not like this)
		assertEquals(null, mockList.get(1));
			
	}
	
	@Test
	public void testListWithArgumentMatcher() {
		List<String> mockList = mock(List.class);
		when(mockList.get(anyInt())).thenReturn("index");
		assertEquals("index", mockList.get(1));		
	}
	
	@Test(expected = RuntimeException.class)
	public void testException() {
		List<String> mockList = mock(List.class);
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("Some exception"));
		mockList.get(1);
	}

}

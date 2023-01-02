package com.in28minutes.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.mockito.buisnessImple.TodoBuisnessImpl;
import com.in28minutes.mockito.data.TodoService;
import com.in28minutes.mockito.data.TodoServiceBuisnesSTUB;

public class B_TodoServiceMOCKtest {

	@Test
	public void testTodoServiceBuisnesImple_MOCK() {
		TodoService  todoService = mock(TodoService.class);
		
		String[] todos = {"Spring is better","I love Spring ",
		          "springboot application"
             };
		
		when(todoService.retrieveTodos("DUMMY")).thenReturn(Arrays.asList(todos));
		
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		List<String> todoSpringList = todoBuisnessImpl.retriveTodosWithSpring("DUMMY");
		
		assertEquals(2,todoSpringList.size());
	}
	
	@Test
	public void testTodoServiceBuisnesImple_MOCK_EmptyList() {
		TodoService  todoService = mock(TodoService.class);
		
		String[] todos = {};
		
		when(todoService.retrieveTodos("DUMMY")).thenReturn(Arrays.asList(todos));
		
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		List<String> todoSpringList = todoBuisnessImpl.retriveTodosWithSpring("DUMMY");
		
		assertEquals(0,todoSpringList.size());
	}

}

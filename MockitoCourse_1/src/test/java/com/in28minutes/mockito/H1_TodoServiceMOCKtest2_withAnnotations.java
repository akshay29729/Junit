package com.in28minutes.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.in28minutes.mockito.buisnessImple.TodoBuisnessImpl;
import com.in28minutes.mockito.data.TodoService;
import com.in28minutes.mockito.data.TodoServiceBuisnesSTUB;

@RunWith(MockitoJUnitRunner.class)
public class H1_TodoServiceMOCKtest2_withAnnotations {

	@Mock
	TodoService todoservice; 
	// Removed TodoService  todoService = mock(TodoService.class);
	
	@InjectMocks
	TodoBuisnessImpl todoBuisnessImpl;
	// Removed-TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
	
	@Test
	public void testTodoServiceBuisnesImple_MOCK() {
		String[] todos = {"Spring is better","I love Spring ",
		          "springboot application"
             };
		
		when(todoservice.retrieveTodos("DUMMY")).thenReturn(Arrays.asList(todos));

		List<String> todoSpringList = todoBuisnessImpl.retriveTodosWithSpring("DUMMY");
		
		assertEquals(2,todoSpringList.size());
	}
	
	@Test
	public void testTodoServiceBuisnesImple_MOCK_EmptyList() {	
		String[] todos = {};
		
		when(todoservice.retrieveTodos("DUMMY")).thenReturn(Arrays.asList(todos));
		
		List<String> todoSpringList = todoBuisnessImpl.retriveTodosWithSpring("DUMMY");
		
		assertEquals(0,todoSpringList.size());
	}

}

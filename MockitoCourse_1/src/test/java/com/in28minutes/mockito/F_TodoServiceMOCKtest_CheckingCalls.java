package com.in28minutes.mockito;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.mockito.buisnessImple.TodoBuisnessImpl;
import com.in28minutes.mockito.data.TodoService;
import com.in28minutes.mockito.data.TodoServiceBuisnesSTUB;

public class F_TodoServiceMOCKtest_CheckingCalls {
	
	@Test
	public void testDeleteTodoNotRelatedToSpring_MOCK_UsingBDD() {
		//Given
		TodoService  todoService = mock(TodoService.class);
		
		String[] todos = {"Spring is better","I love Spring ",
		          "springboot application"
             };

		given(todoService.retrieveTodos("DUMMY")).willReturn(Arrays.asList(todos));
		
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		
		//When
		todoBuisnessImpl.deleteTodosNotRelataedToSpring("DUMMY");
		
		//then
		verify(todoService).deleteTodos("springboot application");
		verify(todoService,times(1)).deleteTodos("springboot application");
		verify(todoService,never()).deleteTodos("I love Spring");
		verify(todoService,atLeast(1)).deleteTodos("springboot application");
//		verify(todoService,atLeast(2)).deleteTodos("springboot application");
	}
}

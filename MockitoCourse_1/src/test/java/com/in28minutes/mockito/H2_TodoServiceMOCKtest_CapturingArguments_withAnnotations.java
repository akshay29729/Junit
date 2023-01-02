package com.in28minutes.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.runners.MockitoJUnitRunner;

import com.in28minutes.mockito.buisnessImple.TodoBuisnessImpl;
import com.in28minutes.mockito.data.TodoService;
import com.in28minutes.mockito.data.TodoServiceBuisnesSTUB;

@RunWith(MockitoJUnitRunner.class)
public class H2_TodoServiceMOCKtest_CapturingArguments_withAnnotations {
	@Captor
	ArgumentCaptor<String> argumentCaptor;
	// Removed -ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
	
	@Test
	public void testDeleteTodoNotRelatedToSpring_MOCK_CapturingArguments() {
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
//		then(todoService).should().deleteTodos("springboot application");
//		verify(todoService).deleteTodos("springboot application");
//		verify(todoService,times(1)).deleteTodos("springboot application");
//		verify(todoService,never()).deleteTodos("I love Spring");
//		verify(todoService,atLeast(1)).deleteTodos("springboot application");
////		verify(todoService,atLeast(2)).deleteTodos("springboot application");
		
		// Apply captor on method
		then(todoService).should().deleteTodos(argumentCaptor.capture());
		
		//Get captured argument
		assertThat(argumentCaptor.getValue(),is("springboot application"));
	}
	
	@Test
	public void testDeleteTodoNotRelatedToSpring_MOCK_CapturingMultipleArguments() {
		//Given
		TodoService  todoService = mock(TodoService.class);
		
		String[] todos = {"Spring is better","I love rolls ",
		          "springboot application"
             };

		given(todoService.retrieveTodos("DUMMY")).willReturn(Arrays.asList(todos));
		
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		
		//When
		todoBuisnessImpl.deleteTodosNotRelataedToSpring("DUMMY");
		
		//then
//		then(todoService).should().deleteTodos("springboot application");
//		verify(todoService).deleteTodos("springboot application");
//		verify(todoService,times(1)).deleteTodos("springboot application");
//		verify(todoService,never()).deleteTodos("I love Spring");
//		verify(todoService,atLeast(1)).deleteTodos("springboot application");
////		verify(todoService,atLeast(2)).deleteTodos("springboot application");
		
		// Apply captor on method
		then(todoService).should(times(2)).deleteTodos(argumentCaptor.capture());
		
		//Get captured argument
		assertThat(argumentCaptor.getAllValues().size(),is(2));
	}
}

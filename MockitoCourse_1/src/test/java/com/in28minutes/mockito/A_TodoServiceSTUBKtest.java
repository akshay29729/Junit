package com.in28minutes.mockito;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.in28minutes.mockito.buisnessImple.TodoBuisnessImpl;
import com.in28minutes.mockito.data.TodoService;
import com.in28minutes.mockito.data.TodoServiceBuisnesSTUB;

public class A_TodoServiceSTUBKtest {

	@Test
	public void testTodoServiceBuisnesImple_STUB() {
		TodoService  todoServiceStubb = new TodoServiceBuisnesSTUB();
		
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoServiceStubb);
		List<String> todos = todoBuisnessImpl.retriveTodosWithSpring("DUMMY");
		
		assertEquals(2,todos.size());
	}

}

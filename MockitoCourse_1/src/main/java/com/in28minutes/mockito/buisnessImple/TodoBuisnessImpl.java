package com.in28minutes.mockito.buisnessImple;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.mockito.data.TodoService;

public class TodoBuisnessImpl {
	private TodoService todoService;

	public TodoBuisnessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retriveTodosWithSpring(String user){
		List<String> todosWithSpring = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				todosWithSpring.add(todo);		
				}
		}
		
		return todosWithSpring;
	}
	
	public void deleteTodosNotRelataedToSpring(String user) {
		List<String> todosWithSpring = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		
		for(String todo:todos) {
			if(!todo.contains("Spring")) {
				todoService.deleteTodos(todo);
				}
		}
	}

}

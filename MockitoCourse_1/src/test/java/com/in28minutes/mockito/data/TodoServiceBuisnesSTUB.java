package com.in28minutes.mockito.data;

import java.util.Arrays;
import java.util.List;

public class TodoServiceBuisnesSTUB implements TodoService {

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		String[] todos = {"Spring is better","I love Spring ",
				          "springboot application"
		               };
		return Arrays.asList(todos);
	}

	public void deleteTodos(String user) {
		// TODO Auto-generated method stub
		
	}
}

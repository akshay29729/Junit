package com.in28minutes.mockito.data;

import java.util.List;

public interface TodoService {

	public List<String> retrieveTodos(String user);
	public void deleteTodos(String todo);
}

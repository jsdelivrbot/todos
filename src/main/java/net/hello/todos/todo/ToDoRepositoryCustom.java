package net.hello.todos.todo;

import java.util.List;

public interface ToDoRepositoryCustom {
	
	public List<ToDo> findByContent(String content);

}

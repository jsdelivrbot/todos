package net.hello.todos.todo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository<ToDo,String>, ToDoRepositoryCustom {
	
	//public List<ToDo> findByContent(String content);

}

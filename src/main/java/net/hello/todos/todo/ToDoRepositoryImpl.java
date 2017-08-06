package net.hello.todos.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class ToDoRepositoryImpl implements ToDoRepositoryCustom {

	@Autowired MongoTemplate mongoTemplate;
	
	@Override
	public List<ToDo> findByContent(String content) {
		Query query = new Query(Criteria.where("content").regex(content));
		return mongoTemplate.find(query, ToDo.class);
	}

}

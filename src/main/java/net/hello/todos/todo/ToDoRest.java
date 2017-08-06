package net.hello.todos.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/todos")
@Api(value = "todos")
public class ToDoRest {
	
	@Autowired
	private ToDoRepository toDoRepository;
	
	@ApiOperation(value = "Gets todos based on its content", notes = "Retrieves a list of todos", response = ToDo.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "filter", value = "filter by content", required = true, dataType = "string", paramType = "query") })

	@RequestMapping(method=RequestMethod.GET)
	public List<ToDo> getToDoByContent(@RequestParam("filter") String filter){
		/*List<ToDo> todos = new ArrayList<ToDo>();
		ToDo todo = new ToDo();
		todo.setContent("test");
		todos.add(todo);
		return todos;*/
		return toDoRepository.findByContent(filter);
	}
	
	@ApiOperation(value = "Creates a to do", notes = "Creates a to do", response = ToDo.class)
	@ApiImplicitParams({
		@ApiImplicitParam(name = "toDo", value = "to do", required = true, dataType="ToDo", paramType = "body") })
	@RequestMapping(method=RequestMethod.POST)
	public ToDo createToDo(@RequestBody ToDo toDo){
		return toDoRepository.save(toDo);
	}

}

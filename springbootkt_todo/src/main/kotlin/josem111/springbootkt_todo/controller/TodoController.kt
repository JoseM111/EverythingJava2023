package josem111.springbootkt_todo.controller
// ***************************************************

import jakarta.validation.Valid
import josem111.springbootkt_todo.models.Todo
import josem111.springbootkt_todo.services.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

// ***************************************************

@RestController
@RequestMapping("/v1/api/")
class TodoController {
	@Autowired
	lateinit var todoService: TodoService
	
	@PostMapping("/todo")
	fun saveTodo(@Valid @RequestBody todo: Todo): Todo {
		return todoService.saveTodo(todoEntity = todo)
	}
	
	@GetMapping("/todo")
	fun fetchAllTodo(): List<Todo>? {
		return todoService.fetchAllTodos()
	}
	
	@PutMapping("/todo/{id}")
	fun updateTodo(
		@PathVariable("id") id: Long,
		@Valid @RequestBody todo: Todo,
	): Todo {
		return todoService.updateTodo(todoEntity = todo, todoId = id)
	}
	
	@DeleteMapping("/todo/{id}")
	fun deleteTodoById(@PathVariable("id") deleteTodoById: Long): String {
		return todoService.deleteTodo(todoId = deleteTodoById)
	}
}
// ***************************************************


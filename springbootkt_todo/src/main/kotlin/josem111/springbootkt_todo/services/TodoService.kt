package josem111.springbootkt_todo.services
// ***************************************************

import josem111.springbootkt_todo.models.Todo
import josem111.springbootkt_todo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
// ***************************************************

@Service
class TodoService {
	@Autowired
	lateinit var todoRepo: TodoRepository
	
	/** @CREATE-TODO */
	fun saveTodo(todoEntity: Todo): Todo {
		return todoRepo.save(todoEntity)
	}
	
	/** @READ-ALL-TODOS */
	fun fetchAllTodos(): List<Todo>? {
		return todoRepo.findAll()
	}
	
	/** @UPDATE-TODO */
	fun updateTodo(todoEntity: Todo, todoId: Long): Todo {
		val newTodo: Todo = todoRepo.getReferenceById(todoId)
		
		return todoRepo.save(newTodo.also { self: Todo ->
			self.title = todoEntity.title
			self.description = todoEntity.description
			self.progress = todoEntity.progress
		})
		
		// newTodo.title = todoEntity.title
		// newTodo.description = todoEntity.description
		// newTodo.progress = todoEntity.progress
	}
	
	fun deleteTodo(todoId: Long): String {
		todoRepo.deleteById(todoId)
		return "Deleted todo with ID of: $todoId"
	}
}
// ***************************************************















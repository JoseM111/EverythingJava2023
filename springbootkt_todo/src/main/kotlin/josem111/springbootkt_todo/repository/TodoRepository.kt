package josem111.springbootkt_todo.repository
// ***************************************************

import josem111.springbootkt_todo.models.Todo
import org.springframework.data.jpa.repository.JpaRepository
// ***************************************************

interface TodoRepository: JpaRepository<Todo, Long>
// ***************************************************

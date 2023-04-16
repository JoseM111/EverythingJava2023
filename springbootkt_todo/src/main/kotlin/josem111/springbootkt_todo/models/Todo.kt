package josem111.springbootkt_todo.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

// ***************************************************

@Entity
@Table(name = "todo")
class Todo {
	@Id
	@GeneratedValue
	val id: Long = 0
	
	@Column(name = "title", nullable = false)
	var title: String = ""
	
	@Column(name = "description", nullable = false)
	var description: String = ""
	
	@Column(name = "progress", nullable = false)
	var progress: Boolean = false
	
	@CreationTimestamp
	val createdAt: Date? = null
	
	@UpdateTimestamp
	val updatedAt: Date? = null
}
// ***************************************************

package josem111.kt_springboot.services
// ***************************************************

// Import necessary libraries and modules
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import josem111.kt_springboot.models.Message
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.*
// ***************************************************

// Define a service class for messages
@Service
class MessageService(val db: JdbcTemplate) {
	// Create an instance of the ObjectMapper class to serialize and deserialize data
	val dataMapper: ObjectMapper = jacksonObjectMapper()
	
	// Define a function to retrieve all messages from the database
	fun findMessages(): List<Message> {
		// Query the database and create a list of Message objects
		val messages: MutableList<Message> = db
			.query("select * from messages") { resp, _ ->
				Message(
					id = resp.getString("id"), resp.getString("text")
				)
			}
		
		// Serialize the list of messages to a JSON string and print it to the console
		val dataToJson: String = dataMapper.writeValueAsString(messages)
		print("All messages:\n$dataToJson")
		
		// Return the list of messages
		return messages
	}
	
	// Define a function to save a message to the database
	fun saveMsg(msg: Message) {
		// Generate a unique ID for the message if none is provided
		val idStatusOk: String = msg.id ?: UUID.randomUUID().toString()
		
		// Serialize the message to a JSON string and print it to the console
		
		// Insert the message into the database
		db.update(
			"Insert into messages values (?, ?)",
			idStatusOk, msg.text
		)
		
		val dataToJson = dataMapper.writeValueAsString(msg)
		println("Saved message:\n$dataToJson")
	}
}

// ***************************************************

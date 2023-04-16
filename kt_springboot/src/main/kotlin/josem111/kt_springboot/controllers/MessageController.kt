// MessageController.kt
package josem111.kt_springboot.controllers
// ***************************************************

import josem111.kt_springboot.models.Message
import josem111.kt_springboot.services.MessageService
import org.springframework.web.bind.annotation.*

// ***************************************************

@RestController
class MessageController(val service: MessageService) {
	/** CREATE A MESSAGE */
	@PostMapping("/")
	fun postMsg(@RequestBody msg: Message) {
		return service.saveMsg(msg = msg)
	}
	
	/** READ  ALL MESSAGES */
	@GetMapping("/")
	fun findAllMessages(): List<Message> {
		return service.findMessages()
	}
	
	// ============ health check ============
	// @GetMapping("/api")
	// fun queryName(@RequestParam("name") request: String): String {
	// 	return "Hello, $request"
	// }
	
	// dummy data
	// @GetMapping("/")
	// fun index() = listOf<Message>(
	// 	Message(id = "1", text = "Hello!"),
	// 	Message(id = "2", text = "Bonjour!"),
	// 	Message(id = "3", text = "Privet!"),
	// )
}
// ***************************************************
package alias111.firstboot_kotlin.controllers

import alias111.firstboot_kotlin.models.CreateAccount
import alias111.firstboot_kotlin.models.ViewAccount
import org.springframework.web.bind.annotation.*

// ___________________________________________________________

@RestController
@RequestMapping("/accounts")
class AccountsController {
	@GetMapping("healthcheck")
	fun healthCheck(): String = """
		<div
			style='font-size:2.3rem;
			font-family: Iceland,sans-serif;
			margin-top: 20rem;
			margin-left: 17rem;'
		>
			<strong>Testing springboot connection:</strong>
			<span style='color:#00A31B;font-family:Nosifer,serif;'>
				&nbsp Ok->>200
			</span>
		</div>
	""".trimIndent()
	
	/**
	 * ! Iterable Classes that inherit from this interface can be
	 * represented as a sequence of elements that can be iterated
	 * over.
	 */
	@GetMapping("")
	fun getAll(): Iterable<ViewAccount> = listOf(
		ViewAccount(
			id = 1, name = "First"
		)
	)
	
	@PostMapping("")
	fun create(@RequestBody request: CreateAccount): ViewAccount =
		ViewAccount(id = 2, name = request.name)
}
// ___________________________________________________________
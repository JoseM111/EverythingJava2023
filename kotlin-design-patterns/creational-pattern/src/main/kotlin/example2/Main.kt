package example2

import utilities.convertToJson

// FILE: Main.kt
// ___________________________________________________________

// ___________________________________________________________

fun main() {
	val splitter = "__________________________________________"
	println(splitter)
	// =====================================================
	
	
	val mail = MailBuilder()
		.recipients(listOf("manager@company.com"))
		.cc(listOf("cc@example.com"))
		.title("Ping")
		.msg("This is a message")
		.important(true)
		.build()
	
	println(convertToJson(mail))
	// =====================================================
	println(splitter)
}
// ___________________________________________________________
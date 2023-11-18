package example3

import utilities.convertToJson

// FILE: Main.kt
// ___________________________________________________________

// ___________________________________________________________

fun main() {
	val splitter = "__________________________________________"
	println(splitter)
	// =====================================================
	
	
	val mail = Mail_V2(to = listOf("alias_one11@gmail.com")).apply {
		msg("Im back in the office")
		cc(listOf("jacob@yahoo.com", "larryover@outlook.com"))
		title("Work email")
		important(true)
	}
	
	println(convertToJson(mail))
	// =====================================================
	println(splitter)
}
// ___________________________________________________________
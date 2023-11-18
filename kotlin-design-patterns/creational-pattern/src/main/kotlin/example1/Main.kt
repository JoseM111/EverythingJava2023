package example1// FILE: Main.kt
// ___________________________________________________________

import utilities.convertToJson
// ___________________________________________________________

fun main() {
	val splitter = "__________________________________________"
	println(splitter)
	// =====================================================
	
	val mail = Mail_V1(
		to = listOf("manager@company.com"),
		cc = null,
		title = "Ping ",
		msg = null,
		important = true
	)
	
	println(convertToJson(objectToConvert = mail))
	// =====================================================
	println(splitter)
}
// ___________________________________________________________
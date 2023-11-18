// FILE: enums/Main.kt
package enums

import models.State
import utils.spacerHelper

// ____________________________________________________

fun main() {
	spacerHelper("=", 55)
	// ====================================================
	
	val state = State.RUNNING
	
	@Suppress("KotlinConstantConditions")
	(when (state) {
		State.IDLE -> "It's idle"
		State.RUNNING -> "It's running"
		State.FINISHED -> "It's finished"
	}).also(::println)
	// ====================================================
	spacerHelper("=", 55)
}
// ____________________________________________________












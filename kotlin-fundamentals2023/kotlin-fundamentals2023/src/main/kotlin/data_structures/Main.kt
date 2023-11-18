package data_structures

import utils.spacerHelper

// FILE: main/kotlin/Main.kt
// ____________________________________________________

// ____________________________________________________

fun main() {
	spacerHelper("=", 55)
	// ====================================================
	/** @set */
	val footballChampions = setOf(
		"France",
		"Germany",
		"Spain",
		"Italy",
		"Brazil",
		"France",
		"Germany"
	)
	
	// Will only print each value once. So no duplicates
	println("Football Champions: ( $footballChampions )")
	// Will return either true or false
	println("Is Israel in footballChampions?: ( ${"Israel" in footballChampions} )")
	println("Is Italy in footballChampions?: ( ${"Italy" in footballChampions} )")
	
	/** @Maps->>Immutable */
	val batmanMovies: Map<String, String> = mapOf(
		"Batman Returns" to "Michael Keaton",
		"Batman Forever" to "Val Kilmer",
		"Batman & Robin" to "George Clooney"
	)
	
	batmanMovies.forEach {
		println("Batman movie: ( $it )")
	}
	
	// Access a certain item
	val item1 = batmanMovies["Batman Returns"]
	println("Which movie from item1?: ( $item1 )")
	
	// Maps also support checking that an element doesn't exist
	println(
		"Is Batman Begins in the list of movies?: " +
			"( ${"Batman Begins" !in batmanMovies} )"
	)
	
	// Mutable Maps
	val editableHobbits = mutableListOf(
		"Frodo", "Sam", "Pippin", "Merry"
	)
	
	editableHobbits.add("Bilbo")
	println("editableHobbits revised: ( $editableHobbits )")
	// ====================================================
	spacerHelper("=", 55)
}
// ____________________________________________________













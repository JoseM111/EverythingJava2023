// FILE: misc/Main.kt
package misc
// ___________________________________________________________

import utils.spacerHelper

// ___________________________________________________________

fun isArchEnemyCheck(strArg: String, heroName: String) {
	val result: String = when (heroName) {
		"Batman" -> "Joker"
		"Superman" -> "Lex Luther"
		"Spiderman" -> "Green Goblin"
		else -> "Sorry no idea"
	}
	
	println("$strArg?: $result")
}
// ____________________________________________________

fun main() {
	spacerHelper("=", 55)
	// ====================================================
	
	/**
	 * - **listOf Initialization**: Creates an immutable list with
	 *   specified elements.
	 * - **arrayOf Initialization**: Creates an array with
	 *   specified elements but can't set size.
	 * - **arrayListOf Initialization**: Creates a mutable,
	 *   resizable list with specified elements.
	 * - **listOf Mutability**: Immutable.
	 * - **arrayOf Mutability**: Mutable but fixed size.
	 * - **arrayListOf Mutability**: Mutable and resizable.
	 * - **listOf, arrayOf, arrayListOf Type**: `List<T>`,
	 *   `Array<T>`, and `ArrayList<T>` respectively.
	 * - **listOf, arrayOf, arrayListOf API**: `listOf` and
	 *   `arrayListOf` offer high-level methods; `arrayOf` has a
	 *   basic API.
	 * - **listOf, arrayOf, arrayListOf Nullability**: Can include
	 *   `null` if the type parameter is nullable.
	 */
	val listOfArchEnemies = arrayListOf(
		"Batman",
		"Superman",
		"Spiderman",
		"Ironman"
	)
	
	// Destructuring the list to get the third and fourth elements.
// Using underscores to skip the first and second elements.
	val (_, _, rightArchEnemy, wrongArchEnemy) = listOfArchEnemies
	
	
	// check if the archEnemy exist based off the hero
	isArchEnemyCheck("Is 'Spiderman\'s' enemy there", rightArchEnemy)
	isArchEnemyCheck("Is 'Ironman\'s' enemy there", wrongArchEnemy)
	
	// Displaying our array list in reverse
	listOfArchEnemies.reversed().forEach { i: String ->
		println("for reversed: $i")
	}
	// ====================================================
	spacerHelper("=", 55)
}
// ____________________________________________________











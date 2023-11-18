// FILE: data_classes/Main.kt
package data_classes

import models.User
import utils.spacerHelper

// ____________________________________________________

fun main() {
	spacerHelper("=", 55)
	// ====================================================
	
	val user = User("Alias111", 1)
	println(user)
	
	val user2 = User("Alias111", 1)
	val user3 = User("Max", 2)
	
	println("user == secondUser: ${user == user2}")
	println("user == thirdUser: ${user == user3}\n")
	
	/**
	 * Whenever it is invoked on the same object more than once,
	 * the hashCode method must consistently return the same
	 * integer, provided no information used in equals comparisons
	 * on the object is modified. If two objects are equal
	 * according to the equals() method, then calling the hashCode
	 * method on each of the two objects must produce the same
	 * integer result.
	 */
	println("user hashcode: ${user.hashCode()}")
	println("user2 hashcode: ${user2.hashCode()}")
	println("user3 hashcode: ${user3.hashCode()}")
	
	val userClone = user.copy()
	println("\nuser copy: $userClone")
	println("is user === user copy: ${user === userClone}\n")
	
	// changes the name prop to `Max`
	val userCopyOfMax = user.copy(name = "Max")
	println("userCopyOfMax: $userCopyOfMax\n")
	
	// changes the user id to `17`
	val userCopyId = user.copy(id = 17)
	println("userCopyId: $userCopyId\n")
	
	// Auto-generated componentN functions let you get the
	// values of properties in the order of declaration.
	println("name = ${user.component1()}")                 // 10
	println("id = ${user.component2()}")
	// ====================================================
	spacerHelper("=", 55)
}
// ____________________________________________________














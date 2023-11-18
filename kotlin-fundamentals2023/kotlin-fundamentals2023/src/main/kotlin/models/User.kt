// FILE: models/User.kt
package models

// ____________________________________________________

data class User(val name: String, val id: Int) {
	override fun equals(other: Any?): Boolean {
		return (other is User) && (other.id == this.id)
	}
	
	override fun hashCode(): Int {
		var result = name.hashCode()
		result = 31 * result + id.hashCode()
		return result
	}
	
	override fun toString(): String {
		return """
			User: {
				name: $name
				id: $id
			}
		""".trimIndent()
	}
}
// ____________________________________________________


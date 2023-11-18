package alias111.firstboot_kotlin.models

// ___________________________________________________________

data class ViewAccount(
	val id: Int,
	val name: String,
) {
	override fun toString(): String {
		return """
			ViewAccount: {
				ID: $id
				NAME: $name
			}
		""".trimIndent()
	}
}
// ___________________________________________________________

package example1
// FILE: models/Mail_V1
// ___________________________________________________________

// ___________________________________________________________

// We can describe an email in our system as a data class
data class Mail_V1(
	val to: List<String>,
	val cc: List<String>?,
	val title: String?,
	val msg: String?,
	val important: Boolean,
)
// ___________________________________________________________

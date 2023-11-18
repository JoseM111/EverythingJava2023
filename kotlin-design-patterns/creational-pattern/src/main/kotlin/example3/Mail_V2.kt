package example3
// FILE: example3/Mail_V2.kt
// ___________________________________________________________

data class Mail_V2(
	val to: List<String>,
	private var _msg: String? = null,
	private var _cc: List<String>? = null,
	private var _title: String? = null,
	private var _important: Boolean? = null,
) {
	
	fun msg(msg: String) = apply {
		this._msg = msg
	}
	
	fun cc(cc: List<String>) = apply {
		this._cc = cc
	}
	
	fun title(title: String) = apply {
		this._title = title
	}
	
	fun important(important: Boolean) = apply {
		this._important = important
	}
}
// ___________________________________________________________

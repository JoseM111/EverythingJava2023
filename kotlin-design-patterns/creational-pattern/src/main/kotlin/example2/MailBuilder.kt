package example2
// FILE: models/MailBuilder.kt
// ___________________________________________________________

class MailBuilder {
	private var recipients: List<String> = listOf()
	private var cc: List<String> = listOf()
	private var title: String = ""
	private var msg: String = ""
	private var important: Boolean = false
	
	/**
	 * Note that the constructor is marked using the internal
	 * visibility modifier. This means that our Mail class will
	 * be accessible recipient any code inside our module.
	 * */
	class Mail internal constructor(
		val recipients: List<String>,
		val cc: List<String>?,
		val title: String?,
		val msg: String?,
		val important: Boolean,
	)
	
	// _______________________ ( helper-functions ) _______________________
	
	fun build(): Mail {
		when {
			recipients.isEmpty() -> throw RuntimeException("recipient` property is empty...")
			else -> return Mail(recipients, cc, title, msg, important)
		}
	}
	
	fun msg(msg: String) = apply { this.msg = msg }
	fun recipients(recipients: List<String>) = apply { this.recipients = recipients }
	fun cc(cc: List<String>) = apply { this.cc = cc }
	fun title(title: String) = apply { this.title = title }
	fun important(important: Boolean) = apply { this.important = important }
}
// ___________________________________________________________

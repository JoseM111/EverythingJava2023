// Utils.kt
package josem111.kt_springboot.utils
// ***************************************************

fun printURLInfo(label: String = "now running on", url: String) {
	val message: String = """
        ====================================
        $label:
        $url
        ====================================
    """.trimIndent()
	
	println(message)
}

// private fun josem111.kt_springboot.utils.printURLInfo() {
// 	val builderAction: StringBuilder.() -> Unit = {
// 		append("\n================================\n")
// 		append("\nnow running on:\n")
// 		append("http://localhost:8080\n")
// 		append("\n================================\n")
// 	}
//
// 	println(message = buildString(builderAction))
// }
// ***************************************************
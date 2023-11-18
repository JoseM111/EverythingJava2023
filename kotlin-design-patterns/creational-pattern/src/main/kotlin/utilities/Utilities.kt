package utilities
// FILE: utilities/Utilities.kt
// ___________________________________________________________

import com.google.gson.Gson
import com.google.gson.GsonBuilder
// ___________________________________________________________

// This function now creates its own Gson object
fun <Type> convertToJson(objectToConvert: Type): String {
	val gson: Gson = GsonBuilder().setPrettyPrinting().create()
	return gson.toJson(objectToConvert)
}
// ___________________________________________________________
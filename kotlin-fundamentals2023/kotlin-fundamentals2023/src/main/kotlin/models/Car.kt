package models
// FILE: models/Car.kt
// ____________________________________________________

data class Car(
	val make: String,
	val model: String,
	val year: Int,
	val price: Double,
) {
	override fun toString(): String {
		val formattedPrice = "%.2f".format(price)
		
		val result = """
			Car: {
				make: $make
				model: $model
				year: $year
				price: $$formattedPrice
			}
		""".trimIndent()
		
		return result
	}
}
// ____________________________________________________

// Extension function to calculate the average price of a list of Cars
fun List<Car>.averagePrice(): String {
	val avg = this.map { it.price }.average()
	return "%.2f".format(avg)
}

// Extension function to check if there are cars based on year
fun List<Car>.filterYear(year: Int): Boolean =
	// Returns true if at least one element matches the given predicate.
	this.any { it.year >= year }

// Extension function to sort cars by price
fun List<Car>.sortByPrice(): List<Car> {
	return this.sortedBy { it.price }
}
// ____________________________________________________














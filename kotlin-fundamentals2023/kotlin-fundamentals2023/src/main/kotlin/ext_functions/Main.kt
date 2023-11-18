// FILE: ext_functions/Main.kt
package ext_functions

import models.Car
import models.averagePrice
import models.filterYear
import models.sortByPrice
import utils.spacerHelper
import models.Car as CarModels

// ____________________________________________________

fun main() {
	spacerHelper("=", 55)
	// ====================================================
	
	val cars = listOf(
		CarModels(make = "Toyota", model = "Camry", year = 2019, price = 30000.00),
		CarModels(make = "Honda", model = "Civic", year = 2020, price = 28000.00),
		CarModels(make = "Ford", model = "Focus", year = 2018, price = 22000.00)
	)
	
	cars.forEach { car: Car ->
		println("\n$car")
	}
	
	// Using the extension function to get the average price of the cars in the dealership
	println("Average price of cars: $${cars.averagePrice()}")
	
	// Using the extension function to check for cars from a certain year or newer
	val hasRecentCars = cars.filterYear(2019)
	println("Are there cars from 2019 or newer? $hasRecentCars")
	
	// Using the extension function to sort cars by price and print them
	val sortedCars = cars.sortByPrice()
	println("Cars sorted by price: ")
	sortedCars.forEach { println(it) }
	// ====================================================
	spacerHelper("=", 55)
}
// ____________________________________________________
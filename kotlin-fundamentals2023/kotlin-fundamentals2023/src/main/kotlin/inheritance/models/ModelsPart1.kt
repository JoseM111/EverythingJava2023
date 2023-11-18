package inheritance.models
// ___________________________________________________________

open class Mammal {
	val haveHairOrFur = true
	val isWarmBlooded = true
	var canFeed = false
	
	open fun feedYoung() {
		if (canFeed) {
			println("Feeding young with milk...")
		}
	}
}

class Dog1 : Mammal() {
	fun makeVoice() {
		println("Bark bark")
	}
}
// ___________________________________________________________
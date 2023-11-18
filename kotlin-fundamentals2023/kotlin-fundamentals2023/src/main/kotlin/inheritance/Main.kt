package inheritance

import inheritance.models.Cat2
import inheritance.models.Dog1
import inheritance.models.Dog2
import inheritance.models.Mammal
import utils.spacerHelper

// ___________________________________________________________

// ===========================================================

// ___________________________________________________________

fun main() {
	spacerHelper("•", 55)
	
	/* <Overriding elements> ======================= */
	println("\nPART # 1 ( Overriding elements ) ^^^^^^^^^^^^^^^^^^^^^^^^^^^")
	val dog = Dog1()
	dog.makeVoice() // Bark Bark
	
	println("Does dog have hair?: | ${dog.haveHairOrFur} |")
	println("Is dog warm blooded?: | ${dog.isWarmBlooded} |")
	
	// Dog is Mammal, so we can up-cast it
	val upCastAsMammal: Mammal = dog
	upCastAsMammal.canFeed = true
	upCastAsMammal.feedYoung()
	
	/* <Parents with non-empty constructors> ==================== */
	println("\nPART # 2 ( Parents with non-empty constructors ) ^^^^^^^^^^^")
	val dog2 = Dog2("Calletica")
	println("Dog name: | ${dog2.name} |")
	val cat2 = Cat2("Cookie")
	println("Cat name: | ${cat2.name} |")
	
	/* <Interfaces> ==================== */
	println("\nPART # 3 ( Interfaces ) ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
	
	
	spacerHelper("•", 55)
}
// ___________________________________________________________




















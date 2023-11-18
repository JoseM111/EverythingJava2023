package inheritance.models
// ___________________________________________________________

open class Animal(val name: String)

class Dog2(name: String) : Animal("My name is ( $name )")
class Cat2(name: String) : Animal("Mr $name")
// ___________________________________________________________
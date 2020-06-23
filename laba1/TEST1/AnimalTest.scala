import org.scalatest.FunSuite
class AnimalTest extends FunSuite {
  test("Animal.apply creates animal if valid parameter is passed") {
    assert(Animal.apply("cat") == (Some(Animal.cat)))
    assert(Animal.apply("parrot") == (Some(Animal.parrot)))
    assert(Animal.apply("goldfish") == (Some(Animal.goldfish)))
  }
  test("Animal.apply returns None if wrong parameter is passed") {
    assert(Animal.apply("wrongParam") == None)
  }
  test("KnownAnimal returns true if valid animal is passed") {
    assert(Animal.knownAnimal("cat") && Animal.knownAnimal("parrot") &&
      Animal.knownAnimal("goldfish") == true)
  }
  test("KnownAnimal returns false if invalid animal is passed") {
    assert(Animal.knownAnimal("tiger") == false)
  }
  test("Animal.eats checks if animal eats given food") {
    val lion = Mammals("lion", "meat")
    assert(lion.eats("meat") == true)
    assert(lion.eats("plants") == false)
  }
}

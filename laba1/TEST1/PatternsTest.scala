import org.scalatest._
class PatternsTest extends FunSuite {
  test("intToString recognizes numbers from 1 to 3 inclusively") {
    assert(PatternMatching.intToString(1) == "it is one")
    assert(PatternMatching.intToString(2) == "it is two")
    assert(PatternMatching.intToString(3) == "it is three")
    assert(PatternMatching.intToString(102019) == "what's that")
  }
  test("testIntToString calls intToString with given parameters") {
    assert(PatternMatching.testIntToString(1) == "it is one")
    assert(PatternMatching.testIntToString(2) == "it is two")
    assert(PatternMatching.testIntToString(3) == "it is three")
    assert(PatternMatching.testIntToString(102019) == "what's that")
  }
  test("isMaxAndMoritz recognizes (M)max and (M)moritz") {
    assert(PatternMatching.isMaxAndMoritz("max") &&
      PatternMatching.isMaxAndMoritz("Max") &&
      PatternMatching.isMaxAndMoritz("moritz") &&
      PatternMatching.isMaxAndMoritz("Moritz")  == true)
    assert(PatternMatching.isMaxAndMoritz("notMax")  == false)
  }
  test("testIsMaxAndMoritz calls isMaxAndMoritz with given parameter") {
    assert(PatternMatching.testIsMaxAndMoritz("max") &&
      PatternMatching.testIsMaxAndMoritz("Max") &&
      PatternMatching.testIsMaxAndMoritz("moritz") &&
      PatternMatching.testIsMaxAndMoritz("Moritz")  == true)
    assert(PatternMatching.testIsMaxAndMoritz("notMax")  == false)
  }
  test("isEven returns true if number is even and false otherwise") {
    assert(PatternMatching.isEven(10)  == true)
    assert(PatternMatching.isEven(11)  == false)
  }
  test("testIsEven calls isEven with given parameter") {
    assert(PatternMatching.testIsEven(10)  == PatternMatching.isEven(10))
    assert(PatternMatching.testIsEven(11)  == PatternMatching.isEven(11))
  }
  test("winsA returns rock-paper-scissor game result for first player") {
    assert(PatternMatching.winsA(PatternMatching.Rock, PatternMatching.Rock)  == PatternMatching.Draw)
    assert(PatternMatching.winsA(PatternMatching.Rock, PatternMatching.Paper)  == PatternMatching.Lose)
    assert(PatternMatching.winsA(PatternMatching.Rock, PatternMatching.Scissor)  == PatternMatching.Win)
    assert(PatternMatching.winsA(PatternMatching.Paper, PatternMatching.Rock)  == PatternMatching.Win)
    assert(PatternMatching.winsA(PatternMatching.Paper, PatternMatching.Paper)  == PatternMatching.Draw)
    assert(PatternMatching.winsA(PatternMatching.Paper, PatternMatching.Scissor)  == PatternMatching.Lose)
    assert(PatternMatching.winsA(PatternMatching.Scissor, PatternMatching.Rock)  == PatternMatching.Lose)
    assert(PatternMatching.winsA(PatternMatching.Scissor, PatternMatching.Paper)  == PatternMatching.Win)
    assert(PatternMatching.winsA(PatternMatching.Scissor, PatternMatching.Scissor)  == PatternMatching.Draw)
  }
  test("testWinsA calls winsA with given parameters") {
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Scissor)  ==
      PatternMatching.winsA(PatternMatching.Rock, PatternMatching.Scissor))
  }
  test("extractMammalWeight returns mammal's weight and -1 if not mammal is passed") {
    assert(PatternMatching.extractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5))  == 5)
    assert(PatternMatching.extractMammalWeight(PatternMatching.Fish("goldfish", PatternMatching.Vegetables))  == -1)
  }
  test("testExtractMammalWeight calls extractMammalWeight with given parameter") {
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5))  == 5)
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Fish("goldfish", PatternMatching.Vegetables))  == -1)
  }
  test("updateFood changes animal food") {
    val fish = PatternMatching.Fish("goldfish", PatternMatching.Plants)
    PatternMatching.updateFood(fish)
    assert(fish.food  == PatternMatching.Plants)
    val bird = PatternMatching.Bird("parrot", PatternMatching.Vegetables)
    PatternMatching.updateFood(bird)
    assert(bird.food  == PatternMatching.Plants)
  }
  test("testUpdateFood calls updateFood with given parameter") {
    val fish = PatternMatching.Fish("goldfish", PatternMatching.Vegetables)
    PatternMatching.testUpdateFood(fish)
    assert(fish.food  == PatternMatching.Plants)
  }
}
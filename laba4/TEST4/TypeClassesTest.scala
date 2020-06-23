import org.scalatest.FunSuite
import TypeClasses._
class TypeClassesTest extends FunSuite {
  test("testReversableString should return reversed string") {
    assert(testReversableString("tevirp") == "privet")
  }
  test("smash should add integer numbers and multiply double numbers") {
    assert(smash(2, 4) == 8)
    assert(smash(3.2, 3.5) ==11.2)
    assert(smash("Concat", "String") == "ConcatString")
  }
  test("testSmashInt should add integer numbers") {
    assert(testSmashInt(2, 4) == 8)
  }
  test("testSmashDouble should multiply double numbers") {
    assert(testSmashDouble(3.2, 3.5) == 11.2)
  }
  test("testSmashString should concatenate strings") {
    assert(testSmashString("Авто", "Колонна") == "АвтоКолонна")
  }
}
import org.scalatest.FunSuite
import Strings._
class StringsTest extends FunSuite {
  test("testUppercase returns string with all capital letters") {
    assert(testUppercase("mtuci") == "MTUCI")
  }
  test("testInterpolation inserts given name and age into string") {
    assert(testInterpolations("Dasha", 20) == "Hi, my name is Dasha and I am 20 years old.")
  }
  test("testComputation inserts numbers into string") {
    assert(testComputation(1, 2) == "Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      "  a := 1\n" +
      "  b := 2\n\n" +
      "  return 1 + 2")
  }
  test("testTakeTwo takes first two characters of the string") {
    assert(testTakeTwo("HiDear") ==  "Hi")
  }
}

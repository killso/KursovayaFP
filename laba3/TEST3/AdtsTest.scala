import org.scalatest.FunSuite
import Adts._
class AdtsTest extends FunSuite{
  test("testGetNth should return n-th element of the list") {
    assert(testGetNth(List(1, 2, 3, 4), 3) == Some(4))
  }
  test("Double should return doubled number and None if None is passed") {
    assert(Double(Some(3)) == Some(6))
    assert(Double(None) == None)
  }
  test("testDouble should return double number and None if None is passed") {
    assert(testDouble(Some(3)) == Some(6))
    assert(testDouble(None) == None)
  }
  test("IsEven should return passed number if it's even and string \"Odd number\" otherwise") {
    assert(IsEven(4) == Right(4))
    assert(IsEven(5) == Left("Odd number"))
  }
  test("testIsEven should return passed number if it's even and string \"Odd number\" otherwise") {
    assert(testIsEven(4) == Right(4))
    assert(testIsEven(5) == Left("Odd number"))
  }
  test("SafeDivide should divide two numbers unless divisor is 0") {
    assert(SafeDivide(10, 2) == Right(5))
    assert(SafeDivide(10, 0) == Left("Cannot divide by zero"))
  }
  test("testSafeDivide should divide two numbers unless divisor is 0") {
    assert(testSafeDivide(10, 2) == Right(5))
    assert(testSafeDivide(10, 0) == Left("Cannot divide by zero"))
  }
  def impureFunc(str: String): Int = {
    2/0
  }
  def pureFunc(str: String): Int = {
    2
  }
  test("GoodOldJava should return Try[Int]") {
    assert(GoodOldJava(impureFunc, "Hello, world!") != util.Success(2))
  }
  test("testGoodOldJava should return Try[Int]") {
    assert(testGoodOldJava(pureFunc, "Hello, world!") == util.Success(2))
  }
}

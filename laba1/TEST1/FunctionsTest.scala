import org.scalatest.FunSuite
class FunctionsTest extends FunSuite {
  test("CircleArea calculates circle area")  {
    assert(Functions.CircleArea(5) == 5 * 5 * Math.PI)
  }
  test("testCircle calls circleArea with given radius")  {
    assert(Functions.testCircle(5) == 5 * 5 * Math.PI)
  }
  test("RectangleArea calculates area of the given rectangle")  {
    assert(Functions.RectangleArea(2, 3) == 6)
  }
  test("testRectangleUc calls RectangleArea with given parameters")  {
    assert(Functions.testRectangleUc(2, 3) == 6)
  }
  test("RectangleAreaCurried calculates area of the given rectangle")  {
    assert(Functions.RectangeAreaCurried(2)(3) == 6)
  }
  test("testRectangleCurried calls RectangleAreaCurried with given parameters")  {
    assert(Functions.testRectangleCurried(2, 3) == 6)
  }
}
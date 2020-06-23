cimport org.scalatest.FunSuite
import Maps._
class MapsTest extends FunSuite {
  val odnogrup1 = User("Masha", 15)
  val odnogrup2 = User("Dasha", 20)
  val odnogrup3 = User("Sasha", 40)
  val map = Map("Masha" -> odnogrup1, "Dasha" -> odnogrup2, "Sasha" -> odnogrup3)
  val seq = Seq(odnogrup1, odnogrup2, odnogrup3)
  test("testGroupUsers should group users by name and calculate average age of each group") {
    assert(testGroupUsers(seq) == Map("Masha" -> 15, "Dasha" -> 750))
  }
  test("testNumberFrodos counts \"Adam\" count in passed map[String->User]") {
    assert(testNumberFrodos(Map("Masha" -> odnogrup2, "Adam" -> User("Adam", 40))) == 1)
  }
  test("testUnderaged removes from the map all users under 35 years old") {
    assert(testUnderaged(map) == Map("Dasha" -> odnogrup2, "Sasha" -> odnogrup3))
  }
}
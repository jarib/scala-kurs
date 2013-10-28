package scalakurs.basics

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite

class BasicsTest extends FunSuite with ShouldMatchers {

  import Basics._

  /** Oppgave:
    *
    * Få testene under til å kompilere og kjøre grønt
    * De som er kommentert ut, må kommenteres inn.
    */

  test("Basics should contain a constant 'constant'") {
//    constant should be("Constant")
//    Basics.constant = "new value" // <- must not compile
  }

  test("Basics should contain a variable") {
//    variable should be("Variable")
//    Basics.variable = "new value"
//    variable should be("new value")
  }

  test("Say hello") {
    sayHello("Joe") should be("Hello, Joe!")
  }

  test("shout") (
    // Create method:
    //shout("hello") should be("HELLO")
  )

  test("method that adds two integers") {
    add(1, 2) should be (3)
  }

  test("method that computes the square of an integer") {
    square(9) should be (81)
  }

  test("method that computes the cube of an integer") {
    cube(3) should be (27)
  }

  test("method that computes both square and cube of an integer") {
    squareAndCube(3) should be ((9, 27))
  }

  test("compute the sum of ints between a and b") {
    // Hint: for-loop eller lineær rekursjon
    sumInt(1, 6) should be (21)
  }

  /** NB!: Ja, dette er vanskelig hvis du ikke har sett anonyme funksjoner før **/

  test("sum of squares") {
    // lag en metode sumSquare som kombinerer sum og square, til sumSquare
    // sumSquares(1, 3) should be(12)
  }

  test("reimplement sum of integer") {
    // reimplementer sumInt til å bruke sum-funskjonen med to parameterlister
  }

}

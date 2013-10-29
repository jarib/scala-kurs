package scalakurs.functional

import scala.annotation.tailrec


object Functional {

  // Eksempel, imperative style
  def imperativeFib(n: Int): Int = {
    var nth, i1 = 0
    var i2 = 1
    for (i <- 2 until n) {
      nth = i1 + i2
      i1 = i2
      i2 = nth
    }
    nth
  }

  // factorial = fakultet (5! = 5 * 4 * 3 * 2 * 1)
  def factorial(n: Int): Int = {
    def fac0(n: Int, acc: Int): Int = {
      if (n <= 0) 1
      else n * fac0(n - 1, acc)
    }
    fac0(n, 1)
  }

  // hvis det er vanskelig å lage en indre metode, slik at den blir tail recursive,
  // kan du forsøke lineær rekursjon
  def fib(n: Int): Int = {
    @tailrec
    def fib0(x: Int, a: Int, b: Int): Int = {
      if (x <= 1) a
      else fib0(x - 1, b, a + b)
    }

    fib0(n, 0, 1)
  }

}
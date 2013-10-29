package scalakurs.for_comprehensions

import scalakurs.functional.Functional

object ForComprehensions {
  implicit class IntWithPower(i: Int) {
    def **(pow: Int) = math.pow(i, pow).toInt
  }

  def alleFaktorerAv(x: Int): Seq[Int] = for {
      i: Int <- 1 to x
      if x % i == 0
    } yield i

  /**
   * Et pytagoreisk trippel er (a, b, c) der
   * a ** 2 + b ** 2 = c ** 2 og
   * a < b < c
   *
   * Hint: begynn med å generere alle permutasjoner av (a, b, c) der
   * a, b og c er mellom 1 og 100. Filtrer deretter bort ett og ett kriterie.
   *
   * ekstra utfordring: skriv hele metoden som _en_ for-comprehension
   */
  def pytagoreiskeTripler: Seq[(Int, Int, Int)] = {
    for {
      a: Int <- 1 to 100
      b: Int <- 1 to 100 if a < b
      c: Int <- 1 to 100 if b < c
      if a ** 2 + b ** 2 == c ** 2
    } yield (a, b, c)
  }

}


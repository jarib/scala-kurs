class ForComprehensions {
  implicit class IntWithPower(i: Int) {
    def **(pow: Int) = math.pow(i, pow)
  }

  def alleFaktorerAv(x: Int): Seq[Int] = ???

  /**
   * Et pytagoreisk trippel er (a, b, c) der
   * a^2 + b^2 = c^2 og
   * a < b < c
   *
   * ekstra utfordring: skriv hele metoden som _en_ for-comprehension
   */
  def pytagoreiskeTripler: Seq[(Int, Int, Int)] = ???

}


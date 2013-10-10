package scalakurs

class NumeriskeLister {
  def lagRange(a: Int, b: Int): Range = a to b

  def summerRange(a: Int, b: Int): Int = lagRange(a, b).sum

  def summerOddetall(a: Int, b: Int) = Range(1, 200, 2).sum

  def oddetallP(i: Int): Boolean = i % 2 == 1

  def filtrerOddetall(l: List[Int]): List[Int] = l.filter(oddetallP)

  def delOddetallOgPartall(l: List[Int]): (List[Int], List[Int]) = l.partition(oddetallP)

  def detFinnesEtOddetall(l: List[Int]): Boolean = l.exists(oddetallP)

  def alleOddetallP(l: List[Int]): Boolean = l.forall(oddetallP)

  def filtrerListerSomInneholderOddetall(l: List[List[Int]]): List[List[Int]] = l.filter(detFinnesEtOddetall)

  def filtrerListerSomKunInneholderOddetall(l: List[List[Int]]): List[List[Int]] = l.filter(alleOddetallP)

  def filtrerOddetallLister(l: List[List[Int]]): List[Int] = l.flatten.filter(oddetallP)

  def lagPartall(i: Int): Int = if (oddetallP(i)) i + 1 else i

  def lagPartallsliste(l: List[Int]): List[Int] = l.map(lagPartall)

  def divisorer(i: Int): List[Int] = (1 to i/2).filter(i % _ == 0).toList

  def perfektTallP(i: Int): Boolean = divisorer(i).sum == i
}
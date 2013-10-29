package scalakurs.collections

object StrengerSomLister {
  val engelskAlfabet = 'a' to 'z'

  def alfabetPosisjon(c: Char): Int = engelskAlfabet.indexOf(c.toLower)

  def alfabetBokstav(i: Int): Char = engelskAlfabet(i)

  def listOfChars2String(l: List[Char]): String = l.map(_.toString).mkString

  def list2string(l: List[Int]): String = l.map(alfabetBokstav).mkString

  def nummerIAlfabetStreng(s: String): List[Int] = s.toCharArray.map(alfabetPosisjon).toList

  def rot13(c: Char): Char = ???

  def rot13(s: String): String = ???
}

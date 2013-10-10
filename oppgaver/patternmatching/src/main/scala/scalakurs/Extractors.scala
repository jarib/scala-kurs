package scalakurs

case class PhoneNumber(i18nPrefix: Int, number: Int)

object Int {
  def unapply(s : String) : Option[Int] = try {
    Some(s.toInt)
  } catch {
    case _ : java.lang.NumberFormatException => None
  }
}

object PhoneNumber {
  def unapply(str: String): Option[(Int, Int)] = {
    str.split(" ").toList match {
      case (Int(prefix)) :: (Int(number)) :: _  => Some(prefix, number)
      case _ => None
    }
  }
}
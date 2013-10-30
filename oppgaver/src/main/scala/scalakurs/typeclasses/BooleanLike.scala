package scalakurs.typeclasses

trait BooleanLike[-A] {
  def asBoolean(a: A): Boolean
}

object BooleanLike {

  implicit lazy val intBooleanLike = new BooleanLike[Int] {
    def asBoolean(a: Int) = a != 0
  }

  implicit lazy val stringBooleanLike: BooleanLike[String] = new BooleanLike[String] {
    def asBoolean(a: String) = a == "true"
  }

  implicit lazy val optionBooleanLike: BooleanLike[Option[Any]] = new BooleanLike[Option[Any]] {
    def asBoolean(o: Option[Any]) = o.isDefined
  }

  /**
   * Get a hold of the implicit by adding a parameter list
   * or by calling {{implicitly}}
   */
  def asBoolean[A](a: A)(implicit bla: BooleanLike[A]) = bla.asBoolean(a)

  /**
   * Will this suffice for a container M[_], like Option[String]?
   * Maybe you need to take a look at the variance of the BooleanLike trait,
   * and also at the signature of the relevant implicit BooleanLike?
   */
  implicit class AsBoolean[A : BooleanLike](a: A) {
    def boolean: Boolean = implicitly[BooleanLike[A]].asBoolean(a)
  }
}


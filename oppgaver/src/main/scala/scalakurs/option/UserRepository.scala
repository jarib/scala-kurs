package scalakurs.option

sealed trait Gender
case object Female extends Gender
case object Male extends Gender

case class User(id: Int,
                firstName: String,
                lastName: String,
                age: Int,
                gender: Option[Gender],
                spouseId: Option[Int]) {

  def printable = {
    val prefix = (gender, spouseId) match {
      case (Some(Male), _) => "Mr. "
      case (Some(Female), Some(_)) => "Mrs. "
      case (Some(Female), _) => "Ms. "
      case _ => ""
    }

    prefix + s"$firstName $lastName"
  }
}

object UserRepository {

  private lazy val users = Map(
    1 -> User(1, "John",    "Doe",   32, Some(Male),   Some(2)),
    2 -> User(2, "Jane",    "Doe",   30, Some(Female), Some(1)),
    3 -> User(3, "Doni",    "Doe",   15, None,         None),
    4 -> User(4, "Honey",   "Ryder", 27, Some(Female), None)
  )

  def findById(id: Int): Option[User] = users.get(id)

  def findAll: Iterable[User] = users.values

  def findAllWithSpouse: Iterable[User] = users.values.filter(_.spouseId.isDefined)

  def findPairById(id: Int): Option[(User, User)] = for {
    user <- findById(id)
    spouseId <- user.spouseId
    spouse <- findById(spouseId)
  } yield (user, spouse)
}

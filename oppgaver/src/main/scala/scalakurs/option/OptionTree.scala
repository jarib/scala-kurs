package scalakurs.option

import scala.annotation.tailrec

class Tree {
  lazy val rootValue: Option[String] = this match {
    case Leaf(value) => Option(value)
  }
  lazy val mkString: String = ???
  lazy val nrOfEdges: Int = ???
}

case class Node(left: Option[Tree], right: Option[Tree]) extends Tree
case class Leaf(value: String) extends Tree

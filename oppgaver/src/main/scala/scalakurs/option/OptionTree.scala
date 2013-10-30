package scalakurs.option

import scala.annotation.tailrec

class Tree {
  lazy val rootValue: Option[String] = this match {
    case Leaf(value) => Option(value)
  }
  lazy val mkString: String = ???
  lazy val nrOfEdges: Int = {
    @tailrec
    def inner(count: Int, list: List[Tree]): Int = {
//      list.headOption match {
//        case Some(leaf: Leaf) => inner(count, list.tail)
//        case Some(Node(left, right)) => inner(blaaaaaaaah)
//        case _ => count
//      }
    }

    inner(0, this :: Nil)
  }
}

case class Node(left: Option[Tree], right: Option[Tree]) extends Tree
case class Leaf(value: String) extends Tree

package scalakurs.option

import scala.annotation.tailrec

class Tree {
  lazy val rootValue: Option[String] = this match {
    case Leaf(value) => Option(value)
  }

  lazy val mkString: String = {
    @tailrec
    def getValues(str: String, list: List[Tree]): String = list.headOption match {
      case Some(Leaf(value)) => getValues(str + value, list.tail)
      case Some(Node(left, right)) => getValues(str, List(left, right).flatten ++ list.tail)
      case _ => str
    }

    getValues("", List(this))
  }

  lazy val nrOfEdges: Int = {
    @tailrec
    def countEdges(count: Int, list: List[Tree]): Int = list.headOption match {
      case Some(Leaf(value)) => countEdges(count, list.tail)
      case Some(Node(left, right)) => {
        val children = List(left, right).flatten
        countEdges(count + children.size, List(children, list.tail).flatten)
      }
      case _ => count
    }

    countEdges(0, List(this))
  }
}

case class Node(left: Option[Tree], right: Option[Tree]) extends Tree
case class Leaf(value: String) extends Tree

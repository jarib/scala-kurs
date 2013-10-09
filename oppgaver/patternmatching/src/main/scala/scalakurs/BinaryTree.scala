package scalakurs

abstract sealed class Tree
case class Node(value: Int, left: Tree, right: Tree) extends Tree
case object Nil extends Tree

object Tree {
  def contains(t: Tree, v: Int): Boolean = t match {
    case Node(value, left, right) =>
      if (value == v) true
      else contains(left, v) || contains(right, v)
    case Nil => false
  }

  def sumTree(t: Tree): Int = t match {
    case Node(value, left, right) => value + sumTree(left) + sumTree(right)
    case Nil => 0
  }

  def exists(t: Tree, f: Int => Boolean): Boolean = t match {
    case Node(value, left, right) =>
      if (f(value)) true
      else exists(left, f) || exists(right, f)
    case Nil => false
  }
}
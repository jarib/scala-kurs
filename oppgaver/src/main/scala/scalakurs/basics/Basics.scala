package scalakurs.basics

object Basics {
  def sayHello(to: String): String = s"Hello, $to!"

  def shout (u: String): String = u.toUpperCase()

  def add(a: Int, b: Int): Int = a + b

  /* hint: Int.to() kan gi en fin løsning */
  def sumInt(fromInclusive: Int, toInclusive: Int): Int = fromInclusive.to(toInclusive).sum

  def square(x: Int): Int = x * x

  def cube(x: Int): Int = x * x * x

  def squareAndCube(x: Int): (Int, Int) = (square(x), cube(x))

  // use this method in the following implementations
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def sumSquares(x: Int, y: Int): Int = sum(square)(x, y)

  def sumIntNew(x: Int, y: Int)  = {
    /* hint */
    def identity(x: Int): Int = x
    sum(identity)(x, y)
  }
}

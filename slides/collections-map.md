## Map ##

Mangler en slide om Literals

---

```scala
class Map[A, +B] {
  ..
  def isEmpty: Boolean
  def nonEmpty: Boolean

  def size: Int

  def mkString: String
  def mkString(sep: String): String
  def mkString(start: String, sep: String, end: String): String
  ..
}
```
<aside class="notes">
    mye likt som List
</aside>

---

```scala
class Map[A, +B] {
  ..
  def filter(p: ((A, B)) ⇒ Boolean): Map[A, B]
  def filterKeys(p: (A) ⇒ Boolean): Map[A, B]

  def map[B](f: (A) ⇒ B): Map[B]
  def mapValues[C](f: (B) ⇒ C): Map[A, C]

  def partition(p: ((A, B)) ⇒ Boolean): (Map[A, B], Map[A, B])

  def withDefaultValue[B1 >: B](d: B1): Map[A, B1]

  def orElse[A1 <: A, B1 >: B](that: PartialFunction[A1, B1]): PartialFunction[A1, B1]
  ..
}
```

---

# Oppgaver #
collections Map*

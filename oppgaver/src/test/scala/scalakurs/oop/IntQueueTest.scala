package scalakurs.oop

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite

class IntQueueTest extends ShouldMatchers with FunSuite {

  // OddNumberFiltering, Doubling, Incrementing, NegativeNumberFiltering

  test("stackable traits") {
    val queue: IntQueue = new BasicIntQueue with Incrementing with Doubling
    queue.put(-10)
    queue.put(11)
    queue.put(20)

    queue.get() should be(-19)
  }

  test("stackable traits 2") {
    val queue: IntQueue = new BasicIntQueue with Doubling with Incrementing with NegativeNumberFiltering
    queue.put(-10)
    queue.put(11)
    queue.put(20)

    queue.get() should be(24)
  }

  test("stackable traits 3") {
    val queue: IntQueue = new BasicIntQueue with Doubling with Incrementing
    queue.put(-10)
    queue.put(11)
    queue.put(20)

    queue.get() should be(-18)
  }

  test("stackable traits 4") {
    val queue: IntQueue = new BasicIntQueue with Doubling with NegativeNumberFiltering with OddNumberFiltering
    queue.put(-10)
    queue.put(11)
    queue.put(20)

    queue.get() should be(40)
  }

}

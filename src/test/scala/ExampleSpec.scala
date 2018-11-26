import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

import collection.mutable.Stack

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends FlatSpec with Matchers {

  "A Stack" should "pop values in the order of last-in-first-out" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throws NoSuchElementException if an empty stack is poped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop
    }
  }

}

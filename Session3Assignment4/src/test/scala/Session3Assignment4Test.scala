package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class Session3Assignment4Test extends AnyFunSuite {

  val linkedListIntObject = new LinkedList[Int]
  val linkedListStringObject = new LinkedList[String]
  val linkedListLongObject = new LinkedList[Long]

  test("To insert element in integer") {
    linkedListIntObject.insertElementAtBeginning(10)
    linkedListIntObject.insertElementAtBeginning(20)
    linkedListIntObject.insertElementAtEnd(30)
    linkedListIntObject.insertElementAtEnd(40)
    linkedListIntObject.traverse() // 20 -> 10 -> 30 -> 40
    assert(linkedListIntObject.head.next.next.data == 30)
    assert(linkedListIntObject.head.data == 20)
  }
  test("To insert element in string") {
    linkedListStringObject.insertElementAtBeginning("Hello")
    linkedListStringObject.insertElementAtBeginning("World")
    linkedListStringObject.insertElementAtEnd("Happy")
    linkedListStringObject.insertElementAtEnd("Day")
    linkedListStringObject.traverse() // World -> Hello -> Happy -> Day
    assert(linkedListStringObject.head.next.next.data == "Happy")
    assert(linkedListStringObject.head.data == "World")
  }
  test("To insert element in long") {
    linkedListLongObject.insertElementAtBeginning(89997123)
    linkedListLongObject.insertElementAtBeginning(67544649)
    linkedListLongObject.insertElementAtEnd(923457123)
    linkedListLongObject.insertElementAtEnd(578744649)
    linkedListLongObject.traverse() // 67544649 -> 89997123 -> 923457123 -> 578744649
    assert(linkedListLongObject.head.next.next.data == 923457123)
    assert(linkedListLongObject.head.data == 67544649)
  }
  test("To delete an element in integer") {
    linkedListIntObject.insertElementAtBeginning(10)
    linkedListIntObject.insertElementAtBeginning(20)
    linkedListIntObject.delete(10)
    linkedListIntObject.traverse()
    assert(linkedListIntObject.head.data == 20)
  }
  test("To delete an element in string") {
    linkedListStringObject.insertElementAtBeginning("Hello")
    linkedListStringObject.insertElementAtBeginning("World")
    linkedListStringObject.delete("Hello")
    linkedListStringObject.traverse()
    assert(linkedListStringObject.head.data == "World")
  }
  test("To delete an element in long") {
    linkedListLongObject.insertElementAtBeginning(89997123)
    linkedListLongObject.insertElementAtBeginning(67544649)
    linkedListLongObject.delete(89997123)
    linkedListLongObject.traverse()
    assert(linkedListLongObject.head.data == 67544649)
  }
  test("To search an element in integer") {
    assert(linkedListIntObject.search(80) == "Data not found")
    assert(linkedListIntObject.search(30) == "Data Found 30")
  }
  test("To search an element in string") {
    assert(linkedListStringObject.search("Day") == "Data Found Day")
  }
  test("To search an element in long") {
    assert(linkedListLongObject.search(923457123) == "Data Found 923457123")
  }
}

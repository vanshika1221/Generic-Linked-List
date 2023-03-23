package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class Session3Assignment4Test extends AnyFunSuite {

  val linkedListIntObject = new LinkedList[Int]
  val linkedListStringObject = new LinkedList[String]
  val linkedListLongObject = new LinkedList[Long]

  test("To insert element at beginning in integer") {
    linkedListIntObject.insertElementAtBeginning(10)
    linkedListIntObject.insertElementAtBeginning(20)
    linkedListIntObject.traverse()
    assert(linkedListIntObject.head.data == 20)
  }
  test("To insert element at beginning in string") {
    linkedListStringObject.insertElementAtBeginning("Hello")
    linkedListStringObject.insertElementAtBeginning("World")
    linkedListStringObject.traverse()
    assert(linkedListStringObject.head.data == "World")
  }
  test("To insert element at beginning in long") {
    linkedListLongObject.insertElementAtBeginning(89997123)
    linkedListLongObject.insertElementAtBeginning(67544649)
    linkedListLongObject.traverse()
    assert(linkedListLongObject.head.data == 67544649)
  }
  test("To insert element at end in integer") {
    linkedListIntObject.insertElementAtEnd(30)
    linkedListIntObject.insertElementAtEnd(40)
    linkedListIntObject.traverse()
    assert(linkedListIntObject.head.next.next.data == 30)
  }
  test("To insert element at end in string") {
    linkedListStringObject.insertElementAtEnd("Happy")
    linkedListStringObject.insertElementAtEnd("Day")
    linkedListStringObject.traverse()
    assert(linkedListStringObject.head.next.next.data == "Happy")
  }
  test("To insert element at end in long") {
    linkedListLongObject.insertElementAtEnd(923457123)
    linkedListLongObject.insertElementAtEnd(578744649)
    linkedListLongObject.traverse()
    assert(linkedListLongObject.head.next.next.data == 923457123)
  }
  test("To delete an element in integer") {
    linkedListIntObject.delete(10)
    linkedListIntObject.traverse()
    assert(linkedListIntObject.head.data == 20)
  }
  test("To delete an element in string") {
    linkedListStringObject.delete("Hello")
    linkedListStringObject.traverse()
    assert(linkedListStringObject.head.data == "World")
  }
  test("To delete an element in long") {
    linkedListLongObject.delete(89997123)
    linkedListLongObject.traverse()
    assert(linkedListLongObject.head.data == 67544649)
  }
  test("To search an element in integer") {
    assert(linkedListIntObject.search(30).get.data == Some(30))
  }
  test("To search an element in string") {
    assert(linkedListStringObject.search("Day") == "Data Found Day")
  }
  test("To search an element in long") {
    assert(linkedListLongObject.search(923457123) == "Data Found 923457123")
  }
}

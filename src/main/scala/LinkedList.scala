package com.knoldus
import scala.annotation.tailrec

case class Node[T](data: T, var next: Node[T])
class LinkedList[T] {

  var head: Node[T] = null

  //method to insert element at beginning
  def insertElementAtBeginning(elementToInsert: T): Unit = {
    val newNode = new Node[T](elementToInsert, head)
    head = newNode
  }

  //method to insert element at end
  def insertElementAtEnd(elementToInsert: T): Unit = {
    val newNode = new Node[T](elementToInsert, null)

    def insertHelper(currentNode: Node[T]): Unit = {
      if (head == null) {
        head = newNode
      }
      else if (currentNode.next != null) {
        insertHelper(currentNode = currentNode.next)
      }
      else currentNode.next = newNode
    }

    insertHelper(head)
  }

  //method to delete element
  def delete(data: T): Unit = {
    deleteHelper(head, head.next)

    @tailrec
    def deleteHelper(previousNode: Node[T], currentNode: Node[T]): Unit = {
      // To delete the first element
      if (head == null) {
        return
      }
      if (head.data == data) {
        head = head.next
        return
      }
      // To delete elements other than first element
      if (currentNode == null) {
        return
      }
      if (currentNode.data == data) {
        previousNode.next = currentNode.next
      } else {
        deleteHelper(currentNode, currentNode.next)
      }
    }
  }

  //method to traverse linked list
  def traverse(): Unit = {
    @tailrec
    def traverseHelper(currentNode: Node[T]): Unit = {
      if (currentNode != null) {
        //println(currentNode.data)
        traverseHelper(currentNode.next)
      }
    }

    traverseHelper(head)
  }

  //method to search an element
  def search(data: T): String = {
    @tailrec
    def searchHelper(current: Node[T]): String = {
      if (current == null) {
        "Data not found"
      } else if (current.data == data) {
        s"Data Found ${current.data}"
      } else {
        searchHelper(current.next)
      }
    }

    searchHelper(head)
  }
}


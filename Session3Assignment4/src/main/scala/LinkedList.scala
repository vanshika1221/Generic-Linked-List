package com.knoldus

import scala.annotation.tailrec

case class Node[T](data: T, var next: Node[T])
class LinkedList[T] {

    var head: Node[T] =  null

    def insertElementAtBeginning(elementToInsert: T): Unit = {
      val newNode = new Node[T](elementToInsert, head)
      head = newNode
    }

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

    def search(data: T): Option[Node[T]] = {
      @tailrec
      def searchHelper(current: Node[T]): Option[Node[T]] = {
        if (current == null) {
          None
        } else if (current.data == data) {
          println(s"Data Found ${current.data}")
          Some(current)
        } else {
          searchHelper(current.next)
        }
      }
      searchHelper(head)
    }
}
object LinkedList extends App {
  val obj = new LinkedList[Int]
//  obj.insertElementAtEnd(12)
//  obj.insertElementAtEnd(15)
//  obj.insertElementAtEnd(16)
//  obj.insertElementAtEnd(19)
//  obj.insertElementAtBeginning(90)
//  obj.insertElementAtBeginning(80)
//  obj.insertElementAtBeginning(60)
//  println("Before")
//  obj.traverse()
//  obj.delete(90)
//  println("after")
//  obj.traverse()
//  obj.search(16)
}

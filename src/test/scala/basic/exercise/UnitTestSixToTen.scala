package basic.exercise

import org.scalatest.funsuite.AnyFunSuite
import AssignSixToTen.intSquare

class UnitTestSixToTen extends AnyFunSuite{
  val cls = new SixToTen

  // Problem 6 Test Cases
  // Write word count function
  test("Word count Function"){
    val res1 = cls.wordCount("Hello How are You Hello")
    val res2 = cls.wordCount("Hii Hii Hii Hii")
    val res3 = cls.wordCount("")
    val res4 = cls.wordCount(" ")
    assert(res1 === Map( "How" -> 1, "are" -> 1, "You" -> 1, "Hello" -> 2) &&
           res2 === Map("Hii" -> 4) &&
           res3 === Map("" -> 1) &&
           res4 === Map()
    )
  }

  // Problem 7 Test Cases
  // Write implicit class which have square method so I can call on int
  test("implicit class to square of Int i.e 2.Square"){
    val res1 = 2.square
    val res2 = 0.square
    assert(res1 === 4 && res2 ===0)
  }

  //Problem 8 Test Cases
  // write the program that count the number files in directory if directory is valid otherwise return None
  test("Counting No. of files in a directory if directory is valid"){
    //Passing a directory
    val res1 = cls.countFiles("/Users/mohdsabir/STUDY/CERTIFICATES")
    //Passing a file
    val res2 = cls.countFiles("/Users/mohdsabir/STUDY/CERTIFICATES/C++.pdf")
    assert(res1 === Some(9) && res2 === None)
  }

  // Problem 9 Test Cases
  // Remove all keys from Map if their value are odd
  test("Removing all keys from map is its value is odd"){
    val res1 = cls.removeOdd(Map("Dharm"->1,"Adi"->2,"John"->3,"Tyryn"->4))
    // Passing all odd values
    val res2 = cls.removeOdd(Map("Adi" -> 1, "Tyryn" -> 3))
    // Passing all even values
    val res3 = cls.removeOdd(Map("Bob"-> 2, "Adi" -> 2, "Tyryn" -> 4))
    assert(res1 === Map("Adi" -> 2, "Tyryn" -> 4) && res2 === Map() &&
           res3  === Map("Bob"-> 2, "Adi" -> 2, "Tyryn" -> 4)
    )
  }


  // Problem 10 Test Case
  // Remove list of keys from Map
  test("Removinf keys from Map that are present in map"){
    val res1 = cls.removeKeys(List("hello", "world"), Map("world"->2,"hello"->3,"john"->5,"adi"->6))
    val res2 = cls.removeKeys(List("x","y","z"), Map("x" -> 1, "y"->2, "z"->3))
    assert(res1 === Map("john" -> 5, "adi" -> 6) && res2 === Map())
  }

}

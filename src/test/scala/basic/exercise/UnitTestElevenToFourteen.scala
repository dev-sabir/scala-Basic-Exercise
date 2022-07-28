package basic.exercise

import org.scalatest.funsuite.AnyFunSuite

class UnitTestElevenToFourteen extends AnyFunSuite{
    val cls = new ElevenToFourteen

    // Problem 11 Test Cases
    // Concatenate two list
    test("Concatenating Two List"){
      val res1 = cls.concat(List(1,2,3,41), List(5,62))
      val res2 = cls.concat(List(1,2,3), List())
      val res3 = cls.concat(List(), List())
      assert(res1 === List(1,2,3,41,5,62) && res2 === List(1,2,3) && res3 === List())
    }

    // Problem 12 Test Case
    // Concatenate two Maps(if key are same just add their value ):
    test("Concatenating two Maps and if key are same then adding their value )"){

      val res1 = cls.concatenate(Map("hello" -> 1 , "hi" -> 2), Map("hi" -> 2, "you" -> 1))
      val res2 = cls.concatenate(Map("hello" -> 1 , "hi" -> 2), Map("hi" -> 2, "hello" -> 1))
      assert(res1 === Map("hello" -> 1, "hi" -> 4, "you" -> 1) &&
              res2 === Map("hello" -> 2, "hi" -> 4)
            )
    }

    // Problem 13 Test Cases
    // Zip two list into one list without using list zip method
    test("Zipping two list without using zip"){
      val res1 = cls.zip(List(1,2,3), List("one", "two", "three"))
      val res2 = cls.zip(List(1,2,3,4,5), List("one", "two", "three"))
      val res3 = cls.zip(List(1,2,3), List("one", "two", "three", "four", "five"))
      assert(res1 === List((1,"one"), (2,"two"), (3, "three")) &&
             res2 ==  List((1,"one"), (2,"two"), (3, "three")) &&
             res2 ==  List((1,"one"), (2,"two"), (3, "three"))
            )
    }

    // Problem 14 Test Cases
    // Merge two sorted list into one sorted list:
    test("Merging two sorted list one"){
      val res1 = cls.merge(List(1,3,5), List(2,4,6))
      val res2 = cls.merge(List(1,10,15,18), List(5,13))
      val res3 = cls.merge(List(), List(10,15,22,16))
      assert(res1 === List(1,2,3,4,5,6) &&
             res2 === List(1,5,10,13,15,18) &&
             res3 === List(10, 15, 22,16)
            )
    }
}

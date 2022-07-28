package basic.exercise

import org.scalatest.funsuite.AnyFunSuite

class UnitTestFirstFive extends AnyFunSuite{

  // Problem 1 Test Case
  // Test Case For implementation of Show Function

  val cls = new FirstFive
  test("Implementation of Show Function"){

    val res1 = cls.show(3,4)
    assert(res1 === List(1,1,1,2,2,2,3,3,3,4,4,4))
  }


  // Problem 2 Test Case
  // Test Case for Reverse the List using FoldLeft/Recursion

  test("Reverse of List"){
    val res1 = cls.reverse(List(1,2,3,4))
    val res2 = cls.reverse(List())
    val res3 = cls.reverse(List(1))
    assert(res1 === List(4,3,2,1) && res2 == List() && res3 == List(1))
  }

  // Problem 2.1 Test Case
  // Test Case For Rotation of Array

  test("Rotation of Array"){
    val res1 = cls.rotate(Array(1,2,3,4), 2)
    val res2 = cls.rotate(Array(1,2,3,4), 0)
    val res3 = cls.rotate(Array(1,2,3,4), 3)
    val res4 = cls.rotate(Array(1,2,3,4),4)

    val res5  = cls.rotate(Array(1,2,3,4), 5)


    assert(res1 === Array(3,4,1,2) && res2 === Array(1,2,3,4) && res3 === Array(4,1,2,3) && res4 === Array(1,2,3,4) && res5 === Array(2,3,4,1))

  }

  // Problem 3 Test Case
  // Sum of 2 Option Value
  test("Sum of Two option value"){
    val res1 = cls.sum(Some(5), Some(10))
    val res2 = cls.sum(Some(0), Some(0))
    assert(res1 === Some(15) && res2 === Some(0))
  }

  // Problem 4 Test Case
  // Implementation of fill function
  test("Implementation of Fill Function"){
    val res1 = cls.fill(5)(3)
    val res2 = cls.fill(5)(0)
    assert(res1 === List(5,5,5) && res2 === List())
  }

  // Problem 5 Test Case
  // Remove duplicate value from list
  test("Remove duplicate from list"){
    val res1 = cls.dedupe(List(20,22,23,22,10))
    val res2 = cls.dedupe(List(20,20,20,20,20,20))
    val res3 = cls.dedupe(List())
    assert(res1 === List(20,22,23,10) && res2 === List(20) && res3 === List())
  }


}

package basic.exercise

import scala.annotation.tailrec

class FirstFive {

  //  1.Implementation of Show function
  def show(f: Int, n: Int): List[Int] = {
    val count = n
    @tailrec
    def helper(n: Int, list: List[Int]): List[Int] = {
      if (n > count) {
        list
      } else {
        helper(n + 1, list ++ List.fill(f)(n))
      }
    }
    //Calling the helper function
    helper(1, List())
  }


  //  2.Reversing a list
  def reverse(list: List[Int]): List[Int] = {
    list.foldLeft(List[Int]()) { (acc, elem) => elem +: acc
    }

  }

  //  2.1Rotation of An Array
  def rotate(array: Array[Int], r: Int): Array[Int] ={
      val ar = r%array.length  //If rotation size is greater than Array Size
      array.drop(ar) ++ array.take(ar)
  }

  //  3.Sum of two option Value
  def sum(opt1: Option[Int], opt2: Option[Int]): Option[Int] ={
    Some(opt1.get + opt2.get)
  }


  //Implementation of Fill with match
//  def fill(element: Int)(noOfTimes: Int): List[Int] ={
//    @tailrec
//    def helper(noOfTimes: Int, list:List[Int]): List[Int] = {
//      noOfTimes match{
//        case 0 => list
//        case _ => helper(noOfTimes - 1, list :+ element)
//      }
//    }
//    helper(noOfTimes, List())
//  }

  //  4.Implementation of Fill Function using if else
  def fill(element: Int)(noOfTimes: Int): List[Int] ={
    @tailrec
    def helper(noOfTimes: Int, list:List[Int]): List[Int] = {
      if(noOfTimes <= 0){
        list
      }else{
        helper(noOfTimes-1,list :+ element)
      }
    }
    helper(noOfTimes, List())
  }


  //5. Remove Duplicate from List
  def dedupe(list: List[Int]): List[Int] = {
    list.foldLeft(List[Int]()){(acc,elem) => {
      if(!acc.contains(elem)) acc :+ elem else acc
    }}
  }

}

object Assign{
  def main(args: Array[String]): Unit ={

    val x = new FirstFive
    println(x.show(3,4))
    println(x.reverse(List(1,2,3,4,5)))
    println(x.rotate(Array(1,2,3,4), 2))   //Output will be something like that [I@3a03464 because we are printing array
    println(x.sum(Some(3), Some(4)))
    println(x.fill(3)(5))
    println(x.dedupe(List(14, 16,14,10,15, 15,10)))
  }
}

package basic.exercise

import org.scalatest.funsuite.AnyFunSuite

class UnitTestSixteen extends AnyFunSuite{

  val student1 = Student(1,"Bob", 22, "CS")
  val student2 = Student(2,"Ram", 21, "IT")
  val student3 = Student(3,"Tom", 24, "EC")
  val student4 = Student(4,"David", 19, "ME")
  val student5 = Student(5,"Chris", 18, "CS")
  val student6 = Student(6,"Shaw", 22, "IT")
  val student7 = Student(7,"Alex", 22, "EC")
  val student8 = Student(8,"Smith", 20, "ME")
  val student9 = Student(9,"Miller", 23, "CS")
  // Problem 16 Test Cases
  test("Splitting Student in different list according to branches"){
    val cls = new SplitBy
    val res1 = cls.splitByBranch(List(student1, student2, student3, student4, student5, student6,student7, student8, student9))
    val excp = (List(Student(1,"Bob",22,"CS"), Student(5,"Chris",18,"CS"), Student(9,"Miller",23,"CS")),List(Student(2,"Ram",21,"IT"), Student(6,"Shaw",22,"IT")),List(Student(3,"Tom",24,"EC"), Student(7,"Alex",22,"EC")),List(Student(4,"David",19,"ME"), Student(8,"Smith",20,"ME")))
    assert(res1 === excp)
  }

}

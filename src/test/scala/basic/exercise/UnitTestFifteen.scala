package basic.exercise

import org.scalatest.funsuite.AnyFunSuite

class UnitTestFifteen extends AnyFunSuite {

  // Problem 15 Test Cases
  val sal1 = Salary(100, 200.00, 100.0)
  val sal2 = Salary(300,50.00, 100.0)
  val emp1 = Employee(20,"Sabir", sal1,44)
  val emp2 = Employee(21,"Bob",sal2, 57)

  test("Increase 10 % basic, Increase 20% hra if age greater than 50"){
    val cls =  new Cal
    val res1 = cls.appraisal(List(emp1, emp2))
    assert(res1 === List(Employee(20,"Sabir",Salary(110.0,200.0,100.0),44), Employee(21,"Bob",Salary(330.0,60.0,100.0),57))
    )
  }

}

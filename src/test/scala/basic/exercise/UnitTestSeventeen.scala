package basic.exercise

import org.scalatest.funsuite.AnyFunSuite

class UnitTestSeventeen extends AnyFunSuite{

  // Problem 17 Test case
  val customer1 = Customer(2)
  val customer2 = Customer(2)
  val customer3 = Customer(1)

  val consultant1 = Consultant(List(customer1,customer2, customer3))
  val consultant2 = Consultant(List(customer1,customer2,customer3))
  val consultant3 = Consultant(List(customer1,customer2,customer3))
  val consultant4 = Consultant(List(customer1,customer2,customer3))
  val consultant5 = Consultant(List(customer1,customer2,customer3))
  val consultant6 = Consultant(List(customer1,customer2,customer3))
  val consultant7 = Consultant(List(customer1,customer2,customer3))
  val consultant8 = Consultant(List(customer1,customer2,customer3))
  val consultant9 = Consultant(List(customer1,customer2,customer3))
  val consultant10 = Consultant(List(customer1,customer2,customer3))
  val consultant11 = Consultant(List(customer1,customer2,customer3))
  val consultant12 = Consultant(List(customer1,customer2,customer3))

  val branch1 = Branch(List(consultant1, consultant2, consultant3,consultant4))
  val branch2 = Branch(List(consultant5, consultant6, consultant7, consultant8))
  val branch3 = Branch(List(consultant9, consultant10, consultant11, consultant12))

  val company = Company(List(branch1, branch2, branch3))

  test("Value of the company"){
    val cls = new Eval
    val res1 = cls.getCompanyValue(company)
    assert(res1 === 60)
  }

}

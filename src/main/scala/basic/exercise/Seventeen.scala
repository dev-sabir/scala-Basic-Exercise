package basic.exercise

case class Customer(value: Int)
case class Consultant(portfolio: List[Customer])
case class Branch(consultants: List[Consultant])
case class Company(branches: List[Branch])

class Eval {
    def getCompanyValue(company: Company): Int = {
      val noOfBranches = company.branches.size
      val branches = company.branches
////      println(branches)
//      var tCust = 0
//      var compVal=0
//      val noOfConsultants = branches.foldLeft(0){(acc, elem)=> {
////        println(elem.consultants)
//        tCust += elem.consultants.foldLeft(0){(cons, e) => {
////          println(e.portfolio.size)
//          compVal += e.portfolio.foldLeft(0){(cValue, cPoint) => {
//            cValue + cPoint.value
//          }
//          }
//          cons + e.portfolio.size
//        }}
//        acc + elem.consultants.size
//
//      }}
      //  println(tCust)
     //   println(noOfConsultants)
      //   println(compVal)
      //compVal


      //  AFTER REMOVING var
      val totalCompVal = branches.foldLeft(0){(acc, elem) => {
      acc + elem.consultants.foldLeft(0){(cons, e) => {
        cons + e.portfolio.foldLeft(0){(cValue, cPoint) => {
          cValue+cPoint.value
        }}
      }}
     }}
    totalCompVal
    }
}

object Seventeen{

  def main(args: Array[String]): Unit ={
    val customer1 = Customer(2)
    val customer2 = Customer(1)
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

    val eval = new Eval
    println(eval.getCompanyValue(company))

  }

}


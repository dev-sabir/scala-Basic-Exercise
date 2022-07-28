package basic.exercise
//15.

case class Salary(basic: Double, hra: Double, ta: Double)
case class Employee(id:Int, email: String, salary:Salary, age:Int)

class Cal{

    def appraisal(emps: List[Employee]) : List[Employee] = {
        val res: List[Employee] = List()
        emps.foldLeft(res){ (acc, emp) => {
          if(emp.age > 55){
            val hra = emp.salary.hra + (emp.salary.hra * 20)/100
            val basic = emp.salary.basic + (emp.salary.basic * 10)/100
            val newSal = emp.salary.copy(basic, hra, emp.salary.ta)
            acc :+ emp.copy(emp.id, emp.email, newSal, emp.age)
          }else{
            val basic = emp.salary.basic + (emp.salary.basic * 10)/100
            val newSal = emp.salary.copy(basic, emp.salary.hra, emp.salary.ta)
            acc :+ emp.copy(emp.id, emp.email, newSal, emp.age)
          }
        }
        }
    }
}


object Fifteen{

  def main(args: Array[String]): Unit ={
    val sal1 = Salary(100, 200.00, 100.0)
    val sal2 = Salary(300,50.00, 100.0)
    val emp1 = Employee(20,"Sabir", sal1,44)
    val emp2 = Employee(21,"Bob",sal2, 57)

    val cls = new Cal
    println(cls.appraisal(List(emp1, emp2)))
  }
}

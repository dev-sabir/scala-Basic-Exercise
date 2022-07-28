package basic.exercise

//16. Engineering Colleges have four branches CS,IT,EC,ME. Spilt student list into four list as CS, IT,EC,ME. Student represented by :
case class Student(id: Int, name: String, age: Int, branch: String)
class SplitBy {

  def splitByBranch(list: List[Student]): (List[Student], List[Student], List[Student], List[Student]) ={
    var l1:List[Student] =List()
    var l2:List[Student] = List()
    var l3: List[Student] = List()
    var l4: List[Student] = List()

    for(student <- list) {
      student.branch match {
        case "CS" =>
          l1 = l1 :+ student
        case "IT" =>
          l2 = l2 :+ student
        case "EC" =>
          l3 = l3 :+ student
        case "ME" =>
          l4 = l4 :+ student
      }
    }
    (l1,l2,l3,l4)
  }
}

object Sixteen {
  def main(args: Array[String]): Unit ={
    val student1 = Student(1,"Bob", 24, "CS")
    val student2 = Student(2,"Alex", 22, "IT")
    val student3 = Student(3,"David", 23, "EC")
    val student4 = Student(4,"Marsh", 22, "ME")
    val student5 = Student(5,"Cena", 22, "CS")
    val student6 = Student(6,"Naren", 19, "IT")
    val student7 = Student(7,"Cheats", 18, "EC")
    val student8 = Student(8,"Ankit", 20, "ME")
    val student9 = Student(9,"Tom", 20, "CS")
    val student10 = Student(10,"Spider Man", 20, "IT")

    val students = new SplitBy
    val studentList = List(student1, student2, student3, student4, student5, student6, student7, student8)
    println(students.splitByBranch(studentList))
  }


}

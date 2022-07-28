package basic.exercise


class SixToTen {

  //6.Write word count
  def wordCount(str: String): Map[String,Int] = {
    val wordList = str.split(" ")
    val res = wordList.groupBy(word => word)
    res.map(a => a._1 -> a._2.length)
  }


  //8. write the program that count the number files in directory if directory is valid otherwise return None
  def countFiles(dir: String): Option[Int] = {
      try{
        val x = new java.io.File(dir)
        Some(x.listFiles().size)
      }catch {
        case _ =>
          None
      }
}


  // 9. Remove all keys from Map if their value are odd
  def removeOdd(map: Map[String, Int]) : Map[String, Int] ={
    var res:Map[String, Int] = map
    for((key, value) <- map){
      if(value%2 != 0){
        res = res.-(key)
      }
    }
    res
  }

  // 10. Remove list of keys from Map(just like Map’s “ --” function )

  def removeKeys(keys: List[String], map: Map[String, Int]) : Map[String, Int] ={
    keys.foldLeft(map){(acc, elem) => {
      acc.-(elem)
    }}
  }
}

object AssignSixToTen{

  // 7. write implicit class which have square method so I can call on int
  implicit class intSquare(n:Int) {
    def square(): Int = n * n
  }

  def main(args: Array[String]): Unit ={
    val x = new SixToTen
    println(2.square)

    val str : String = "hello how are you hello you"
    println(x.wordCount(str))

    println(x.removeOdd(Map("Dharm"->1,"Adi"->2,"John"->3,"Tyryn"->4)))

    println(x.removeKeys(List("hello", "world"), Map("world"->2,"hello"->3,"john"->5,"adi"->6)))

    println(x.countFiles("/Users/mohdsabir/STUDY/CERTIFICATES/"))

    }
  }


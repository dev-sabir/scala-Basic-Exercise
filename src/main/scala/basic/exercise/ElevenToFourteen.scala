package basic.exercise

class ElevenToFourteen {
    // 11. Concatenate two list(hint- foldLeft of recursion):

    def concat(list1: List[Int], list2: List[Int]): List[Int] ={
      list2.foldLeft(list1){(list, elem) => list :+ elem}
    }

    // 12.  Concatenate two Maps(if key are same just add their value ):
    def concatenate(map1: Map[String, Int],map2: Map[String, Int]): Map[String, Int] = {
      map2.foldLeft(map1){(map, kv) => {
        if(map.contains(kv._1)){
          map + (kv._1 -> (kv._2 + map(kv._1)))
        }else{
          map + kv
        }
      }}
    }

    //13. zip two list into one list without using list zip method

    def zip(list1: List[Int], list2: List[String]): List[(Int, String)] ={
  //    var res: List[(Int,String)] = Nil
//      if(list1.size <= list2.size){
//        list1.foldLeft(list2){(acc, elem) => {
//          res = res :+ (elem, acc.head)
//          acc.tail
//        }}
//      }else{
//        list2.foldLeft(list1){(acc, elem) => {
//          res = res :+ (acc.head, elem)
//          acc.tail
//        }}
//      }

      // AFTER REMOVING var
      val starter: List[(Int,String)] = Nil
      if(list1.size <= list2.size){
        val l = List.range(0,list1.size)
        l.foldLeft(starter){(acc, elem) => {
          acc :+ (list1(elem), list2(elem))
        }}
      }else{
        val l = List.range(0, list2.size)
        l.foldLeft(starter){(acc, elem) => {
          acc :+ (list1(elem), list2(elem))
        }}
      }
    }

  //14. Merge two sorted list into one sorted list:

  def merge(list1: List[Int], list2: List[Int]): List[Int] = {
        if(list1.isEmpty){
          list2
        }else if(list2.isEmpty) {
          list1
        } else if(list1.head <= list2.head){
          list1.head +: merge(list1.tail, list2)
        }else{
          list2.head +: merge(list1, list2.tail)
        }

  }
}

object Assign11to14{

  def main(args: Array[String]): Unit ={
    val cls = new ElevenToFourteen
    println(cls.concat(List(1,2,3,41), List(5,62)))
    val map1= Map("hello" -> 1 , "hi" -> 2)
    val map2 = Map("hi" -> 2, "you" -> 1)
    println(cls.concatenate(map1, map2))

    println(cls.zip(List(1,2,3,4,5,6), List("one", "two", "three", "four", "five")))
    val list1 = List(1,3,5)
    val list2 = List(2,4,6, 10 )
    println(cls.merge(list1, list2))
  }
}

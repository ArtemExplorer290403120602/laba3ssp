object ReverseList {
  def reverseList[T](list: List[T]): List[T] = {
    if (list.isEmpty) Nil
    else reverseList(list.tail) ::: List(list.head)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(reverseList(list)) // Вывод: List(5, 4, 3, 2, 1)
  }
}

//Реверсивный список
object SecondSmallest {
  def secondSmallest[T](list: List[T])(implicit ordering: Ordering[T]): Option[T] = {
    if (list.distinct.size < 2) None
    else {
      val sorted = list.distinct.sorted
      Some(sorted(1))
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(5, 1, 2, 3, 1)
    println(secondSmallest(list)) // Вывод: Some(2)
  }
}

//Второй элемент по малости:
object CountOccurrences {
  def countOccurrences[T](list: List[T], element: T): Int = list.count(_ == element)

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 1, 2, 1)
    println(countOccurrences(list, 1)) // Вывод: 3
  }
}

//Число вхождений элемента

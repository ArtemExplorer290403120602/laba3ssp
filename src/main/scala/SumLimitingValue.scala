object SumLimitingValue {
  def sumLimited(list: List[Int], limit: Int): Int = list.filter(_ <= limit).sum

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(sumLimited(list, 3)) // Вывод: 6 (1 + 2 + 3)
  }
}

//Сумма элементов, не превосходящих заданное значение:

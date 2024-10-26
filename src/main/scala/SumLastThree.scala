object SumLastThree {
  def sumLastThree(list: List[Int]): Int = {
    if (list.size < 3) throw new IllegalArgumentException("Список должен содержать более трех элементов.")
    list.takeRight(3).sum
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(sumLastThree(list)) // Вывод: 12 (3 + 4 + 5)
  }
}

//Сумма последних трех элементов:
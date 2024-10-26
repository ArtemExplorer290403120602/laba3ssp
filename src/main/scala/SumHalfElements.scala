object SumHalfElements {
  def sumHalf(list: List[Int]): Int = {
    val halfIndex = list.size / 2
    list.take(halfIndex).sum
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    println(sumHalf(list)) // Вывод: 6 (1 + 2 + 3)
  }
}

//Сумма половины элементов списка (четное число элементов):
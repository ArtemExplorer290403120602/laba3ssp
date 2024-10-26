object RemoveDuplicates {
  def removeDuplicates[T](list: List[T]): List[T] = list.distinct

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 1, 2, 1)
    println(removeDuplicates(list)) // Вывод: List(1, 2, 3)
  }
}
//Удаление всех повторяющихся элементов:
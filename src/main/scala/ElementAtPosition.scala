object ElementAtPosition {
  def elementAt[T](list: List[T], position: Int): Option[T] = {
    if (position < 0 || position >= list.size) None
    else Some(list(position))
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(elementAt(list, 2)) // Вывод: Some(3)
  }
}
//Элемент на указанной позиции:
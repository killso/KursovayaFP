sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]
/** Напишите свои решения в виде функций. */
object RecursiveData {
  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.
  def ListIntEmpty(list: List[Int]) : Boolean = list match {
    case x :: tail=> false
    case Nil => true
  }
  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = a(list)
  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.
  def ListIntHead(list: List[Int]) : Int = list match {
    case x :: tail   => x
    case Nil         => -1
  }
  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = b(list)
  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
    //Да, можно, если в наш класс Nil добавить head
  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
     *      node - левое и правое дерево (Tree)
     *      leaf - переменная типа A
     */
  class Tree[A](LeftNode: Tree[A], RightNode: Tree[A], leaf: A)
}
}

/**
 * This implementation is not beginner friendly, and using a very new feature in Scala 2.10
 * This solution is heavily using pattern matching to show off it's capabilities, 
 * more about pattern matching: http://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html#case
 * other solutions are possible and even may look simpler and shorter.
 * Run: "scala spirlMatrix.scala"
 * Note: This is a Scala Script, and at least Scala 2.10 is required.
 */
def printSpiral: PartialFunction[Seq[Seq[Any]], Unit] = {
  case head :: tail =>
    head.foreach(println)
    tail.foreach(l => println(l.last))
    tail match {
      case tInit :+ tLast =>
        tLast.init.reverse.foreach(println)
        tInit.reverse.foreach(l => println(l.head))
        printSpiral(tInit.map{
          case _ :: (trimmedRow :+ _) => trimmedRow
          case _ => Nil
        }.filter(_ != Nil))
      case _ =>
    }
  case _ =>
}

printSpiral(List(List(1,2,3), List(4,5,6), List(7,8,9)))
println
printSpiral(List(List(1,2,3,4), List(5,6,7,8), List(9,10,11,12), List(13,14,15,16)))


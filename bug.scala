```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft, attempting to accumulate a String
  val result = list.foldLeft(0)((acc, x) => acc + x.toString) 

  println(result) // Output: 12345 (not the sum)
}
```
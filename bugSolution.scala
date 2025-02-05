```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct way to sum integers using foldLeft
  val sum = list.foldLeft(0)((acc, x) => acc + x)
  println(s"Sum: $sum") // Output: Sum: 15

  // Correct way to concatenate strings using foldLeft
  val concatenatedString = list.foldLeft("")((acc, x) => acc + x.toString)
  println(s"Concatenated String: $concatenatedString") // Output: Concatenated String: 12345
}
```
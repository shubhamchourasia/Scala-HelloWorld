import scala.io.StdIn.readLine

object Project_2_Multiple_UDFs {

  def take_input(): Int ={
    return readLine("Enter a number: ").toInt
  }

  def calc_factorial(num: Int):Int = {
    var factorial = 1
    for(i <- 1 to num){
      factorial *= i
    }
    return factorial
  }

  def show_results(num: Int, factorial: Int): Unit = {
    println("The factorial of " + num + " is " + factorial)
  }

  def main(args: Array[String]): Unit={
    // Multiple UDFs to take input, calculate Factorial, Show results
    var num = take_input()
    var factorial = calc_factorial(num)
    show_results(num, factorial)
  }
}

import scala.io.StdIn.readLine
object Quiz_4_Taking_Input_From_User {
  def main(args: Array[String]): Unit={

    // Take input from user - using readLine() method
    // readLine() returns string value

    var num1 = readLine("Enter the value for num1: ")
    var num2 = readLine("Enter the value for num2: ")

    var sum = num1.toInt + num2.toInt
    var product = num1.toInt * num2.toInt

    println("The sum of " + num1 + " and " + num2 + " is " + sum)
    println("The product of " + num1 + " and " + num2 + " is " + product)

  }

}

import scala.io.StdIn.readLine

object Quiz_7_Loops {
  def main(args: Array[String]):Unit = {

    /* Various types of loops in Scala:
      1. While loop
      2. Do-while loop
      3. For loop
     */

    //While Loop example

    var marks = -1

    while(marks < 0 || marks > 100){
      marks = readLine("Please enter your marks [between 0 - 100]: ").toInt
    }
    if(marks > 90){
      println("Your garde is A!")
    }else if(marks > 80){
      println("Your garde is B!")
    }else if(marks > 70){
      println("Your garde is C!")
    }else if(marks > 60){
      println("Your garde is D!")
    }else if(marks > 50){
      println("Your garde is E!")
    }else{
      println("You are Fail!!")
    }

    // do-while loop example
    var x = ""
    do{
      x = readLine("Enter Yes to continue: ")
    }while(x != "Yes")

    println("Well, now you know how do-while works!")

    /*
      For loop Example
      Factorial of a Number
     */

    var num = readLine("Please enter a number to find its factorial: ").toInt
    var factorial = 1

    var y = num

    for(i <- 1 to y){
      factorial *= y
      y -= 1
    }
    println("Factorial of " + num + " is " + factorial)
  }
}

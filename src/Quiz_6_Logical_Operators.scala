import scala.io.StdIn.readLine

object Quiz_6_Logical_Operators {
  def main(args: Array[String]):Unit = {

    // Logical Operator
    // && : AND
    // || : OR
    // ! : NOT/NEGATION

    var age = readLine("Please enter your age: ")
    var height = readLine("Please enter your height(in ft) : ")

    if(age.toInt >= 13 && height.toInt >= 5){
      println("Welcome to the Playground!")
    }else{
      println("You're NOT eligible to enter the playground!")
    }

    if(age.toInt >= 13 || height.toInt >= 5){
      println("Welcome to the Playground Phase II!")
    }else{
      println("You're NOT eligible to enter the playground Phase II!")
    }

    if(!(age.toInt < 18)){
      println("Welcome to ADULT league!")
    }
  }
}

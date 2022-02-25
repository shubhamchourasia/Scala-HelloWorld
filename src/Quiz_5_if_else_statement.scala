import scala.io.StdIn.readLine

object Quiz_5_if_else_statement {
  def main (args: Array[String]): Unit ={

    // if-else statement
    var age = readLine("Enter age to proceed to playground: ")

    if(age.toInt >= 13){
      println("Yor're allowed to Enter!!!")
    }else{
      println("You're NOT allowed to Enter!!!")
    }
  }

}

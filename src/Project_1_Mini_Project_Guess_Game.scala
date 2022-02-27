import scala.io.StdIn.readLine
import scala.util.Random
import scala.util.control.Breaks.break

object Project_1_Mini_Project_Guess_Game {
  def main(args:Array[String]):Unit ={

    /*
      Mini Project : Fortune - Guess Number in 5 turns
      Concepts Used:
      1. Taking input from user.
      2. Type casting.
      3. if-else block
      4. loop concept
      5. == operator
      6. Random number
      7. Break statement
       */

    println("Welcome to Guess Game!!!")
    println("Rules: ")
    println("Guess a number between 1 - 100.")
    println("You have 5 chances.\n\n")

    var chances = 5
    var guess = 0

    var magicNumToGuess = new Random()
    val magicNum = magicNumToGuess.nextInt {
      (100 - 1) + 1
    }

    while(true){
      if(chances == 0){
        println("Game Over!! You have used all your chances!")
        println("Magic Number was " + magicNum)
        break
      }
      guess = readLine("Guess the number: ").toInt

      if(guess < magicNum){
        println("Your guess is less than actual number.")
        println("You have " + (chances - 1) + " chances left.\n")
      }else if(guess > magicNum){
        println("Your guess is more than actual number.")
        println("You have " + (chances - 1) + " chances left.\n")
      }else if(guess == magicNum){
        println("Congratulations!! You guessed the Magic Number!")
        println("You took " + (5 - chances) + " chances.")
        break
      }
      chances -= 1
    }
  }
}

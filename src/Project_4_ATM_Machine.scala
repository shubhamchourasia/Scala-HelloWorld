import scala.io.StdIn.readLine

object Project_4_ATM_Machine {
  def main(args:Array[String]):Unit= {
    /*
      Create an ATM machine using Scala
      Features:
        1. Authentication using card number and pin.
        2. Check Balance
        3. Withdraw Balance
        4. Deposit Amount
        5. Exit the program
     */
    println("Welcome to ATM")

    var cardNum = "12345"
    var cardPin = "0000"
    var balance = 5000
    var chance = 1


    while (true) {
      var cardNumInput = readLine("Enter card number: ")
      var cardPinInput = readLine("Enter card PIN: ")

      if (cardNum == cardNumInput && cardPinInput == cardPin) {
        while(true){
          println("Please select an option to continue: ")
          println("1. Check Balance")
          println("2. Withdraw Balance")
          println("3. Deposit Amount")
          println("4. Exit")

          var option = readLine()

          if(option.toInt == 1) {
            println("Your Account Balance is : " + balance)
          }
          if(option.toInt == 2) {
            var withdrawAmount = readLine("Please enter withdraw amount: ")
            if(withdrawAmount.toInt <= balance){
              balance -= withdrawAmount.toInt
              println("Please collect your cash!")
            }else{
              println("Your account balance is less than input amount. Please retry!!")
            }
          }
          if(option.toInt == 3) {
            var depositAmount = readLine("Please enter deposit amount: ")
              balance += depositAmount.toInt
              println("Amount has been deposited!")
          }
          if(option.toInt == 4) {
            println("Thank you using ATM!!")
            System.exit(0)
          }
        }

      } else {
        chance += 1
        if(chance > 3) {
          println("3 Wrong Attempts!! Account is Blocked! Please contact Bank!!")
          System.exit(0)
        }else{
          println("Wrong Card Number or PIN. Try Again!!!")
          println((4 - chance) + " more try left!")
        }
      }
    }

  }
}

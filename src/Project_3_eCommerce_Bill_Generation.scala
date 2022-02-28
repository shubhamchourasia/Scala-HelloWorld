import scala.io.StdIn.readLine

object Project_3_eCommerce_Bill_Generation {

  def getBillAmountFromUser():Int = {
    var x = readLine("Enter the bill Amount: $")
    var billAmount = x.toInt
    return billAmount
  }

  def getDiscountAmount(discountAmount: Int = 10):Int = {
    return discountAmount
  }

  def getDiscountedBillAmount(billAmount: Int, discountAmount: Int): Int = {
    return billAmount - discountAmount
  }

  def printBill(discountedAmount: Int, billAmount: Int): Unit = {
    println("Your Total Bill Amount : $" + billAmount)
    println("Total Bill after Discount : $" + discountedAmount)
  }

  def main(args: Array[String]): Unit={

    var billAmount = getBillAmountFromUser()
    var discountAmount = readLine("Enter discount amount: $").toInt

    if(discountAmount == 0) {
      discountAmount = getDiscountAmount(): Int
    }

    var discountedAmount = getDiscountedBillAmount(billAmount, discountAmount)

    printBill(discountedAmount, billAmount)
  }

}

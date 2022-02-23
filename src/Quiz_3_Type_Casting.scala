object Quiz_3_Type_Casting {
  def main(args: Array[String]): Unit={

   /*Type Casting in Scala
      Method 1 : Use <variable>.getClass.getName - To get the data type of a variable.
      Method 2: Use asInstanceOf[<data_type>] - To convert one data type to another.
      Method 3: Use toInt() - To convert String data type to Int data type
      */

    //Method 1 Example
    var string_var = "This is String"
    var int_var = 5
    var float_var = 9.0F

    println("\nMethod 1 Example : ")

    println("Data type of " + string_var + " is : " + string_var.getClass.getName)
    println("Data type of " + int_var + " is : " + int_var.getClass.getName)
    println("Data type of " + float_var + " is : " + float_var.getClass.getName)

    //Method 2 Example
    var i1 = 12
    var i2 = 4.0F

    println("\nMethod 2 Example : ")

    println("Data type of " + i1 + " is : " + i1.getClass.getName)
    println("Data type of " + i2 + " is : " + i2.getClass.getName)

    var i3 = i1.asInstanceOf[Float]
    var i4 = i2.asInstanceOf[Int]

    println("Data type of " + i3 + " is : " + i3.getClass.getName)
    println("Data type of " + i4 + " is : " + i4.getClass.getName)


    //Method 3 Example
    var string_var_2 = "123"
    var int_var_converted = string_var_2.toInt

    println("\nMethod 3 Example : ")
    println("Data type of " + int_var_converted + " is : " + int_var_converted.getClass.getName)

  }
}

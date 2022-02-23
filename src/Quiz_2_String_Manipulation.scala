object Quiz_2_String_Manipulation {
  def main(args: Array[String]) : Unit={
    var string_val_1 : String = "Tom"
    var string_val_2 : String = "Jerry"

    var len_of_string_1 : Int = string_val_1.length()
    var len_of_string_2 : Int = string_val_2.length()

    println("The total length of both strings combined is " + (len_of_string_1 + len_of_string_2))

  }

}

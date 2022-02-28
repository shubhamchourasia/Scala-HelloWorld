import scala.io.StdIn.readLine

object Quiz_8_UDFs {
  def main(args: Array[String]): Unit={

    // User Defined Function
    // String Concatenation Function
    var str1 = readLine("Enter String 1: ")
    var str2 = readLine("Enter String 1: ")

    var concat_str = stringConcat(str1, str2)

    println("Concat of Both Strings : " + concat_str)

  }
  def stringConcat(str1 : String, str2: String): String={
    return str1+str2
  }
}

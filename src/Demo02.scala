/**
  * Created by Workstation on 20/02/16.
  */
object Demo02 {
  def main(args: Array[String]){
    println(factorial(3))
  }

  def factorial (x: BigInt) : BigInt = {
    if (x == 0) 1 else x * factorial(x -1)
  }
}

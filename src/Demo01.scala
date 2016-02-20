/**
  * Created by Workstation on 20/02/16.
  */
object Demo01 {
  def main(args: Array[String]) {
    println("Hello, world!")
    //non-mutable field
    val array: Array[Int] = Array(0,1,2,3,4,5)

    var element2 = array(2)
    println("Second element is: " + element2)

    array.foreach(x => println(x))
  }
}

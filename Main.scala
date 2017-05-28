
object Main {

  def main(args: Array[String]) = {

    println("-------original list")
    val list = List("one", "two", "three", "four")
    println(list)
    val expensiveMap = list.map(n => n.length -> n).toMap
    println("-------expensiveMap")
    println(expensiveMap)
    println("-------tupleList")
    val tupleList = list.map(n => (n.length, n))
    println(tupleList)

    import scala.collection.breakOut
    println("-------vector")
    val vector = list.map(n => (n.length, n))(breakOut)
    println(vector)
    println("-------leanMap")
    val efficientMap: Map[Int, String] = list.map(n => (n.length, n))(breakOut)
    println(efficientMap)

  }

}

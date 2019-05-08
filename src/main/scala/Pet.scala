import scala.collection.mutable.ArrayBuffer

trait Pet {
  val name : String
}

class PetRepository {

  val pets: ArrayBuffer[Pet] = ArrayBuffer.empty

  // find by name pattern match in order to find pet or not {

  def cats(): List[Cat] = ???

}
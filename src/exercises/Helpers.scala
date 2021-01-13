package exercises

object Helpers {
  //This function randomly generate a Some or None
  def getMightBeSomeOrNone: Option[Int] = {
    val randNumber = Math.random()
    if(randNumber > 0.5){
      Some(getRandomWholeNum)
    } else None
  }

  def getRandomWholeNum: Int = {
    val randNumber = Math.random()
    (randNumber*10).toInt
  }
}

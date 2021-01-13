import exercises.Helpers

val randomNumber = Helpers.getRandomWholeNum

/* Use pattern matching to achieve the following for randomNumber
* if 1 - print your name
* if 2 - print the team you're in
* if 3 - print your role
* else - print a random word of your choice (nothing rude)
 */
randomNumber match {
  case 1 => println("Callum")
  case 2 => println("LS")
  case 3 => println("Dev")
  case _ => println("Pineapple")
}

val mightBeSomeOrNone = Helpers.getMightBeSomeOrNone

//Use pattern matching to safely retrieve the value from mightBeSomeOrNone
mightBeSomeOrNone match {
  case Some(x) => x
  case None => 0
}

//Do the same as above, but if the result is less than 5 print "less than 5" as well
mightBeSomeOrNone match {
  case Some(x) if x < 5 => {
    println("Less than 5")
    x
  }
  case Some(x) => x
  case None => 0
}
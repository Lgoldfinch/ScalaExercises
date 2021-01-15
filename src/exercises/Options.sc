import exercises.Helpers

//Create a some of Int and a None on the next 2 lines
val someValue: Option[Int] = ???
val noneValue: Option[Int] = ???

println(someValue)
println(noneValue)

// Println the .get of your Some

// Println the .get of your None

val mightBeSomeOrNone = Helpers.getMightBeSomeOrNone
mightBeSomeOrNone
//Use getOrElse to safely retrieve the value inside the Option
mightBeSomeOrNone.???
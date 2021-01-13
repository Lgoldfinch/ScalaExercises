import exercises.Helpers

//Create a some of Int and a None on the next 2 lines
val someValue: Option[Int] = Some(1)
val noneValue = None

println(someValue)
println(noneValue)

// Println the .get of your Some
println(someValue.get)

// Println the .get of your None
println(noneValue.get)


val mightBeSomeOrNone = Helpers.getMightBeSomeOrNone
mightBeSomeOrNone
//Use getOrElse to safely retrieve the value inside the Option
mightBeSomeOrNone.getOrElse(0)
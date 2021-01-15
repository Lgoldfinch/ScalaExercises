
//Fill the lists with some numbers, then some Strings
val numberList: List[Int] = List()
val stringList: List[String] = List()

//Get the first items out of each list
val firstNumber = ???
val firstString = ???

//Get the first items out of each list
val lastNumber = ???
val lastString = ???

//Safely attempt to get the head of each list below
val filledList: List[String] = List("Hello")
val emptyList: List[String] = List()

filledList.???
emptyList.???

//Created a new list, which is numberList with 1 added to each value
val newNumberList = numberList.map(???)

//Capitalise every string in your stringList
//HINT: https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html#toUpperCase():String
val newStringList = stringList.map(???)


case class FamilyMember(name: String, relation: String)

//Fill a list with 3 members of your family
val familyList: List[FamilyMember] = ???

//Make a list, getting each name out of the familyList using one line of code. Think about what type of list this might return.
val familyNames = ???

//Print each name from familyNames out on a new line
familyNames.???
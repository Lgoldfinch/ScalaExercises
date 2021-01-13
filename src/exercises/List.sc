
//Fill the lists with some numbers, then some Strings
val numberList = List(1, 2, 3)
val stringList = List("bosh", "a", "losh")

//Get the first items out of each list
val firstNumber = numberList.head
val firstString = stringList.head

//Get the first items out of each list
val lastNumber = numberList.last
val lastString = stringList.last

//Safely attempt to get the head of each list below
val filledList: List[String] = List("Hello")
val emptyList: List[String] = List()

filledList.headOption
emptyList.headOption

//Created a new list, which is numberList with 1 added to each value
val newNumberList = numberList.map(num => num + 1)

//Capitalise every string in your stringList
//HINT: https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html#toUpperCase():String
val newStringList = stringList.map(str => str.toUpperCase)


case class FamilyMember(name: String, relation: String)

//Fill the following list with 3 members of your family
val familyList: List[FamilyMember] = List(
  FamilyMember("Bob", "Dad"),
  FamilyMember("Katy", "Mum"),
  FamilyMember("Steve", "Brother")
)

//Get each name out of the familyList in one line
val familyNames = familyList.map(familyMember => familyMember.name)

//Print each name from familyNames out on a new line
familyNames.foreach(x => println(x))
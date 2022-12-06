/*
    * CodeWithSuraj 
    * Kotlin Playground - Run Kotlin Online
    * What I Like In Kotlin :
     - In kotlin colon(:) is widely used rather semicolon(;)
     - no need to specify semicolon(;) at the end of the line -> ✌️ 
     - first letter of data_type is always capital -> Int, Float, Double
     - var,val,fun,...etc these are predefine keywords in kotlin.
     - kotlin seriously focus on the concept of mutable and immutable. 
     - Kotlin implicitly recognize the data_type of the variable -> No need to specify the data_type
*/ 

fun main() {
    
    // * Print Function
    println("Hello World!")   // ln -> add new line character 
    print("Hello")
    println(" Suraj")
   
    // * String Templates -> Use variables directly in strings (using dollar sign)
    var x=1
    val greating = "Topper"
    // variable reference -> $
    println("Suraj Dalvi is always No.$x")
    println("Suraj Dalvi is $greating")
    // If you want add expressions in strings then use curly braces -> { $ }
    println("Suraj Dalvi is ${greating.toUpperCase()}")   // call UpperCase function in string 
    
    
    // * Variables -> Var & Val
    
    // Syntax  : var/val variable_name : data_type = value
    
    var y : Int = 5   // var is mutable -> you can change the value of variable
    val z : Int = 10  // val is immutable -> you can't change the value of variable 
    // mutability is not a good thing in development -> it creates a problem 
    // So always prefer val rather var
       y=20
    // z=25 -> you can't
    var name : String = "Suraj"
    println("I'm $name")
    
   // ** In kotlin no need to specify the data_type of the variables explicitly **
    var a = 5   
    val b  = 10 
    var Name = "Suraj"
    // Name = 116  // It throws an error
    // you can't store an integer value to a variable whose data_type is string
    println("My name is $Name")
    Name = "116"
    println("My name is $Name")
    // Kotlin is a strictly type language -> data_type sensitive language
    
    
    // * Conditional Statements -> If-else and When
    
    // # if-else -> same like java
    val age = 18 
    if(age>=21){
        println("You can vote!")
    } else{
        println("Play at home!")
    }
   
    // By using if-else you can directly return the value -> means it can return you last statement 
    // Always avoid 'var' -> as by using if-else you can set the value 'val'
    // In if-else last expressions can be return 
    // Adv -> You don't have any need to make 'var' so 'val' is enough
    
    val value : Int = if(true){   // ': Int' is optional
        print("Value is ")
        10
    }else{
        20
    }
    println(value)
    
    // # when -> As switch-case in java
    // Similar to if-else 'when' also returns the last expressions
    // print or statements inside the print will never return by it as value of any variable -> 
    // Instead kotlin returns kotlin.unit or kotlin.any  
     val nam = "Suraj"
     val temp = when(nam){
     // when(nam){
         
         "Suraj"->{
             println("Awesome")
         }
         
         "Hello"->{
             println("Wow")
         }
         
         else->{
             println("Kuch bhi")
         }
         
     }
    println("value of temp is: $temp")
    
    // # Note: -  'Unit' is one of the data type in kotlin -> which means nothing (Kuch bhi nhi) ->
    //             If no data type that means Unit data type -> Unit or kotlin.Unit -> unit means void
    //         -  'any' is also a data type in kotlin -> which means everything (Sab kuch) ->
    //             any data type can be included in this -> In java as all objects are the childerens of any
    //             particular class -> similarly all data types of kotlin are the childerens of kotlin.any
   
   
   
    // *  | # Arrays | # Loops | # Lists | 
    
    // # Arrays
    val names = arrayOf("Suraj", "Anuj", "Ram")
    // println(names) -> wrong
    println(names[0])

    
    // # Loops -> for loop similar to for-Each loop in java
    for(name in names){
        println(name)
    }
    
    // arrays provide you many functions -> like forEach()
    // we can also apply for loop by using this function 
    names.forEach{
        print(it)
       // println(it)
    }
    
    
    
    // # List
    val Names = listOf("Suraj", "Ram", "Harry",1)  // -> you can add anything in list
     // how to access it -> same like array
    // val Names = listOf<String>("Suraj", "Ram", "Harry",1) // -> explicitly you can fixed the type of list
                                                             // -> list of type string
    
   // # Mutability -> Mutability of arrays and lists
   print("\n")
   names[0]= "Harry"
   println(names[0]) // -> arrays are mutable
   // Names[0]= "Dear" // -> lists are immutable
   println(Names[0])  // -> but you can make it mutable 
   // val Names = mutablelistOf("Suraj", "Ram", "Harry") -> make list mutable
   // # Explore Collection Frameworks 
 
    
    // ****** Explore kotlin in detail using documentation *********
   
    
    
    
    // * Functions  
    
    // function call
    // print("Sum of 2 and 5 is: ")
    println(operation(2,5))
    
    // # Syntax Difference:  In java   -> return_type  + arg
    //                     In kotlin -> arg  + return_type
     
    // # Note:  In kotlin to make functions 'fun' keyword is used
    //        No need of function declaration
    //        
         
    // # Default value function
    // call greetings function
    greetings("Good Morning") // ->  call and pass string
    //  greetings() // ->  just call -> default value is used
    
    // # Name argument pass -> pass argument using argument name 
    // In java we have to pass arguments in function according to order of arguments written in 
    // function defination 
    // But in kotlin we can pass arguments without considering order of arguments
    Greetings(myname="Suraj", greet="Good Evening")
    
    
    // * Higher-order functions
    // call function
    val output = Operation(4, 5, { a,b ->
        print("The sum of these two numbers 4 and 5 is: ")
        a+b
    })
    println(output)
    
    
    // * OOPS 
    
      val p1 = Person() 
      println(p1)

      val p2 = person("Suraj")
      println(p2.name)
      
      val p3 = Student("Coder")
      println(p3.name)
     
    // # Note:  '=='  -> Values -> Is values of both the variables are equal or not 
    //          '===' -> Reference / Address -> Is both the variables point to same address or memory location
    //           True -> returns true  &  False -> returns false
    // # Explore other classes     
      
      
         
    // * Filter and Map
      
      val list = listOf<Int>(1,2,3,4,5,6)  // list of type Int
      // In java to filter any list we generally used for loop and define some conditions in it
      // filter even numbers from the list
      // filter function -> take Int and returns boolean(1 or 0)
      // Process : filter -> Print
      // Map -> To transform the list to any we used map -> map change or transform your list
      list.filter({
          it % 2 == 0
      }).forEach({
          println("$it")
      })
      
      // map is used
      // 
      val List = listOf<Int>(1,2,5,8,3)
      val newlist = List.filter({
         it % 2 == 0
      }).map({
          it*it
      }).forEach({
          println("$it")
      })
      
     // * Scope functions (let) -> To check nullability -> To avoid null-pointer exception
     // General way
     val myName : String? = null
     if(myName == null){
        println(myName)
     }
     // Using scope function -> 'let'
     val name1 : String? = null
     // name1?.let{}  // -> name1? is not null 
     name1.let{       // -> name1 is null
         print(it)
     }
  
  
}

// ******* Functions creation ********

 // function Defination
 fun operation(a: Int , b: Int) : Int{
        return a+b
    }
 
 // OR -> single line function -> I can use function a variable -> functional programming language 
 //  fun operation(a: Int , b: Int) : Int = a+b

 // greetings function defination
 fun greetings(greet: String = "Good Night"){
     println("Hello, $greet")
 }

 // greetings function defination
 fun Greetings(greet: String = "Good Afternoon",myname: String = "Raj" ){
     println("Hello $myname, $greet")
 }

// Higher-order function
 fun Operation(a: Int, b: Int, operate : (Int, Int) -> Int ) : Int{
     return operate(a,b)
 }
// # Note:  - Unit (kotlin) -> void (java) 
//          - When we pass one function as a argument in another function ->
//            written in curly braces in function call -> called lambada function -> define at the time 
//            of function call.
      

// **** OOPS Classes ****


// Empty class
class Person

// Working class
class person(_name : String){
    val name : String
    init{
        name = _name
    }
}

// Optimised class -> Inside constructor we define properties of class
class Student(val name : String)  // 'name' is now become property of this class 'Student'













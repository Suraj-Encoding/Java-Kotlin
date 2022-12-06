
public class Java_oops{

    public static void main(String[] args) {
        System.out.println("\n ## OOPS IN JAVA ## \n");
     
        Person p1 = new Person();
        p1.name = "Suraj";
        p1.age = 20;
        System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person();
        p2.age = 19;
        p2.name = "Joy";
        System.out.println(p2.age + " " + p2.name);
        
        Person p3 = new Person(31, "Suraj Dalvi");
        System.out.println(p3.age + " " + p3.name);
        
        p1.eat();
        p2.walk();
        p1.walk(2);
        
        System.out.println("Count is: " + Person.count);

    }
}


class Person{

    // # Properties
    String name;
    int age;

    // # 'static' keyword -> counter to objects
    static int count;   // count = 0
    // static keyword indicates that it is property of class and not of object
    // By default value of count is zero. 

    // # Constuctors -> normal constructor
    public Person(){
        count++;
        System.out.println("Creating an object " + count);
    }
    
    // # construtor overloading & 'this' keyword
    public Person( int newAge, String newName){
    //    public Person( int age, String name){

        // call one constructor in another constructor using keyword 'this'
         this(); 
        // OR ->  count++; -> count become 3
         name = newName;
         age = newAge;
        
        // another use of 'this'
        //  this.name = name;
        //  this.age = age;
    }

    // # Behaviour -> methods or functions
    // In walk function, we see polymorphism -> compile time PM
    void walk(){
        System.out.println(name + " is walking.");
    }
    
    void eat(){
        System.out.println(name + " is eating.");
    }

    void walk(int steps){
        System.out.println(name + " Walked " + steps + " steps.");
    }
   
}
class Pers
{ 
Pers() 
{ 
System.out.println("Person class Constructor"); 
} 
} 
/* subclass Student extending the Person class */ 
class Studen extends Pers 
{ 
Studen() 
{ 
// invoke or call parent class constructor 
super(); 
System.out.println("Student class Constructor"); 
}  
} 
/* Driver program to test*/ 
class Tests 
{ 
public static void main(String[] args) 
{ 
Studen s = new Studen(); 
} 
} 
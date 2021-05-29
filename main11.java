class Person 
{ 
void message() 
{ 
System.out.println("This is a person class"); 
} 
} 
/* Subclass Student */ 
class Stud extends Person 
{ 
void message() 
{ 
System.out.println("This is a student class"); 
} 
// Note that display() is only in Student class 
void display() 
{ 
// will invoke or call current class message() method 
message(); 
// will invoke or call parent class message() method 
super.message(); 
} 
} 
/* Driver program to test */ 
class Tes
{ 
public static void main(String args[]) 
{ 
Stud s = new Stud(); 
// calling display() of Student 
s.display(); 
} 
} 


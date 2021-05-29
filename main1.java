class Student { 
String name, city; 
int age; 
static int m; 
void PrintData() 
{ 
System.out.println("Student name = "+name); 
System.out.println("Student city = "+city); 
System.out.println("Student age = "+age); 
} 
} 
class Stest { 
public static void maina(String args[]) { 
Student s1=new Student(); 
Student s2=new Student(); 
s1.name="Ram"; 
s1.city="Jaipur"; 
s1.age=25; 
s2.name="Shyam"; 
s2.city="Kota"; 
s2.age=26; 
s2.PrintData(); 
s1.PrintData(); 
s1.m=28; 
s2.m=19; 
Student.m=26; 
System.out.println("s1.m = "+s1.m); 
System.out.println("s2.m = "+s2.m); 
System.out.println("Student.m ="+Student.m); 
} 
}
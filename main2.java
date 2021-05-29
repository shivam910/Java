class Student2 
{ 
private String name, city; 
private int age; 
public void GetData(String x, String y, int t) 
{ 
name=x; 
city=y; 
age=t; 
} 
public void PrintData() { 
System.out.println("Student name ="+name); 
System.out.println("Student city ="+city); 
System.out.println("Student age ="+age); 
} 
} 
class STtest { 
public static void main(String args[]) { 
Student2 s1=new Student2(); 
Student2 s2=new Student2(); 
s2.GetData("Ram","Jaipur",25); 
s2.PrintData(); 
s1.GetData("Shyam","Kota",26); 
s1.PrintData(); 
} 
} 

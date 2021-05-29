import java.util.*; 
import java.lang.*; 
import java.io.*; 
class a 
{ 
public void print_CS() 
{ 
System.out.println("CS"); 
} 
} 
class b extends a 
{ 
public void print_second() 
{ 
System.out.println("Second"); 
} 
} 
class third extends b 
{ 
public void print_year() 
{ 
System.out.println("Year"); 
} 
} 
// Drived class 
class Main 
{ 
public static void main(String[] args) 
{ 
third c = new third(); 
c.print_CS(); 
c.print_second(); 
c.print_year(); 
} 
} 
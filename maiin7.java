import java.util.*; 
import java.lang.*; 
import java.io.*; 
class first { 
public void print_comp() { 
System.out.println("Computer"); 
} 
} 
class second extends first { 
public void print_science() { 
System.out.println("Science"); 
} 
} 
// Driver class 
class M { 
public static void main(String[] args) { 
second s = new second(); 
s.print_comp(); 
s.print_science(); 
s.print_comp(); 
} 
} 
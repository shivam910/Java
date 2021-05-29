class Vehicle 
{ 
int Max_Speed = 120; 
} 
// sub class Car extending vehicle 
class Car extends Vehicle 
{ 
int Max_Speed = 180; 
void display() 
{ 
// print maxSpeed of base class (vehicle) 
System.out.println("Maximum Speed: "+ super.Max_Speed); 
} 
} 
// Driver program to test 
class Test 
{ 
public static void main(String[] args) 
{ 
Car small = new Car(); 
small.display(); 
} 
} 


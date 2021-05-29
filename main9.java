// Base Class 
class Parent_Class { 
    void show1() 
    { 
    System.out.println("Parent show"); 
    } 
    } 
    // Inherited class 
    class Child_Class extends Parent_Class { 
    // This method overrides show() of Parent Override 
    void show1() 
    { 
    System.out.println("Child show"); 
    } 
    } 
    // Driver class 
    class k { 
    public static void main(String[] args) 
    { 
    // If a Parent type reference refers to a Parent object, then 
    // Parent's show is called 
    Parent_Class obj1 = new Parent_Class(); 
    obj1.show1(); 
    // If a Parent type reference refers to a Child object Child's 
    // show() is called. This is called RUN TIME POLYMORPHISM. 
    Parent_Class obj2 = new Child_Class(); 
    obj2.show1(); 
    } 
    } 
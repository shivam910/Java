class Employee { 
    int empId; 
    String empName; 
    
    //parameterized constructor with two parameters 
    
    Employee(int id, String name){ 
    this.empId = id; 
    this.empName = name; 
    } 
    
    void info() { 
    System.out.println("Id: "+empId+" Name: "+empName); 
    } 
    
    public static void main(String args[]) { 
    Employee obj1 = new Employee(4565,"Tom"); 
    Employee obj2 = new Employee(9652,"Jerry"); 
    obj1.info(); 
    obj2.info(); 
    } 
    } 
    
class Cons_over { 
    int p,q; 
    public Cons_over() 
    {} 
    public Cons_over(int x, int y) { 
    p=x; 
    q=y; 
    } 
    public int add(int i, int j) { 
    return (i+j); 
    } 
    public int add(int i, int j, int k) { 
    return (i+j+k); 
    } 
    public float add(float f1, float f2) { 
    return (f1+f2); 
    } 
    public void printData() { 
    System.out.print("p = "+p); 
    System.out.println(" q = "+q); 
    } 
    } 
    class ConstructorOverlaoding { 
    public static void main(String args[]) { 
    int x=67, y=7, z=109; 
    Cons_over c=new Cons_over(); 
    Cons_over c1=new Cons_over(x, z ); 
    c1.printData(); 
    float m=45.2F, n=7.8F; 
    int k=c.add(x,y); 
    int t=c.add(x,y,z); 
    float ft=c.add(m, n); 
    System.out.println("k = "+k); 
    System.out.println("t = "+t); 
    System.out.println("ft = "+ft); 
    }}
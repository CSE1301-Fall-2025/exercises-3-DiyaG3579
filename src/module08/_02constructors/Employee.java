package module08._02constructors;

public class Employee extends Person
{
  
   private static int nextId = 1;
   private int id; 
	
   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++;
   }
  
   public int getId() 
   {
      return id;
   }
   
   public static void main(String[] args)
   {
      Employee emp = new Employee("Dani");
      System.out.println(emp.getName());
      System.out.println(emp.getId());
      Employee e2 = new Employee("Ciela");
      System.out.println(e2.getName() + ", " + e2.getId());
   }
}

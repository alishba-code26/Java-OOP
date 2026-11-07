class Employee1{
    String name;
    int EmployeeID;
    double salary;
    String department;
    
    void display(){
        System.out.println("Name: " +name);
         System.out.println("EmployeeID: " +EmployeeID);
          System.out.println("Salary: " +salary);
           System.out.println("Department: " +department);     
    }
}
    public class Employee{
        public static void main(String[] args){
      Employee1 emp1 = new Employee1();
      Employee1 emp2 = new Employee1();
      Employee1 emp3 = new Employee1();
       
      emp1.name = "Alishba";
      emp1.EmployeeID = 2888;
      emp1.salary = 200000;
      emp1.department = "IT";
      
      emp2.name = "Asfa";
      emp2.EmployeeID = 1111;
      emp2.salary = 200000;
      emp2.department = "Doc";
      
      emp3.name = "Ayesha";
      emp3.EmployeeID = 2222;
      emp3.salary = 200000;
      emp3.department = "Lawyer";
      
      emp1.display();
      emp2.display();
      emp3.display();
      
    }
}



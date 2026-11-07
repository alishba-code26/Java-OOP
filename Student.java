class Student1{
    String name;
    int rollNo;
    String Department;
    double cgpa;    

void displayInfo(){
   System.out.println("Name: " +name);
   System.out.println("Roll no: " +rollNo);
   System.out.println("Department: " +Department);
   System.out.println("CGPA: " +cgpa);
}
}
public class Student{ 
public static void main(String[] args){
Student1 s1 = new Student1();
s1.name = "Alishba";
s1.rollNo = 3;
s1.Department = "CS";
s1.cgpa = 3.6;
s1.displayInfo();
}
}
import java.util.*;
 class Student
{
  public Student(String n,int id,String dept)
  {

    System.out.println("Id: "+id);
     System.out.println("Name: "+n);
    System.out.println("Department Id: "+id);
     System.out.println("Department:"+dept);
  }
 }
class Department
{
   public Department(String n,int id,String dept)
  {

    System.out.println("Id: "+id);
     System.out.println("Name: "+n);
    System.out.println("Department Id: "+id);
     System.out.println("Department:"+dept);
  }
}

class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Name");
    String name=sc.nextLine();
    System.out.println("Id");
    int id=sc.nextInt();
     System.out.println("Department");
    String dept=sc.next();
     System.out.println("Original:-");
    Student s=new Student(name,id,dept);
     System.out.println("Duplicate:-");
       Department depart=new Department(name,id,dept);

  }
}

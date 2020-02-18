import java.util.*;
class Customer
{
   static void display(String s1,String s2,String s3,String s4,String s5,String s6 )
  {
     System.out.println("Your Details:");
    // System.out.println(s7);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
     System.out.println("Your id is 1");

  }


  }


 class Main
{
  public static void main(String args[])
  {
  Customer  a=new  Customer ();
    Scanner aa=new Scanner(System.in);
    String s1,s2,s4,s5;
    String s3,s6,s7;
    System.out.println("Enter the number of Customer");
     s7=aa.next();

  System.out.println("Enter the name");
    s1=aa.next();
  System.out.println("Enter the address");
    s2=aa.next();
  System.out.println("Enter the contact number");
    s3=aa.next();
   System.out.println("Enter the email");
    s4=aa.next();
   System.out.println("Enter the ProofType");
    s5=aa.next();
   System.out.println("Enter the proof ID");
    s6=aa.next();
    System.out.println("Registration Successfull");
    a.display(s1,s2,s3,s4,s5,s6);
  }
}

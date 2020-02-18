import java.util.Scanner;
class Team
{
  void display(String s1,String s2,String s3)
  {
    System.out.println("Team: "+s1+" "+s2);
    System.out.println("City: "+s3);


  }
 

}
class Main
{
  public static void main(String args[])
  {
  Scanner aa=new Scanner(System.in);
  Team a=new Team();
  System.out.println("Team Details-");
  String s1,s2,s3;
  s1=aa.next();
  s2=aa.next();
   s3=aa.next();

  a.display(s1,s2,s3);






  }
}

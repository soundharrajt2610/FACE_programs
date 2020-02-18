import java.util.*;
class Area
{
  public Area()
  {

  }
  public Area(int a,int b,int c)
  {
    System.out.println("Area of Cube is "+(a*(b*c)));
  }
  public Area(int a)
  {
    System.out.println("Area of Sphere is "+(4*(3.14*a)));
  }
  public Area(int a,int c)
  {
    System.out.println("Area of Sphere is "+((((2*3.14)*a)*c)+((2*3.14)*(a*a))));
  }
}
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    System.out.println("1.Cube");
     System.out.println("2.Sphere");
      System.out.println("3.Cylinder");
     System.out.println("Enter the choice");
    int choice=sc.nextInt();
    switch(choice)
    {
      case 1:
            System.out.println("length");
            int length=sc.nextInt();
            System.out.println("breadth");
            int breadth=sc.nextInt();
            System.out.println("height");
            int heigth=sc.nextInt();
            Area area=new Area(length,breadth,heigth);
        break;
      case 2:
            System.out.println("radius");
            int radius=sc.nextInt();
            Area area1=new Area(radius);
        break;
      case 3:
            System.out.println("radius");
            int r=sc.nextInt();
            System.out.println("length");
            int l=sc.nextInt();
            System.out.println("height");
            int h=sc.nextInt();
            Area area2=new Area(r,l,h);
        break;
  }
}
}

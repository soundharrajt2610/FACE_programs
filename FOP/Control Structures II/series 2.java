import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sathish=new Scanner(System.in);
      int a=sathish.nextInt();
      int b=6;
      System.out.print(b+" ");
      for (int i=1;i<a;i++){
      int c=i*5;
       b=b+c;
        System.out.print(b+" ");
      }
	}
}

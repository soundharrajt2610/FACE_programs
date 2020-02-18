import java.util.Scanner;
class PlayerRecord
{
  void display(byte b,byte c,byte d,float e,float f,float g,float i)
  {
    System.out.println("Matches Played: "+b);
    System.out.println("Win/Loss Ratio:"+(c/2)+":"+(d/2));
    System.out.println("Avg/Max Lap Speed: "+e+" | "+f);
     System.out.println("Avg/Max Throw Distance: "+g+" | "+i);
   }
}
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  PlayerRecord a=new PlayerRecord();
  byte matchesPlayed=sc.nextByte();
  byte numOfWins=sc.nextByte();
  byte numOfLosses=sc.nextByte();
  float avgLapSpeed=sc.nextFloat();
  float  maxLapSpeed=sc.nextFloat();
  float avgThrowDistance=sc.nextFloat();
  float  maxThrowDistance=sc.nextFloat();
  a.display(matchesPlayed,numOfWins,numOfLosses,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
 }
}

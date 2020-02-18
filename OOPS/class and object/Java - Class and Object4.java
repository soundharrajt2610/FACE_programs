import java.util.*;
class Player
{
   static void display(String s1,String s2 )
  {
      System.out.println("Player Name: "+s1);
      System.out.println("Position: "+s2);

    }
}
  class Main
{
  public static void main(String args[])
  {
      Scanner aa=new Scanner(System.in);
    String playerName,playerPosition;

    playerName=aa.nextLine();

   playerPosition=aa.next();
   Player a=new Player();
   a.display(playerName, playerPosition);

  }
}

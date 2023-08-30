import java.util.*;
class Gusser
{
    int guessnum;
    int gussingnum()
    {
        System.out.println("Gusser! kindley guss the number");
        Scanner sc = new Scanner(System.in);
        guessnum =sc.nextInt();
        return guessnum;
    }

}

class Player
{
    int guessnum;
    int gussingnum()
    {
    System.out.println("Player! kindley guess the number");
     Scanner sc = new Scanner(System.in);
    guessnum= sc.nextInt();
     return guessnum;
}
}

class umpire
{
    int numfromgusser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;
    
     void collectnumfromgusser()
    {
    Gusser g = new Gusser();
    numfromgusser = g.gussingnum();

    }
    
    void collectnumfromplayer()
    {
      Player p1 = new Player();
      Player p2 = new Player();
      Player p3 = new Player();

      numfromplayer1 = p1.gussingnum();        
      numfromplayer2 = p2.gussingnum();        
      numfromplayer3 = p3.gussingnum();        
    
    }
    void Compare()
    {
      if(numfromgusser == numfromplayer1)
      {
        if(numfromgusser==numfromplayer2 && numfromgusser==numfromplayer3)
        {
             System.out.println("sab jeet gaya!");
       
            
        }
        else if(numfromgusser==numfromplayer2)
        {
        System.out.println("player1 and player2 won the game");
          
        }
        else if(numfromgusser==numfromplayer3)
        {
        System.out.println("player1 and player3 won the game");
        }
        else{
        System.out.println("player1 won the game");
      }
      }
      else if(numfromgusser==numfromplayer2)
      {
        if(numfromgusser==numfromplayer3)
        {
         System.out.println("player2 and player3 won the game");
        }
        else{
         System.out.println("player2 won the game");
        }
      }
      
      else if(numfromgusser==numfromplayer3)
      {
        System.out.println("player3 won the game");
      }
      else{
        System.out.println("all ! lose a game");
      }
    }
}

public class Gussergame
{
    public static void main(String[]args)
    {
        System.out.println("start game");
        umpire u =new umpire();
        u.collectnumfromgusser();
        u.collectnumfromplayer();
        u.Compare();
        
    }
}
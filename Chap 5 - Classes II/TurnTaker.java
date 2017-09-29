 
public class TurnTaker
{
    /*private */ static int turn = 0;

    private int myTurn;
    private String name;

    public TurnTaker(String theName, int theTurn)
    {
        name = theName;
        if (theTurn >= 0)
            myTurn = theTurn;
        else
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public TurnTaker( )
    {
        name = "No name yet";
        myTurn = 0;//Indicating no turn.
    }

    public String getName( )
    {
        return name;
    }

    public static int getCurrentTurn( )
    {
        return turn;
    }

    public static int getTurn( )
    {
        turn++;
        return turn;
    }

    public boolean isMyTurn( )
    {
        return (turn == myTurn);
    }
    
    
    
    //driver for turn taker
    public static void main(String[] args){
      TurnTaker tomsTicket = new TurnTaker("Tom", 1);
      TurnTaker amysTicket = new TurnTaker("Amy", 8);
      TurnTaker willsTicket = new TurnTaker("Will", 3);
      
      for (int i = 1; i < 10; i++)
      {
          System.out.println("Turn = " + TurnTaker.getTurn( ));
          if (tomsTicket.isMyTurn( )){
              System.out.println("Ticket from " + tomsTicket.getName( ));
          }
          if (amysTicket.isMyTurn( )){
              System.out.println("Ticket from " + amysTicket.getName( ));
          }
          
          if (willsTicket.isMyTurn( )){
              System.out.println("Ticket from " + willsTicket.getName( ));
          }
      }//end for
      
      
    }
    
}

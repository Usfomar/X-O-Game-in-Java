import java.util.Scanner;

public class GameManger
{
    private Board board;
    private players player1;
    private players player2;
    private players nowplayer;
    public GameManger(players player1 , players player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        board = new Board();
        nowplayer = player1;
    }

    public void start()
    {
        Scanner input = new Scanner(System.in);
        board.display_board();
        int row , col;

        while(!board.is_draw())
        {
            System.out.println("Enter the row and the column from (1 - 3)");
            System.out.print("Row: ");
            row = input.nextInt()-1;
            System.out.print("Column: ");
            col = input.nextInt()-1;

            if (board.update_board(row , col ,nowplayer.getSymbol()))
            {
                board.display_board();
                if (board.is_winner(nowplayer.getSymbol()))
                {
                    System.out.println(nowplayer.getName()+" Wins!!!");
                    return;
                }
                if (nowplayer == player1)
                {
                    nowplayer = player2;
                }
                else
                {
                    nowplayer = player1;
                }
            }
            else
            {
                System.out.println("Invalid move");
            }
        }
        System.out.println("Draw!!!");
    }
}


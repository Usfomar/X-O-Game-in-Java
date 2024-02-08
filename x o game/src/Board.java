public class Board
{
     private   char [][]board = {{' ',' ',' '} , {' ' , ' ' , ' '} , {' ' , ' ' , ' '}};
     private int moves = 0;

     public void display_board()
     {
         System.out.println();
         for (int i = 0 ; i < 3 ; i++)
         {
             for (int j = 0; j < 3; j++)
             {
                 System.out.print(board[i][j]);
                 if (j != 2) {
                     System.out.print("   ");

                     System.out.print("|");
                     System.out.print("   ");
                 }
             }
             System.out.println();
             if(i != board.length-1) {
                 System.out.println("ــــــــــــــــــ");
             }
         }
         System.out.println();

     }
     public boolean update_board(int row , int col , char symbol)
     {
         if (row >=0 && row <= 2 && col >=0 && col <= 2 )
         {
             if (board[row][col] == ' ')
             {
                 board[row][col] = symbol;
                 return true;
             }
         }
         return false;
     }
     public boolean is_winner(char sign)
     {
         for (int i = 0; i < 3; i++)
         {
             //check rows win
             if (board[i][0] == sign && board[i][1] == sign && board[i][2] == sign)
             {
                 return true;
             }
             //check columns win
             if (board[0][i] == sign && board[1][i] == sign && board[2][i] == sign)
             {
                 return true;
             }
         }
         //check diagonal win
         if (board[0][0] == sign && board[1][1] == sign && board[2][2] == sign)
         {
             return true;
         }
         if (board[0][2] == sign && board[1][1] == sign && board[2][0] == sign)
         {
             return true;
         }
         return false;
     }

     public boolean is_draw()
     {
         boolean draw = true;
         for (int i = 0 ; i <3 ; i++)
         {
             for (int j = 0 ;j<3;j++)
             {
                 if (board[i][j] == ' ')
                 {
                     draw = false;
                     break;
                 }
             }
             if (!draw)
             {
                 break;
             }
         }
         return draw;
     }

}





import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        String name1 , name2;
        char symbol1 , symbol2;
        
        System.out.println("Player 1 enter your name");
        name1 = input.next();
        System.out.println("Player 2 enter your name");
        name2 = input.next();
        
        System.out.println(name1 + " choice your symbol ('X' or 'O')");
        symbol1 = Character.toUpperCase(input.next().charAt(0));

        System.out.println(name2 + " choice your symbol ('X' or 'O')");
        symbol2 = Character.toUpperCase(input.next().charAt(0));
        

            players player1 = new players(name1 , symbol1);
            players player2 = new players(name2 ,symbol2);


        GameManger game = new GameManger(player1 , player2);
        game.start();
      
           
            
        


    }
}
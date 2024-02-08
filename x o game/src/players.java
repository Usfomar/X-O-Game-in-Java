public class players{
    private String name;
    private char symbol;

    public  players(String name , char symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
    public void move(Board board , int row , int col)
    {
        board.update_board(row , col , symbol);
    }
}

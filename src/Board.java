public class Board {
    // public Chip[][] gameBoard;
    public boolean win;
    public int columns;
    public int rows;
    public int first;
    public int second;
    public int third;

    public Board(int a,int b, int c) {
        first = a;
        second = b;
        third = c;



    }
    public void Winner(){
        win = true;
    }
}

import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public Board[] allboards;
    public Board[] winBoard;
    public Board[] loseBoard;
    public boolean win;
    public int c = 0;

    public MyPlayer() {
        columns = new int[10];
        allboards = new Board [19];
        winBoard = new Board [14];
        loseBoard = new Board [5];
        Board lose = new Board(1,0,0);
        loseBoard [0] = lose;

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */


        for (int x = 1; x < 4; x++) {
            for (int q = 0; q < x; q++) {
                for (int w = 0; w <q; w++) {
                    System.out.println(x+"" + q + w);
                    Board b = new Board(x,q,w);

                    allboards[c] = b;


                    System.out.println("resulting boards");
                    for (int e = w-1; e > -1; e--) {
                        System.out.println(x + "" + q + e);
                        if(x==loseBoard[0].first && q==loseBoard[0].second&& w==loseBoard[0].third){
                            System.out.println("you win");

                        }
                    }

                        for (int r = q - 1; r > -1; r--) {
                            if (r < w) {
                                System.out.println(x + "" + r + r);
                                if(x==loseBoard[0].first && r==loseBoard[0].second&& r==loseBoard[0].third){
                                    System.out.println("you win");

                                }
                            }
                            else{
                                System.out.println(x + ""+ r+w);
                                if(x==loseBoard[0].first && r==loseBoard[0].second&& w==loseBoard[0].third){
                                    System.out.println("you win");

                                }
                            }
                        }
                       for (int t = x-1; t>0; t--)  {
                           if (t < q) {
                               System.out.println(t + "" + t + t);
                               if(x==loseBoard[0].first && t==loseBoard[0].second&& t==loseBoard[0].third){
                                   System.out.println("you win");

                               }
                           }
                           else{
                               System.out.println(t + ""+ q+w);
                               if(t==loseBoard[0].first && q==loseBoard[0].second&& w==loseBoard[0].third){
                                   System.out.println("you win");

                               }
                           }



                       }

                    System.out.println("end of resulting boards ");
                    c++;
                    }


            }

        }
boardSort();
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }
    public void boardSort(){

        }
    }




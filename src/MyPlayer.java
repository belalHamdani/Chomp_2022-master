import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public boolean win;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */


        for (int x = 3; x > 0; x--) {
            for (int q = x; q > -1; q--) {
                for (int w = q; w > -1; w--) {
                    System.out.println(x+"" + q + w);
                    System.out.println("resulting boards");
                    for (int e = w-1; e > -1; e--) {
                        System.out.println(x + "" + q + e);
                    }
                        for (int r = q - 1; r > -1; r--) {
                            if (r < w) {
                                System.out.println(x + "" + r + r);
                            }
                            else{
                                System.out.println(x + ""+ r+w);
                            }
                        }
                       for (int t = x-1; t>0; t--)  {
                           if (t < q) {
                               System.out.println(t + "" + t + t);
                           }
                           else{
                               System.out.println(t + ""+ q+w);
                           }



                       }

                    System.out.println("end of resulting boards ");
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




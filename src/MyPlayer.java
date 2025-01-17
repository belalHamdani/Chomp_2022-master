import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public Board[] allboards;
    public Board[] winBoard;
    public Board[] loseBoard;
    //public boolean win;
    public int c = 0;
    int numLOSE = 0;
    int bestRow;
    int bestColumn;

    public MyPlayer() {
        columns = new int[10];
        allboards = new Board[19];
        winBoard = new Board[14];
        loseBoard = new Board[5];
        Board lose = new Board(1, 0, 0);
        // loseBoard [0] = lose;
        //   numLOSE =1;

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */


        for (int x = 1; x < 4; x++) {
            for (int q = 0; q <= x; q++) {
                for (int w = 0; w <= q; w++) {
                    System.out.println(x + "" + q + w);
                    Board b = new Board(x, q, w);

                    allboards[c] = b;
                    boolean win = false;

                    System.out.println("resulting boards");
                    for (int e = w - 1; e > -1; e--) {
                        System.out.println(x + "" + q + e);
                        for (int tt = 0; tt < numLOSE; tt++) {
                            if (x == loseBoard[tt].first && q == loseBoard[tt].second && e == loseBoard[tt].third) {
                                System.out.println("you win");
                                win = true;
                                if (x - loseBoard[tt].first != 0) {
                                    System.out.println("column = 0" + "\n row =" + loseBoard[tt].first);

                                } else {
                                    if (q - loseBoard[tt].second != 0) {
                                        System.out.println("column = 1" + "\n row =" + loseBoard[tt].second);
                                    } else {
                                        if (w - loseBoard[tt].third != 0) {
                                            System.out.println("column = 2" + "\n row =" + loseBoard[tt].third);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    for (int r = q - 1; r > -1; r--) {
                        if (r < w) {
                            System.out.println(x + "" + r + r);
                            for (int tt = 0; tt < numLOSE; tt++) {
                                if (x == loseBoard[tt].first && r == loseBoard[tt].second && r == loseBoard[tt].third) {
                                    System.out.println("you win");
                                    win = true;
                                    if (x - loseBoard[tt].first != 0) {
                                        System.out.println("column = 0" + "\n row =" + loseBoard[tt].first);

                                    } else {
                                        if (q - loseBoard[tt].second != 0) {
                                            System.out.println("column = 1" + "\n row =" + loseBoard[tt].second);
                                        } else {
                                            if (w - loseBoard[tt].third != 0) {
                                                System.out.println("column = 2" + "\n row =" + loseBoard[tt].third);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println(x + "" + r + w);
                            for (int tt = 0; tt < numLOSE; tt++) {
                                if (x == loseBoard[tt].first && r == loseBoard[tt].second && w == loseBoard[tt].third) {
                                    System.out.println("you win");
                                    win = true;
                                    if (x - loseBoard[tt].first != 0) {
                                        System.out.println("column = 0" + "\n row =" + loseBoard[tt].first);

                                    } else {
                                        if (q - loseBoard[tt].second != 0) {
                                            System.out.println("column = 1" + "\n row =" + loseBoard[tt].second);
                                        } else {
                                            if (w - loseBoard[tt].third != 0) {
                                                System.out.println("column = 2" + "\n row =" + loseBoard[tt].third);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int t = x - 1; t > -1; t--) {
                        if (t < q) {
                            System.out.println(t + "" + t + t);
                            for (int tt = 0; tt < numLOSE; tt++) {
                                if (t == loseBoard[tt].first && t == loseBoard[tt].second && t == loseBoard[tt].third) {
                                    System.out.println("you win");
                                    win = true;
                                    if (x - loseBoard[tt].first != 0) {
                                        System.out.println("column = 0" + "\n row =" + loseBoard[tt].first);

                                    } else {
                                        if (q - loseBoard[tt].second != 0) {
                                            System.out.println("column = 1" + "\n row =" + loseBoard[tt].second);
                                        } else {
                                            if (w - loseBoard[tt].third != 0) {
                                                System.out.println("column = 2" + "\n row =" + loseBoard[tt].third);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println(t + "" + q + w);
                            for (int tt = 0; tt < numLOSE; tt++) {
                                if (t == loseBoard[tt].first && q == loseBoard[tt].second && w == loseBoard[tt].third) {
                                    System.out.println("you win");
                                    win = true;
                                    if (x - loseBoard[tt].first != 0) {
                                        System.out.println("column = 0" + "\n row =" + loseBoard[tt].first);

                                    } else {
                                        if (q - loseBoard[tt].second != 0) {
                                            System.out.println("column = 1" + "\n row =" + loseBoard[tt].second);
                                        } else {
                                            if (w - loseBoard[tt].third != 0) {
                                                System.out.println("column = 2" + "\n row =" + loseBoard[tt].third);
                                            }
                                        }
                                    }
                                }
                            }
                        }


                    }

                    if (win == false) {
                        System.out.println("you lose");
                        //todo: add b to losebard array at locagtion numlose
                        //todo: incrase numlose by 1
                        loseBoard[numLOSE] = b;
                        numLOSE++;
                        System.out.println("column = 0" + "\n row =");

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

    public void boardSort() {

    }
}




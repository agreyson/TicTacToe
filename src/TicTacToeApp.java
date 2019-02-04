import processing.core.PApplet;

public class TicTacToeApp extends PApplet {
    private static TicTacToeApp app; // reference to itself
    private Owner gameWinner; // who has won the game

    private int turns;
    private Space[] spaces; // board spaces
    private TurnReferee referee; // after each turn, determines if there's a winner
    private ComputerPlayer computerPlayer; // computer player turn taking logic

    private final int SPACE_WIDTH = 100;
    private final int SPACE_HEIGHT = 100;
    public final static int COUNT_FOR_WIN = 3;

    public TicTacToeApp(){
        app = this;
        gameWinner = Owner.NONE;
        turns = 0;
    }

    public static void main(String[] args) {
        PApplet.main("TicTacToeApp");
    }

    public void settings(){
        size(300, 300);
    }

    public void setup(){
        int index = 0; // index for spaces array
        spaces = new Space[COUNT_FOR_WIN * COUNT_FOR_WIN];

        Space[][] rows = new Space[COUNT_FOR_WIN][COUNT_FOR_WIN];
        Space[][] columns = new Space[COUNT_FOR_WIN][COUNT_FOR_WIN];
        Space[][] diagonals = new Space[2][COUNT_FOR_WIN];
        // assign Space objects to rows, columns, diagonals, and spaces array

        referee = new TurnReferee(rows, columns, diagonals);
        computerPlayer = new ComputerPlayer(rows, columns, diagonals);
    }

    public void draw() {

    }

    public void mouseClicked(){
        // human click initiates turn taking
    }

    public static TicTacToeApp getApp(){
        return app;
    }
}

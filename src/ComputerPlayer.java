public class ComputerPlayer {
    private Space[][] rows;
    private Space[][] columns;
    private Space[][] diagonals;

    public ComputerPlayer(Space[][] rows, Space[][] columns, Space[][] diagonals){
        this.rows = rows;
        this.columns = columns;
        this.diagonals= diagonals;
    }

    public void takeTurn(){
        // implement dumb or smart algorithm for claiming empty space
    }
}


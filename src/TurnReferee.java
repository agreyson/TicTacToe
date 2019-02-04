public class TurnReferee {
    private Space[][] rows;
    private Space[][] columns;
    private Space[][] diagonals;

    public TurnReferee(Space[][] rows, Space[][] columns, Space[][] diagonals){
        this.rows = rows;
        this.columns = columns;
        this.diagonals= diagonals;
    }

    public Space[] isWinner(){
        // calls threeInARow to determine the winning combination if any
        Space[] winner = null;

        // returns entire row/column/diagonal that won, just in case app wants to do fancy animation of the spaces
        return winner;
    }

    private Space[] threeInARow(Space[][] spaces){
        // for each set of rows, columns, or diagonals, test if all spaces are claimed by human or computer
        Space[] winner = null;

        return winner;
    }

}

public class BreakthroughPiece extends GamePiece {
    private int rowDir;

    public BreakthroughPiece(int r, int c, boolean isWhite){
        super(r, c, isWhite ? "W" : "B");
        this.rowDir = isWhite ? -1 : +1;
    }

    public boolean canMove( int colDir){
        int newRow = r + rowDir, newCol = c + colDir;

        // Can't move out of bounds.
        if (!board.canAdd(newRow, newCol))
            return false;

        // "A piece can be moved one space forward or diagonally forward,
        // if the target position is empty."
        if (board.get(newRow, newCol) == null)
            return true;

        BreakthroughBoard bb = (BreakthroughBoard)board;
        // Can capture an enemy piece diagionally forward only
        if( colDir != 0 && bb.get(newRow, newCol).rowDir != this.rowDir)
            return true;
        
        return false;
    }

    public void move(int colDir){
        if(!canMove(colDir))
            return;
        ((BreakthroughBoard)board).movePiece(r, c, r + rowDir, c + colDir);
        r += rowDir;
        c += colDir;
    }
}
import java.util.ArrayList;

public class TicTacBoard extends GameBoard {
    private int numTurns;
    protected boolean tied;

    public TicTacBoard() {
        super(3, 3);
        numTurns = 0;
        tied = false;
    }

    @Override
    public boolean canAdd(int r, int c){
        return super.canAdd(r, c) && g[r][c] == null;
    }

    @Override
    public void add(GamePiece a, int r, int c){
        if(canAdd(r, c)){
            super.add(a, r, c);
            numTurns++;

            if(numTurns == 8){
              // find the last remaining piece and place a predictive move on it
              GamePiece lastMove = new GamePiece();

              for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                  if (canAdd(row, col)){
                    // this will now be the "next" player since the number of turns has
                    // already been incremented
                    String nextPlayer = currentPlayer();
                    // has to be a GamePiece since instantiating a TicTacPiece would change the 
                    // symbol for the next player
                    lastMove = new GamePiece(row, col, nextPlayer);
                    add(lastMove, row, col);
                    // lastMove.addSelfToBoard(this); // same as above
                  }
                }
              }
              if(isOver())
                  tied = true;
              else
                super.remove(lastMove.getRow(), lastMove.getCol());
            }
        }
    }

    public String currentPlayer() {
        return numTurns %2 == 0 ? "X" : "O";
    }

    public boolean isWinner(){
        return isWinner("X") || isWinner("O");
    }

    public boolean isOver(){
        return isWinner() || numTurns == 9 || tied;
    }

    public boolean isWinner(String p){
        if (winCheck(p, 0,0, 0,1, 0,2)) return true;
        if (winCheck(p, 1,0, 1,1, 1,2)) return true;
        if (winCheck(p, 2,0, 2,1, 2,2)) return true;
        if (winCheck(p, 0,0, 1,0, 2,0)) return true;
        if (winCheck(p, 0,1, 1,1, 2,1)) return true;
        if (winCheck(p, 0,2, 1,2, 2,2)) return true;
        if (winCheck(p, 0,0, 1,1, 2,2)) return true;
        if (winCheck(p, 2,0, 1,1, 0,2)) return true;
        return false;
    }

    // see if three elements in the 2D array have the same values
    private boolean winCheck(String p, int a, int b,
        int c, int d, int e, int f){
        if (g[a][b] == null || g[c][d] == null
            || g[e][f] == null)
            return false;
        String A = g[a][b].getSymbol();
        String B = g[c][d].getSymbol();
        String C = g[e][f].getSymbol();
        return (p.equals(A) && A.equals(B) && B.equals(C));
    }
}
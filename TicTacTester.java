/**
 * Checks the TicTacBoard class for a successful Tie situation
 */

public class TicTacTester {
  public static void main( String[] args) {
    TicTacBoard board = new TicTacBoard();

    int[][] moves = {
      {0, 0},
      {0, 1},
      {1, 0},
      {2, 0},
      {2, 1},
      {1, 1},
      {2, 2},
      {1, 2}
    };

    for(int i = 0; i < moves.length; i++){
      TicTacPiece p = new TicTacPiece(moves[i][0], moves[i][1]);
      p.addSelfToBoard(board);
    }

    if(board.isOver()){
      System.out.println("successful exit condition");
    } else {
      System.out.println("unsuccesful exit condition");
    }
  }
}
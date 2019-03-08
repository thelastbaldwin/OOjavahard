/**
 * Checks the TicTacBoard class for a successful Tie situation
 */

public class TicTacTester {
  public static void main( String[] args) {
    TicTacBoard board = new TicTacBoard();

    int[][] moves = {
      {0, 0}, // X
      {0, 1}, // O
      {1, 0}, // X
      {2, 0}, // O
      {2, 1}, // X
      {1, 1}, // O
      {2, 2}, // X
      {1, 2} // O
    };

    for(int i = 0; i < moves.length; i++){
      TicTacPiece p = new TicTacPiece(moves[i][0], moves[i][1]);
      p.addSelfToBoard(board);
    }

    // Expect upper right corner to have an X
    System.out.println(board);
    if(board.isOver()){
      System.out.println("successful exit condition");
    } else {
      System.out.println("unsuccesful exit condition");
    }
  }
}
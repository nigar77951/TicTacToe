public class TicTacToeGame {

    public void boardCreation() {
        char[] board= new char[9];
        for(int i=1;i<9;i++)
        {
            System.out.println(" "+board[i]);
        }
    }

	public static void main(String[] args) {
        System.out.println("...wlcm to tic tac toe game...");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.boardCreation();

	}

}

import java.util.*;
public class TicTacToeGame {

	public String Player, Computer;

    public void boardCreation() {
        char[] board= new char[9];
        for(int i=1;i<9;i++)
        {
            System.out.println(" "+board[i]);
        }
    }

    public void xorO(char choice) {

    	if(choice == 'x') {
    		Player="o";
    	}
    	else if(choice == 'o') {
    		Computer = "x";
    	}
    	else {
    		System.out.println("not a valid choice");
    	}

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("...wlcm to tic tac toe game...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 'o' or 'x'");
        char choice = sc.next().charAt(0);

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.boardCreation();
        ticTacToeGame.xorO(choice);
	}
}

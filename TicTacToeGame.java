import java.util.*;
public class TicTacToeGame {

	public char Player, Computer;

/*    public void boardCreation() {
        char[] board= new char[9];
        for(int i=1;i<9;i++)
        {
            System.out.println("");
        }
    }*/

    public void xorO() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 'o' or 'x'");
        char choice = sc.next().charAt(0);

    	if(choice == 'x') {
    		Player = 'o';
    	}
    	else if(choice == 'o') {
    		Computer = 'x';
    	} else {
    		System.out.println("invalid");
    	}
     }

    public void showBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("+---");
            }
            System.out.print("+\n");
            for (int j = 0; j < 3; j++) {
                System.out.print("|"+ "   ");
            }
            System.out.print("|\n");
        }
        System.out.println("+---+---+---+");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("...wlcm to tic tac toe game...");

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 'o' or 'x'");
        char choice = sc.next().charAt(0);*/

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        //ticTacToeGame.boardCreation();
        ticTacToeGame.xorO();
        ticTacToeGame.showBoard();
	}
}

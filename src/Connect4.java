import java.util.Scanner;

public class Connect4 {
	static void printBoard(String[][] gameBoard) {
		for (int y=0;y<6;y=y+1) {
			for (int x=0;x<7;x=x+1) {

				System.out.print("["+gameBoard[y][x]+"]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to 4 in a row! get four in a row to win!");
		String[][] gameBoard =new String [6][7];
		for (int y=0;y<6;y=y+1) {
			for (int x=0;x<7;x=x+1) {

				gameBoard[y][x]=" ";

			}
		}

		String whoseTurn = "X";
		Scanner s = new Scanner(System.in);
		int turn=0;
		if (turn<42) {
			boolean gameOn=true;

			while (gameOn){
				printBoard(gameBoard);
				System.out.println("Choose an x coordinate between 1 and 7 for your marker, "+whoseTurn+"!");
				int newPlay = s.nextInt();
				if (gameBoard[0][newPlay-1]==" ") {
					turn=turn+1;
					int layer = 0;
					while (layer<5 && gameBoard[layer+1][newPlay-1] == " ") {
						layer++;

					}
					gameBoard[layer][newPlay-1] = whoseTurn;
					for (int y=0;y<6;y=y+1) {
						for (int x=0;x<4;x=x+1) {
							if (gameBoard[y][x]==whoseTurn && gameBoard[y][x+1]==whoseTurn && gameBoard[y][x+2]==whoseTurn && gameBoard[y][x+3]==whoseTurn) {
								gameOn = false;
								System.out.println(whoseTurn+" wins! Congratulations!");
								printBoard(gameBoard);
							}
						}

					}
					for (int y=0;y<3;y=y+1) {
						for (int x=0;x<7;x=x+1) {
							if (gameBoard[y][x]==whoseTurn && gameBoard[y+1][x]==whoseTurn && gameBoard[y+2][x]==whoseTurn && gameBoard[y+3][x]==whoseTurn) {
								gameOn = false;
								System.out.println(whoseTurn+" wins! Congratulations!");
								printBoard(gameBoard);
							}
						}
					}
					for (int y=0;y<3;y=y+1) {
						for (int x=0;x<4;x=x+1) {
							if (gameBoard[y][x]==whoseTurn && gameBoard[y+1][x+1]==whoseTurn && gameBoard[y+2][x+2]==whoseTurn && gameBoard[y+3][x+3]==whoseTurn) {
								gameOn = false;
								System.out.println(whoseTurn+" wins! Congratulations!");
								printBoard(gameBoard);
							}
						}
					}
					for (int y=3;y<6;y=y+1) {
						for (int x=0;x<4;x=x+1) {
							if (gameBoard[y][x]==whoseTurn && gameBoard[y-1][x+1]==whoseTurn && gameBoard[y-2][x+2]==whoseTurn && gameBoard[y-3][x+3]==whoseTurn) {
								gameOn = false;
								System.out.println(whoseTurn+" wins! Congratulations!");
								printBoard(gameBoard);
							}
						}
					}


					if (whoseTurn=="X")
						whoseTurn = "O";
					else if (whoseTurn=="O")
						whoseTurn ="X";
				}

				else {
					System.out.println("you have tried to place in a spot where there"
							+ " is already something placed."
							+ " Your turn has been invalidated.");
				}

				if (turn==42) {
					gameOn = false;
					System.out.println ("The game has tied. great job at accomplishing nothing!");
					printBoard(gameBoard);
				}



			}

		}
	}

}
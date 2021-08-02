# Summertech
Yes
import java.util.Scanner;

public class Connect4 {

	public static void main(String[] args) {
		String gameBoard[][] =new String [6][7];
		for (int y=0;y<6;y=y+1) {
			for (int x=0;x<7;x=x+1) {
		
				gameBoard[y][x]=" ";
				
			}
		}
		for (int y=0;y<6;y=y+1) {
			for (int x=0;x<7;x=x+1) {
		
				System.out.print("["+gameBoard[y][x]+"]");
			}
			System.out.println();
		}
		Scanner s = new Scanner(System.in);
		boolean gameOn = true;
		while (gameOn){
			System.out.println("Choose an x coordinate between 1 and 7 for your marker!");
		
			
	
		}
	}

}

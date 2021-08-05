
public class arrays2d {

	public static void main(String[] args) {
		String[][] array =new String[3][3];
		for (int x=0;x<3;x=x+1) {

			for (int y=0;y<3;y=y+1) {
				array[y][x] = " - ";
			}
		}
		for (int y=0;y<3;y=y+1) {
			for (int x=0;x<3;x=x+1) {
				System.out.print(array[x][y]);
			}
			System.out.println();
		}

	}

}

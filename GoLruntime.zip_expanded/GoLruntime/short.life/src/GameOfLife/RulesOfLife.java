package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;
 
public class RulesOfLife {
	public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
		String[] x = "1 2 3".split(" ");
		String[] y = "1 2 3".split(" ");
		for (int i = 0; i < x.length; i += 1) {
			survivingCells.add(new Point(Integer.parseInt(x[i]), Integer.parseInt(y[i])));
		}
		
     	// Iterate through the array, follow game of life rules
    	 for (int i=1; i<gameBoard.length-1; i++) {
	         for (int j=1; j<gameBoard[0].length-1; j++) {
	             int surrounding = 0;
	             if (gameBoard[i-1][j-1]) { surrounding++; }
	             if (gameBoard[i-1][j])   { surrounding++; }
	             if (gameBoard[i-1][j+1]) { surrounding++; }
	             if (gameBoard[i][j-1])   { surrounding++; }
	             if (gameBoard[i][j+1])   { surrounding++; }
	             if (gameBoard[i+1][j-1]) { surrounding++; }
	             if (gameBoard[i+1][j])   { surrounding++; }
	             if (gameBoard[i+1][j+1]) { surrounding++; }
	             /* only code for surving cells, so no rule if result is dead cell */
	              /* rule B3 */
	              if ((gameBoard[i][j]) && (surrounding == 2)){
	              	survivingCells.add(new Point(i-1,j-1));
	              }
	              if ((gameBoard[i][j]) && (surrounding == 3)){
	              	survivingCells.add(new Point(i-1,j-1));
	              }
	              if ((!gameBoard[i][j]) && (surrounding == 3)){
	              	survivingCells.add(new Point(i-1,j-1));
	              }
	         }
	     }
	}
 
}

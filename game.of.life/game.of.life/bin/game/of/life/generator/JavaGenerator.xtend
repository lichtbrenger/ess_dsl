package game.of.life.generator

import game.of.life.lifeDsl.Model
import game.of.life.lifeDsl.DieAliveUnit

class JavaGenerator {
	def static toJava(Model root)'''
package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;
 
public class RulesOfLife {
	public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {
		«initialAlive(root)»
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
	              «evolutionRules(root)»
	         }
	     }
	}
 
}
	 '''
	 
 def static initialAlive(Model root)'''
  «FOR grid: root.grids»
  	survivingCells.add(new Point(«grid.row»-1, «grid.column»-1));
  «ENDFOR» 
  
'''

 def static evolutionRules(Model root)'''
  «FOR rule: root.rules»
  	«IF rule.name === DieAliveUnit::LIVE»
    if ((gameBoard[i][j]) && (surrounding «rule.operator» «rule.numberOfLiveNeighbors»)){
    	survivingCells.add(new Point(i-1,j-1));
    }
    «ELSEIF rule.name === DieAliveUnit::BECOME_ALIVE»
        if ((!gameBoard[i][j]) && (surrounding «rule.operator» «rule.numberOfLiveNeighbors»)){
        	survivingCells.add(new Point(i-1,j-1));
        }
    «ENDIF»
   «ENDFOR» 
 '''
}

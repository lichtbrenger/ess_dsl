package game.of.life.generator;

import game.of.life.lifeDsl.DieAliveUnit;
import game.of.life.lifeDsl.EvolutionRules;
import game.of.life.lifeDsl.Grid;
import game.of.life.lifeDsl.Model;
import game.of.life.lifeDsl.Operator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaGenerator {
  public static CharSequence toJava(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _initialAlive = JavaGenerator.initialAlive(root);
    _builder.append(_initialAlive, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("     \t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("    \t ");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("\t         ");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("/* only code for surving cells, so no rule if result is dead cell */");
    _builder.newLine();
    _builder.append("\t              ");
    _builder.append("/* rule B3 */");
    _builder.newLine();
    _builder.append("\t              ");
    CharSequence _evolutionRules = JavaGenerator.evolutionRules(root);
    _builder.append(_evolutionRules, "\t              ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t         ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence initialAlive(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Grid> _grids = root.getGrids();
      for(final Grid grid : _grids) {
        _builder.append("survivingCells.add(new Point(");
        int _row = grid.getRow();
        _builder.append(_row);
        _builder.append("-1, ");
        int _column = grid.getColumn();
        _builder.append(_column);
        _builder.append("-1));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence evolutionRules(final Model root) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EvolutionRules> _rules = root.getRules();
      for(final EvolutionRules rule : _rules) {
        {
          DieAliveUnit _name = rule.getName();
          boolean _tripleEquals = (_name == DieAliveUnit.LIVE);
          if (_tripleEquals) {
            _builder.append("if ((gameBoard[i][j]) && (surrounding ");
            Operator _operator = rule.getOperator();
            _builder.append(_operator);
            _builder.append(" ");
            int _numberOfLiveNeighbors = rule.getNumberOfLiveNeighbors();
            _builder.append(_numberOfLiveNeighbors);
            _builder.append(")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          } else {
            DieAliveUnit _name_1 = rule.getName();
            boolean _tripleEquals_1 = (_name_1 == DieAliveUnit.BECOME_ALIVE);
            if (_tripleEquals_1) {
              _builder.append("if ((!gameBoard[i][j]) && (surrounding ");
              Operator _operator_1 = rule.getOperator();
              _builder.append(_operator_1);
              _builder.append(" ");
              int _numberOfLiveNeighbors_1 = rule.getNumberOfLiveNeighbors();
              _builder.append(_numberOfLiveNeighbors_1);
              _builder.append(")){");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("survivingCells.add(new Point(i-1,j-1));");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
}

/**
 * generated by Xtext 2.25.0
 */
package game.of.life.validation;

import com.google.common.base.Objects;
import game.of.life.lifeDsl.DieAliveUnit;
import game.of.life.lifeDsl.EvolutionRules;
import game.of.life.lifeDsl.Grid;
import game.of.life.lifeDsl.Model;
import game.of.life.lifeDsl.OperatorUnit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LifeDslValidator extends AbstractLifeDslValidator {
  @Check
  public void checkDoubleInitialGrids(final Model root) {
    EList<Grid> glist = root.getGrids();
    for (int i = 0; (i < glist.size()); i++) {
      for (int j = (i + 1); (j < glist.size()); j++) {
        if ((Integer.valueOf(glist.get(i).getRow()).equals(Integer.valueOf(glist.get(j).getRow())) && Integer.valueOf(glist.get(i).getColumn()).equals(Integer.valueOf(glist.get(j).getColumn())))) {
          this.error("Double grid", null);
        }
      }
    }
  }
  
  @Check
  public void checkDieAliveUnit(final EvolutionRules rules) {
    if ((rules != null)) {
      DieAliveUnit _name = rules.getName();
      if (_name != null) {
        switch (_name) {
          case DIE:
            if (((rules.getNumberOfLiveNeighbors() == 3) && 
              (Objects.equal(rules.getOperator(), OperatorUnit.L) || Objects.equal(rules.getOperator(), OperatorUnit.EQ)))) {
              this.error("Neighbors less than or equal to 3 not\r\n                                allowed to die", null);
            }
            break;
          case LIVE:
            if (((rules.getNumberOfLiveNeighbors() != 2) && (rules.getNumberOfLiveNeighbors() != 3))) {
              this.error("Neighbors less than 2 and more than 3 not\r\n                                allowed to live", null);
            }
            break;
          case BECOME_ALIVE:
            int _numberOfLiveNeighbors = rules.getNumberOfLiveNeighbors();
            boolean _notEquals = (_numberOfLiveNeighbors != 3);
            if (_notEquals) {
              this.info("Maybe rewrite to live or die", null);
            }
            break;
          default:
            break;
        }
      }
    }
  }
  
  @Check
  public void checkEvolutionRules(final Model root) {
    EList<EvolutionRules> rlist = root.getRules();
    for (int i = 0; (i < rlist.size()); i++) {
      for (int j = (i + 1); (j < rlist.size()); j++) {
        if (((rlist.get(i).getName().equals(rlist.get(j).getName()) && rlist.get(i).getOperator().equals(rlist.get(j).getOperator())) && Integer.valueOf(rlist.get(i).getNumberOfLiveNeighbors()).equals(Integer.valueOf(rlist.get(j).getNumberOfLiveNeighbors())))) {
          this.error("Double rule", null);
        }
      }
    }
  }
  
  @Check
  public void checkGrid(final Grid grid) {
    if (((grid.getRow() < 0) || (grid.getColumn() < 0))) {
      this.error("Cell location can not be below 0", null);
    }
  }
  
  @Check
  public void checkNeighbours(final EvolutionRules rules) {
    int _numberOfLiveNeighbors = rules.getNumberOfLiveNeighbors();
    boolean _greaterThan = (_numberOfLiveNeighbors > 8);
    if (_greaterThan) {
      this.error("It is not possible to have more than 8 live neighbors", null);
    }
  }
}

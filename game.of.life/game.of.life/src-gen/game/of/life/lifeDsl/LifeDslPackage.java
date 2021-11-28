/**
 * generated by Xtext 2.25.0
 */
package game.of.life.lifeDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see game.of.life.lifeDsl.LifeDslFactory
 * @model kind="package"
 * @generated
 */
public interface LifeDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lifeDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.of.game/life/LifeDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lifeDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LifeDslPackage eINSTANCE = game.of.life.lifeDsl.impl.LifeDslPackageImpl.init();

  /**
   * The meta object id for the '{@link game.of.life.lifeDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see game.of.life.lifeDsl.impl.ModelImpl
   * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Grids</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GRIDS = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link game.of.life.lifeDsl.impl.GridImpl <em>Grid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see game.of.life.lifeDsl.impl.GridImpl
   * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getGrid()
   * @generated
   */
  int GRID = 1;

  /**
   * The feature id for the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__ROW = 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__COLUMN = 1;

  /**
   * The number of structural features of the '<em>Grid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link game.of.life.lifeDsl.impl.EvolutionRulesImpl <em>Evolution Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see game.of.life.lifeDsl.impl.EvolutionRulesImpl
   * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getEvolutionRules()
   * @generated
   */
  int EVOLUTION_RULES = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLUTION_RULES__NAME = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLUTION_RULES__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Number Of Live Neighbors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLUTION_RULES__NUMBER_OF_LIVE_NEIGHBORS = 2;

  /**
   * The number of structural features of the '<em>Evolution Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLUTION_RULES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link game.of.life.lifeDsl.OperatorUnit <em>Operator Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see game.of.life.lifeDsl.OperatorUnit
   * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getOperatorUnit()
   * @generated
   */
  int OPERATOR_UNIT = 3;

  /**
   * The meta object id for the '{@link game.of.life.lifeDsl.DieAliveUnit <em>Die Alive Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see game.of.life.lifeDsl.DieAliveUnit
   * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getDieAliveUnit()
   * @generated
   */
  int DIE_ALIVE_UNIT = 4;


  /**
   * Returns the meta object for class '{@link game.of.life.lifeDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see game.of.life.lifeDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link game.of.life.lifeDsl.Model#getGrids <em>Grids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grids</em>'.
   * @see game.of.life.lifeDsl.Model#getGrids()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Grids();

  /**
   * Returns the meta object for the containment reference list '{@link game.of.life.lifeDsl.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see game.of.life.lifeDsl.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for class '{@link game.of.life.lifeDsl.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid</em>'.
   * @see game.of.life.lifeDsl.Grid
   * @generated
   */
  EClass getGrid();

  /**
   * Returns the meta object for the attribute '{@link game.of.life.lifeDsl.Grid#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row</em>'.
   * @see game.of.life.lifeDsl.Grid#getRow()
   * @see #getGrid()
   * @generated
   */
  EAttribute getGrid_Row();

  /**
   * Returns the meta object for the attribute '{@link game.of.life.lifeDsl.Grid#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see game.of.life.lifeDsl.Grid#getColumn()
   * @see #getGrid()
   * @generated
   */
  EAttribute getGrid_Column();

  /**
   * Returns the meta object for class '{@link game.of.life.lifeDsl.EvolutionRules <em>Evolution Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evolution Rules</em>'.
   * @see game.of.life.lifeDsl.EvolutionRules
   * @generated
   */
  EClass getEvolutionRules();

  /**
   * Returns the meta object for the attribute '{@link game.of.life.lifeDsl.EvolutionRules#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see game.of.life.lifeDsl.EvolutionRules#getName()
   * @see #getEvolutionRules()
   * @generated
   */
  EAttribute getEvolutionRules_Name();

  /**
   * Returns the meta object for the attribute '{@link game.of.life.lifeDsl.EvolutionRules#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see game.of.life.lifeDsl.EvolutionRules#getOperator()
   * @see #getEvolutionRules()
   * @generated
   */
  EAttribute getEvolutionRules_Operator();

  /**
   * Returns the meta object for the attribute '{@link game.of.life.lifeDsl.EvolutionRules#getNumberOfLiveNeighbors <em>Number Of Live Neighbors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Live Neighbors</em>'.
   * @see game.of.life.lifeDsl.EvolutionRules#getNumberOfLiveNeighbors()
   * @see #getEvolutionRules()
   * @generated
   */
  EAttribute getEvolutionRules_NumberOfLiveNeighbors();

  /**
   * Returns the meta object for enum '{@link game.of.life.lifeDsl.OperatorUnit <em>Operator Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator Unit</em>'.
   * @see game.of.life.lifeDsl.OperatorUnit
   * @generated
   */
  EEnum getOperatorUnit();

  /**
   * Returns the meta object for enum '{@link game.of.life.lifeDsl.DieAliveUnit <em>Die Alive Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Die Alive Unit</em>'.
   * @see game.of.life.lifeDsl.DieAliveUnit
   * @generated
   */
  EEnum getDieAliveUnit();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LifeDslFactory getLifeDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link game.of.life.lifeDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see game.of.life.lifeDsl.impl.ModelImpl
     * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Grids</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GRIDS = eINSTANCE.getModel_Grids();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '{@link game.of.life.lifeDsl.impl.GridImpl <em>Grid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see game.of.life.lifeDsl.impl.GridImpl
     * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getGrid()
     * @generated
     */
    EClass GRID = eINSTANCE.getGrid();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID__ROW = eINSTANCE.getGrid_Row();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID__COLUMN = eINSTANCE.getGrid_Column();

    /**
     * The meta object literal for the '{@link game.of.life.lifeDsl.impl.EvolutionRulesImpl <em>Evolution Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see game.of.life.lifeDsl.impl.EvolutionRulesImpl
     * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getEvolutionRules()
     * @generated
     */
    EClass EVOLUTION_RULES = eINSTANCE.getEvolutionRules();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVOLUTION_RULES__NAME = eINSTANCE.getEvolutionRules_Name();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVOLUTION_RULES__OPERATOR = eINSTANCE.getEvolutionRules_Operator();

    /**
     * The meta object literal for the '<em><b>Number Of Live Neighbors</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVOLUTION_RULES__NUMBER_OF_LIVE_NEIGHBORS = eINSTANCE.getEvolutionRules_NumberOfLiveNeighbors();

    /**
     * The meta object literal for the '{@link game.of.life.lifeDsl.OperatorUnit <em>Operator Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see game.of.life.lifeDsl.OperatorUnit
     * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getOperatorUnit()
     * @generated
     */
    EEnum OPERATOR_UNIT = eINSTANCE.getOperatorUnit();

    /**
     * The meta object literal for the '{@link game.of.life.lifeDsl.DieAliveUnit <em>Die Alive Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see game.of.life.lifeDsl.DieAliveUnit
     * @see game.of.life.lifeDsl.impl.LifeDslPackageImpl#getDieAliveUnit()
     * @generated
     */
    EEnum DIE_ALIVE_UNIT = eINSTANCE.getDieAliveUnit();

  }

} //LifeDslPackage

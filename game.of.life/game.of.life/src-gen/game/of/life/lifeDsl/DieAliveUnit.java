/**
 * generated by Xtext 2.25.0
 */
package game.of.life.lifeDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Die Alive Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see game.of.life.lifeDsl.LifeDslPackage#getDieAliveUnit()
 * @model
 * @generated
 */
public enum DieAliveUnit implements Enumerator
{
  /**
   * The '<em><b>DIE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIE_VALUE
   * @generated
   * @ordered
   */
  DIE(0, "DIE", "die"),

  /**
   * The '<em><b>LIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIVE_VALUE
   * @generated
   * @ordered
   */
  LIVE(1, "LIVE", "live"),

  /**
   * The '<em><b>BECOME ALIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BECOME_ALIVE_VALUE
   * @generated
   * @ordered
   */
  BECOME_ALIVE(2, "BECOME_ALIVE", "become alive");

  /**
   * The '<em><b>DIE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIE
   * @model literal="die"
   * @generated
   * @ordered
   */
  public static final int DIE_VALUE = 0;

  /**
   * The '<em><b>LIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIVE
   * @model literal="live"
   * @generated
   * @ordered
   */
  public static final int LIVE_VALUE = 1;

  /**
   * The '<em><b>BECOME ALIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BECOME_ALIVE
   * @model literal="become alive"
   * @generated
   * @ordered
   */
  public static final int BECOME_ALIVE_VALUE = 2;

  /**
   * An array of all the '<em><b>Die Alive Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DieAliveUnit[] VALUES_ARRAY =
    new DieAliveUnit[]
    {
      DIE,
      LIVE,
      BECOME_ALIVE,
    };

  /**
   * A public read-only list of all the '<em><b>Die Alive Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DieAliveUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Die Alive Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DieAliveUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DieAliveUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Die Alive Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DieAliveUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DieAliveUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Die Alive Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DieAliveUnit get(int value)
  {
    switch (value)
    {
      case DIE_VALUE: return DIE;
      case LIVE_VALUE: return LIVE;
      case BECOME_ALIVE_VALUE: return BECOME_ALIVE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DieAliveUnit(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DieAliveUnit

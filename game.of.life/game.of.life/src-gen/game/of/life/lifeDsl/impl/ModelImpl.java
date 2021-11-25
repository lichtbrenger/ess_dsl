/**
 * generated by Xtext 2.25.0
 */
package game.of.life.lifeDsl.impl;

import game.of.life.lifeDsl.EvolutionRules;
import game.of.life.lifeDsl.InitialGrid;
import game.of.life.lifeDsl.LifeDslPackage;
import game.of.life.lifeDsl.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.of.life.lifeDsl.impl.ModelImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link game.of.life.lifeDsl.impl.ModelImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrid()
   * @generated
   * @ordered
   */
  protected InitialGrid grid;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<EvolutionRules> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LifeDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitialGrid getGrid()
  {
    return grid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGrid(InitialGrid newGrid, NotificationChain msgs)
  {
    InitialGrid oldGrid = grid;
    grid = newGrid;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LifeDslPackage.MODEL__GRID, oldGrid, newGrid);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGrid(InitialGrid newGrid)
  {
    if (newGrid != grid)
    {
      NotificationChain msgs = null;
      if (grid != null)
        msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LifeDslPackage.MODEL__GRID, null, msgs);
      if (newGrid != null)
        msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LifeDslPackage.MODEL__GRID, null, msgs);
      msgs = basicSetGrid(newGrid, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LifeDslPackage.MODEL__GRID, newGrid, newGrid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EvolutionRules> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<EvolutionRules>(EvolutionRules.class, this, LifeDslPackage.MODEL__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LifeDslPackage.MODEL__GRID:
        return basicSetGrid(null, msgs);
      case LifeDslPackage.MODEL__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LifeDslPackage.MODEL__GRID:
        return getGrid();
      case LifeDslPackage.MODEL__RULES:
        return getRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LifeDslPackage.MODEL__GRID:
        setGrid((InitialGrid)newValue);
        return;
      case LifeDslPackage.MODEL__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends EvolutionRules>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LifeDslPackage.MODEL__GRID:
        setGrid((InitialGrid)null);
        return;
      case LifeDslPackage.MODEL__RULES:
        getRules().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LifeDslPackage.MODEL__GRID:
        return grid != null;
      case LifeDslPackage.MODEL__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl

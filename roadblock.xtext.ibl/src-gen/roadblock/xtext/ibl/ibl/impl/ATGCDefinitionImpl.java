/**
 */
package roadblock.xtext.ibl.ibl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import roadblock.xtext.ibl.ibl.ATGCDefinition;
import roadblock.xtext.ibl.ibl.IblPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATGC Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATGCDefinitionImpl extends FunctionBodyMemberImpl implements ATGCDefinition
{
  /**
   * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected static final String COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected String command = COMMAND_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<String> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ATGCDefinitionImpl()
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
    return IblPackage.Literals.ATGC_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(String newCommand)
  {
    String oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.ATGC_DEFINITION__COMMAND, oldCommand, command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EDataTypeEList<String>(String.class, this, IblPackage.ATGC_DEFINITION__ARGUMENTS);
    }
    return arguments;
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
      case IblPackage.ATGC_DEFINITION__COMMAND:
        return getCommand();
      case IblPackage.ATGC_DEFINITION__ARGUMENTS:
        return getArguments();
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
      case IblPackage.ATGC_DEFINITION__COMMAND:
        setCommand((String)newValue);
        return;
      case IblPackage.ATGC_DEFINITION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends String>)newValue);
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
      case IblPackage.ATGC_DEFINITION__COMMAND:
        setCommand(COMMAND_EDEFAULT);
        return;
      case IblPackage.ATGC_DEFINITION__ARGUMENTS:
        getArguments().clear();
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
      case IblPackage.ATGC_DEFINITION__COMMAND:
        return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
      case IblPackage.ATGC_DEFINITION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (command: ");
    result.append(command);
    result.append(", arguments: ");
    result.append(arguments);
    result.append(')');
    return result.toString();
  }

} //ATGCDefinitionImpl

/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Host#getBanco <em>Banco</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getHost()
 * @model
 * @generated
 */
public interface Host extends EObject {
	/**
	 * Returns the value of the '<em><b>Banco</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Banco}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banco</em>' containment reference list.
	 * @see sql.SqlPackage#getHost_Banco()
	 * @model containment="true"
	 * @generated
	 */
	EList<Banco> getBanco();

} // Host

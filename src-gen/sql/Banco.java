/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Banco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Banco#getNome <em>Nome</em>}</li>
 *   <li>{@link sql.Banco#getTabela <em>Tabela</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getBanco()
 * @model
 * @generated
 */
public interface Banco extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see sql.SqlPackage#getBanco_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sql.Banco#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Tabela</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Tabela}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabela</em>' containment reference list.
	 * @see sql.SqlPackage#getBanco_Tabela()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tabela> getTabela();

} // Banco

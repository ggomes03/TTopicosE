/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chave Estrangeira</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.ChaveEstrangeira#getColuna <em>Coluna</em>}</li>
 *   <li>{@link sql.ChaveEstrangeira#getTabela <em>Tabela</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getChaveEstrangeira()
 * @model
 * @generated
 */
public interface ChaveEstrangeira extends EObject {
	/**
	 * Returns the value of the '<em><b>Coluna</b></em>' reference list.
	 * The list contents are of type {@link sql.Coluna}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coluna</em>' reference list.
	 * @see sql.SqlPackage#getChaveEstrangeira_Coluna()
	 * @model
	 * @generated
	 */
	EList<Coluna> getColuna();

	/**
	 * Returns the value of the '<em><b>Tabela</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabela</em>' reference.
	 * @see #setTabela(Tabela)
	 * @see sql.SqlPackage#getChaveEstrangeira_Tabela()
	 * @model
	 * @generated
	 */
	Tabela getTabela();

	/**
	 * Sets the value of the '{@link sql.ChaveEstrangeira#getTabela <em>Tabela</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabela</em>' reference.
	 * @see #getTabela()
	 * @generated
	 */
	void setTabela(Tabela value);

} // ChaveEstrangeira

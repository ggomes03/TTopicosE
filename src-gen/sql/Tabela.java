/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabela</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Tabela#getNome <em>Nome</em>}</li>
 *   <li>{@link sql.Tabela#getColuna <em>Coluna</em>}</li>
 *   <li>{@link sql.Tabela#getChaveprimaria <em>Chaveprimaria</em>}</li>
 *   <li>{@link sql.Tabela#getChaveestrangeira <em>Chaveestrangeira</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getTabela()
 * @model
 * @generated
 */
public interface Tabela extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see sql.SqlPackage#getTabela_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sql.Tabela#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Coluna</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Coluna}.
	 * It is bidirectional and its opposite is '{@link sql.Coluna#getTabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coluna</em>' containment reference list.
	 * @see sql.SqlPackage#getTabela_Coluna()
	 * @see sql.Coluna#getTabela
	 * @model opposite="tabela" containment="true"
	 * @generated
	 */
	EList<Coluna> getColuna();

	/**
	 * Returns the value of the '<em><b>Chaveprimaria</b></em>' containment reference list.
	 * The list contents are of type {@link sql.ChavePrimaria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chaveprimaria</em>' containment reference list.
	 * @see sql.SqlPackage#getTabela_Chaveprimaria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ChavePrimaria> getChaveprimaria();

	/**
	 * Returns the value of the '<em><b>Chaveestrangeira</b></em>' containment reference list.
	 * The list contents are of type {@link sql.ChaveEstrangeira}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chaveestrangeira</em>' containment reference list.
	 * @see sql.SqlPackage#getTabela_Chaveestrangeira()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChaveEstrangeira> getChaveestrangeira();

} // Tabela

/**
 */
package sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coluna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Coluna#getNome <em>Nome</em>}</li>
 *   <li>{@link sql.Coluna#getTipo_dado <em>Tipo dado</em>}</li>
 *   <li>{@link sql.Coluna#isNulo <em>Nulo</em>}</li>
 *   <li>{@link sql.Coluna#getTabela <em>Tabela</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getColuna()
 * @model
 * @generated
 */
public interface Coluna extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see sql.SqlPackage#getColuna_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link sql.Coluna#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Tipo dado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo dado</em>' attribute.
	 * @see #setTipo_dado(String)
	 * @see sql.SqlPackage#getColuna_Tipo_dado()
	 * @model
	 * @generated
	 */
	String getTipo_dado();

	/**
	 * Sets the value of the '{@link sql.Coluna#getTipo_dado <em>Tipo dado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo dado</em>' attribute.
	 * @see #getTipo_dado()
	 * @generated
	 */
	void setTipo_dado(String value);

	/**
	 * Returns the value of the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nulo</em>' attribute.
	 * @see #setNulo(boolean)
	 * @see sql.SqlPackage#getColuna_Nulo()
	 * @model
	 * @generated
	 */
	boolean isNulo();

	/**
	 * Sets the value of the '{@link sql.Coluna#isNulo <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nulo</em>' attribute.
	 * @see #isNulo()
	 * @generated
	 */
	void setNulo(boolean value);

	/**
	 * Returns the value of the '<em><b>Tabela</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sql.Tabela#getColuna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabela</em>' container reference.
	 * @see #setTabela(Tabela)
	 * @see sql.SqlPackage#getColuna_Tabela()
	 * @see sql.Tabela#getColuna
	 * @model opposite="coluna" transient="false"
	 * @generated
	 */
	Tabela getTabela();

	/**
	 * Sets the value of the '{@link sql.Coluna#getTabela <em>Tabela</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabela</em>' container reference.
	 * @see #getTabela()
	 * @generated
	 */
	void setTabela(Tabela value);

} // Coluna

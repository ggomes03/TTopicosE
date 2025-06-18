/**
 */
package entidades;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entidades.Atributo#getNome <em>Nome</em>}</li>
 *   <li>{@link entidades.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link entidades.Atributo#isEhChavePrimaria <em>Eh Chave Primaria</em>}</li>
 * </ul>
 *
 * @see entidades.UmlPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see entidades.UmlPackage#getAtributo_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link entidades.Atributo#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see entidades.UmlPackage#getAtributo_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link entidades.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Eh Chave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eh Chave Primaria</em>' attribute.
	 * @see #setEhChavePrimaria(boolean)
	 * @see entidades.UmlPackage#getAtributo_EhChavePrimaria()
	 * @model
	 * @generated
	 */
	boolean isEhChavePrimaria();

	/**
	 * Sets the value of the '{@link entidades.Atributo#isEhChavePrimaria <em>Eh Chave Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eh Chave Primaria</em>' attribute.
	 * @see #isEhChavePrimaria()
	 * @generated
	 */
	void setEhChavePrimaria(boolean value);

} // Atributo

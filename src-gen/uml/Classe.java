/**
 */
package uml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Classe#getNome <em>Nome</em>}</li>
 *   <li>{@link uml.Classe#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see uml.UmlPackage#getClasse_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link uml.Classe#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see uml.UmlPackage#getClasse_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAttributes();

} // Classe

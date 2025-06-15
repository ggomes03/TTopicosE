/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Elemento#getClasse <em>Classe</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getElemento()
 * @model
 * @generated
 */
public interface Elemento extends EObject {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Classe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' containment reference list.
	 * @see uml.UmlPackage#getElemento_Classe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classe> getClasse();

} // Elemento

/**
 */
package entidades;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelo Entidade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entidades.ModeloEntidade#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link entidades.ModeloEntidade#getRelacionamentos <em>Relacionamentos</em>}</li>
 * </ul>
 *
 * @see entidades.UmlPackage#getModeloEntidade()
 * @model
 * @generated
 */
public interface ModeloEntidade extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link entidades.Entidade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see entidades.UmlPackage#getModeloEntidade_Entidades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidade> getEntidades();

	/**
	 * Returns the value of the '<em><b>Relacionamentos</b></em>' containment reference list.
	 * The list contents are of type {@link entidades.Relacionamento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacionamentos</em>' containment reference list.
	 * @see entidades.UmlPackage#getModeloEntidade_Relacionamentos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacionamento> getRelacionamentos();

} // ModeloEntidade

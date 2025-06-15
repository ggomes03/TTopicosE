/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chave Primaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.ChavePrimaria#getColuna <em>Coluna</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getChavePrimaria()
 * @model
 * @generated
 */
public interface ChavePrimaria extends EObject {
	/**
	 * Returns the value of the '<em><b>Coluna</b></em>' reference list.
	 * The list contents are of type {@link sql.Coluna}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coluna</em>' reference list.
	 * @see sql.SqlPackage#getChavePrimaria_Coluna()
	 * @model required="true"
	 * @generated
	 */
	EList<Coluna> getColuna();

} // ChavePrimaria

/**
 */
package entidades;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see entidades.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlFactory eINSTANCE = entidades.impl.UmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entidade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidade</em>'.
	 * @generated
	 */
	Entidade createEntidade();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Relacionamento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacionamento</em>'.
	 * @generated
	 */
	Relacionamento createRelacionamento();

	/**
	 * Returns a new object of class '<em>Modelo Entidade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelo Entidade</em>'.
	 * @generated
	 */
	ModeloEntidade createModeloEntidade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UmlPackage getUmlPackage();

} //UmlFactory

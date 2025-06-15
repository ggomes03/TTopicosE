/**
 */
package sql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sql.SqlPackage
 * @generated
 */
public interface SqlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlFactory eINSTANCE = sql.impl.SqlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Banco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Banco</em>'.
	 * @generated
	 */
	Banco createBanco();

	/**
	 * Returns a new object of class '<em>Tabela</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabela</em>'.
	 * @generated
	 */
	Tabela createTabela();

	/**
	 * Returns a new object of class '<em>Coluna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coluna</em>'.
	 * @generated
	 */
	Coluna createColuna();

	/**
	 * Returns a new object of class '<em>Chave Primaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chave Primaria</em>'.
	 * @generated
	 */
	ChavePrimaria createChavePrimaria();

	/**
	 * Returns a new object of class '<em>Chave Estrangeira</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chave Estrangeira</em>'.
	 * @generated
	 */
	ChaveEstrangeira createChaveEstrangeira();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	Host createHost();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SqlPackage getSqlPackage();

} //SqlFactory

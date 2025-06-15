/**
 */
package sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlPackage eINSTANCE = sql.impl.SqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sql.impl.BancoImpl <em>Banco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.BancoImpl
	 * @see sql.impl.SqlPackageImpl#getBanco()
	 * @generated
	 */
	int BANCO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANCO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Tabela</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANCO__TABELA = 1;

	/**
	 * The number of structural features of the '<em>Banco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANCO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Banco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANCO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.TabelaImpl <em>Tabela</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.TabelaImpl
	 * @see sql.impl.SqlPackageImpl#getTabela()
	 * @generated
	 */
	int TABELA = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Coluna</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__COLUNA = 1;

	/**
	 * The feature id for the '<em><b>Chaveprimaria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__CHAVEPRIMARIA = 2;

	/**
	 * The feature id for the '<em><b>Chaveestrangeira</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__CHAVEESTRANGEIRA = 3;

	/**
	 * The number of structural features of the '<em>Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.ColunaImpl <em>Coluna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ColunaImpl
	 * @see sql.impl.SqlPackageImpl#getColuna()
	 * @generated
	 */
	int COLUNA = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUNA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Tipo dado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUNA__TIPO_DADO = 1;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUNA__NULO = 2;

	/**
	 * The number of structural features of the '<em>Coluna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUNA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coluna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUNA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.ChavePrimariaImpl <em>Chave Primaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ChavePrimariaImpl
	 * @see sql.impl.SqlPackageImpl#getChavePrimaria()
	 * @generated
	 */
	int CHAVE_PRIMARIA = 3;

	/**
	 * The feature id for the '<em><b>Coluna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_PRIMARIA__COLUNA = 0;

	/**
	 * The number of structural features of the '<em>Chave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_PRIMARIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Chave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_PRIMARIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.ChaveEstrangeiraImpl <em>Chave Estrangeira</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ChaveEstrangeiraImpl
	 * @see sql.impl.SqlPackageImpl#getChaveEstrangeira()
	 * @generated
	 */
	int CHAVE_ESTRANGEIRA = 4;

	/**
	 * The feature id for the '<em><b>Coluna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_ESTRANGEIRA__COLUNA = 0;

	/**
	 * The feature id for the '<em><b>Tabela</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_ESTRANGEIRA__TABELA = 1;

	/**
	 * The number of structural features of the '<em>Chave Estrangeira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_ESTRANGEIRA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chave Estrangeira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAVE_ESTRANGEIRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.HostImpl
	 * @see sql.impl.SqlPackageImpl#getHost()
	 * @generated
	 */
	int HOST = 5;

	/**
	 * The feature id for the '<em><b>Banco</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__BANCO = 0;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link sql.Banco <em>Banco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Banco</em>'.
	 * @see sql.Banco
	 * @generated
	 */
	EClass getBanco();

	/**
	 * Returns the meta object for the attribute '{@link sql.Banco#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sql.Banco#getNome()
	 * @see #getBanco()
	 * @generated
	 */
	EAttribute getBanco_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Banco#getTabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabela</em>'.
	 * @see sql.Banco#getTabela()
	 * @see #getBanco()
	 * @generated
	 */
	EReference getBanco_Tabela();

	/**
	 * Returns the meta object for class '{@link sql.Tabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabela</em>'.
	 * @see sql.Tabela
	 * @generated
	 */
	EClass getTabela();

	/**
	 * Returns the meta object for the attribute '{@link sql.Tabela#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sql.Tabela#getNome()
	 * @see #getTabela()
	 * @generated
	 */
	EAttribute getTabela_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Tabela#getColuna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coluna</em>'.
	 * @see sql.Tabela#getColuna()
	 * @see #getTabela()
	 * @generated
	 */
	EReference getTabela_Coluna();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Tabela#getChaveprimaria <em>Chaveprimaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chaveprimaria</em>'.
	 * @see sql.Tabela#getChaveprimaria()
	 * @see #getTabela()
	 * @generated
	 */
	EReference getTabela_Chaveprimaria();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Tabela#getChaveestrangeira <em>Chaveestrangeira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chaveestrangeira</em>'.
	 * @see sql.Tabela#getChaveestrangeira()
	 * @see #getTabela()
	 * @generated
	 */
	EReference getTabela_Chaveestrangeira();

	/**
	 * Returns the meta object for class '{@link sql.Coluna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coluna</em>'.
	 * @see sql.Coluna
	 * @generated
	 */
	EClass getColuna();

	/**
	 * Returns the meta object for the attribute '{@link sql.Coluna#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see sql.Coluna#getNome()
	 * @see #getColuna()
	 * @generated
	 */
	EAttribute getColuna_Nome();

	/**
	 * Returns the meta object for the attribute '{@link sql.Coluna#getTipo_dado <em>Tipo dado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo dado</em>'.
	 * @see sql.Coluna#getTipo_dado()
	 * @see #getColuna()
	 * @generated
	 */
	EAttribute getColuna_Tipo_dado();

	/**
	 * Returns the meta object for the attribute '{@link sql.Coluna#isNulo <em>Nulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nulo</em>'.
	 * @see sql.Coluna#isNulo()
	 * @see #getColuna()
	 * @generated
	 */
	EAttribute getColuna_Nulo();

	/**
	 * Returns the meta object for class '{@link sql.ChavePrimaria <em>Chave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chave Primaria</em>'.
	 * @see sql.ChavePrimaria
	 * @generated
	 */
	EClass getChavePrimaria();

	/**
	 * Returns the meta object for the reference list '{@link sql.ChavePrimaria#getColuna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coluna</em>'.
	 * @see sql.ChavePrimaria#getColuna()
	 * @see #getChavePrimaria()
	 * @generated
	 */
	EReference getChavePrimaria_Coluna();

	/**
	 * Returns the meta object for class '{@link sql.ChaveEstrangeira <em>Chave Estrangeira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chave Estrangeira</em>'.
	 * @see sql.ChaveEstrangeira
	 * @generated
	 */
	EClass getChaveEstrangeira();

	/**
	 * Returns the meta object for the reference list '{@link sql.ChaveEstrangeira#getColuna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coluna</em>'.
	 * @see sql.ChaveEstrangeira#getColuna()
	 * @see #getChaveEstrangeira()
	 * @generated
	 */
	EReference getChaveEstrangeira_Coluna();

	/**
	 * Returns the meta object for the containment reference '{@link sql.ChaveEstrangeira#getTabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tabela</em>'.
	 * @see sql.ChaveEstrangeira#getTabela()
	 * @see #getChaveEstrangeira()
	 * @generated
	 */
	EReference getChaveEstrangeira_Tabela();

	/**
	 * Returns the meta object for class '{@link sql.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see sql.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Host#getBanco <em>Banco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Banco</em>'.
	 * @see sql.Host#getBanco()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Banco();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlFactory getSqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sql.impl.BancoImpl <em>Banco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.BancoImpl
		 * @see sql.impl.SqlPackageImpl#getBanco()
		 * @generated
		 */
		EClass BANCO = eINSTANCE.getBanco();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANCO__NOME = eINSTANCE.getBanco_Nome();

		/**
		 * The meta object literal for the '<em><b>Tabela</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANCO__TABELA = eINSTANCE.getBanco_Tabela();

		/**
		 * The meta object literal for the '{@link sql.impl.TabelaImpl <em>Tabela</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.TabelaImpl
		 * @see sql.impl.SqlPackageImpl#getTabela()
		 * @generated
		 */
		EClass TABELA = eINSTANCE.getTabela();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABELA__NOME = eINSTANCE.getTabela_Nome();

		/**
		 * The meta object literal for the '<em><b>Coluna</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABELA__COLUNA = eINSTANCE.getTabela_Coluna();

		/**
		 * The meta object literal for the '<em><b>Chaveprimaria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABELA__CHAVEPRIMARIA = eINSTANCE.getTabela_Chaveprimaria();

		/**
		 * The meta object literal for the '<em><b>Chaveestrangeira</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABELA__CHAVEESTRANGEIRA = eINSTANCE.getTabela_Chaveestrangeira();

		/**
		 * The meta object literal for the '{@link sql.impl.ColunaImpl <em>Coluna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ColunaImpl
		 * @see sql.impl.SqlPackageImpl#getColuna()
		 * @generated
		 */
		EClass COLUNA = eINSTANCE.getColuna();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUNA__NOME = eINSTANCE.getColuna_Nome();

		/**
		 * The meta object literal for the '<em><b>Tipo dado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUNA__TIPO_DADO = eINSTANCE.getColuna_Tipo_dado();

		/**
		 * The meta object literal for the '<em><b>Nulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUNA__NULO = eINSTANCE.getColuna_Nulo();

		/**
		 * The meta object literal for the '{@link sql.impl.ChavePrimariaImpl <em>Chave Primaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ChavePrimariaImpl
		 * @see sql.impl.SqlPackageImpl#getChavePrimaria()
		 * @generated
		 */
		EClass CHAVE_PRIMARIA = eINSTANCE.getChavePrimaria();

		/**
		 * The meta object literal for the '<em><b>Coluna</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAVE_PRIMARIA__COLUNA = eINSTANCE.getChavePrimaria_Coluna();

		/**
		 * The meta object literal for the '{@link sql.impl.ChaveEstrangeiraImpl <em>Chave Estrangeira</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ChaveEstrangeiraImpl
		 * @see sql.impl.SqlPackageImpl#getChaveEstrangeira()
		 * @generated
		 */
		EClass CHAVE_ESTRANGEIRA = eINSTANCE.getChaveEstrangeira();

		/**
		 * The meta object literal for the '<em><b>Coluna</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAVE_ESTRANGEIRA__COLUNA = eINSTANCE.getChaveEstrangeira_Coluna();

		/**
		 * The meta object literal for the '<em><b>Tabela</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAVE_ESTRANGEIRA__TABELA = eINSTANCE.getChaveEstrangeira_Tabela();

		/**
		 * The meta object literal for the '{@link sql.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.HostImpl
		 * @see sql.impl.SqlPackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Banco</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__BANCO = eINSTANCE.getHost_Banco();

	}

} //SqlPackage

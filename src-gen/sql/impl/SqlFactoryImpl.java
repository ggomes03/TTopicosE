/**
 */
package sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFactoryImpl extends EFactoryImpl implements SqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SqlFactory init() {
		try {
			SqlFactory theSqlFactory = (SqlFactory) EPackage.Registry.INSTANCE.getEFactory(SqlPackage.eNS_URI);
			if (theSqlFactory != null) {
				return theSqlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SqlPackage.BANCO:
			return createBanco();
		case SqlPackage.TABELA:
			return createTabela();
		case SqlPackage.COLUNA:
			return createColuna();
		case SqlPackage.CHAVE_PRIMARIA:
			return createChavePrimaria();
		case SqlPackage.CHAVE_ESTRANGEIRA:
			return createChaveEstrangeira();
		case SqlPackage.HOST:
			return createHost();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Banco createBanco() {
		BancoImpl banco = new BancoImpl();
		return banco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabela createTabela() {
		TabelaImpl tabela = new TabelaImpl();
		return tabela;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coluna createColuna() {
		ColunaImpl coluna = new ColunaImpl();
		return coluna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChavePrimaria createChavePrimaria() {
		ChavePrimariaImpl chavePrimaria = new ChavePrimariaImpl();
		return chavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChaveEstrangeira createChaveEstrangeira() {
		ChaveEstrangeiraImpl chaveEstrangeira = new ChaveEstrangeiraImpl();
		return chaveEstrangeira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Host createHost() {
		HostImpl host = new HostImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlPackage getSqlPackage() {
		return (SqlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SqlPackage getPackage() {
		return SqlPackage.eINSTANCE;
	}

} //SqlFactoryImpl

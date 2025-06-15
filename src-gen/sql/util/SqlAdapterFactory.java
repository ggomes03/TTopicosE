/**
 */
package sql.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sql.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sql.SqlPackage
 * @generated
 */
public class SqlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SqlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SqlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlSwitch<Adapter> modelSwitch = new SqlSwitch<Adapter>() {
		@Override
		public Adapter caseBanco(Banco object) {
			return createBancoAdapter();
		}

		@Override
		public Adapter caseTabela(Tabela object) {
			return createTabelaAdapter();
		}

		@Override
		public Adapter caseColuna(Coluna object) {
			return createColunaAdapter();
		}

		@Override
		public Adapter caseChavePrimaria(ChavePrimaria object) {
			return createChavePrimariaAdapter();
		}

		@Override
		public Adapter caseChaveEstrangeira(ChaveEstrangeira object) {
			return createChaveEstrangeiraAdapter();
		}

		@Override
		public Adapter caseHost(Host object) {
			return createHostAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.Banco <em>Banco</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.Banco
	 * @generated
	 */
	public Adapter createBancoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.Tabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.Tabela
	 * @generated
	 */
	public Adapter createTabelaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.Coluna <em>Coluna</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.Coluna
	 * @generated
	 */
	public Adapter createColunaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.ChavePrimaria <em>Chave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.ChavePrimaria
	 * @generated
	 */
	public Adapter createChavePrimariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.ChaveEstrangeira <em>Chave Estrangeira</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.ChaveEstrangeira
	 * @generated
	 */
	public Adapter createChaveEstrangeiraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sql.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sql.Host
	 * @generated
	 */
	public Adapter createHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SqlAdapterFactory

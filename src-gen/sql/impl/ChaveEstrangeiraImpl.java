/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sql.ChaveEstrangeira;
import sql.Coluna;
import sql.SqlPackage;
import sql.Tabela;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chave Estrangeira</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.ChaveEstrangeiraImpl#getColuna <em>Coluna</em>}</li>
 *   <li>{@link sql.impl.ChaveEstrangeiraImpl#getTabela <em>Tabela</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChaveEstrangeiraImpl extends MinimalEObjectImpl.Container implements ChaveEstrangeira {
	/**
	 * The cached value of the '{@link #getColuna() <em>Coluna</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColuna()
	 * @generated
	 * @ordered
	 */
	protected EList<Coluna> coluna;

	/**
	 * The cached value of the '{@link #getTabela() <em>Tabela</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabela()
	 * @generated
	 * @ordered
	 */
	protected Tabela tabela;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChaveEstrangeiraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.CHAVE_ESTRANGEIRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coluna> getColuna() {
		if (coluna == null) {
			coluna = new EObjectResolvingEList<Coluna>(Coluna.class, this, SqlPackage.CHAVE_ESTRANGEIRA__COLUNA);
		}
		return coluna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabela getTabela() {
		if (tabela != null && tabela.eIsProxy()) {
			InternalEObject oldTabela = (InternalEObject) tabela;
			tabela = (Tabela) eResolveProxy(oldTabela);
			if (tabela != oldTabela) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlPackage.CHAVE_ESTRANGEIRA__TABELA,
							oldTabela, tabela));
			}
		}
		return tabela;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabela basicGetTabela() {
		return tabela;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabela(Tabela newTabela) {
		Tabela oldTabela = tabela;
		tabela = newTabela;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CHAVE_ESTRANGEIRA__TABELA, oldTabela,
					tabela));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SqlPackage.CHAVE_ESTRANGEIRA__COLUNA:
			return getColuna();
		case SqlPackage.CHAVE_ESTRANGEIRA__TABELA:
			if (resolve)
				return getTabela();
			return basicGetTabela();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SqlPackage.CHAVE_ESTRANGEIRA__COLUNA:
			getColuna().clear();
			getColuna().addAll((Collection<? extends Coluna>) newValue);
			return;
		case SqlPackage.CHAVE_ESTRANGEIRA__TABELA:
			setTabela((Tabela) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SqlPackage.CHAVE_ESTRANGEIRA__COLUNA:
			getColuna().clear();
			return;
		case SqlPackage.CHAVE_ESTRANGEIRA__TABELA:
			setTabela((Tabela) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SqlPackage.CHAVE_ESTRANGEIRA__COLUNA:
			return coluna != null && !coluna.isEmpty();
		case SqlPackage.CHAVE_ESTRANGEIRA__TABELA:
			return tabela != null;
		}
		return super.eIsSet(featureID);
	}

} //ChaveEstrangeiraImpl

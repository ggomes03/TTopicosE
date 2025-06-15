/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sql.ChavePrimaria;
import sql.Coluna;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chave Primaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.ChavePrimariaImpl#getColuna <em>Coluna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChavePrimariaImpl extends MinimalEObjectImpl.Container implements ChavePrimaria {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChavePrimariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.CHAVE_PRIMARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coluna> getColuna() {
		if (coluna == null) {
			coluna = new EObjectResolvingEList<Coluna>(Coluna.class, this, SqlPackage.CHAVE_PRIMARIA__COLUNA);
		}
		return coluna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SqlPackage.CHAVE_PRIMARIA__COLUNA:
			return getColuna();
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
		case SqlPackage.CHAVE_PRIMARIA__COLUNA:
			getColuna().clear();
			getColuna().addAll((Collection<? extends Coluna>) newValue);
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
		case SqlPackage.CHAVE_PRIMARIA__COLUNA:
			getColuna().clear();
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
		case SqlPackage.CHAVE_PRIMARIA__COLUNA:
			return coluna != null && !coluna.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChavePrimariaImpl

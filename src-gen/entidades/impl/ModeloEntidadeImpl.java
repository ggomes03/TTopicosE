/**
 */
package entidades.impl;

import entidades.Entidade;
import entidades.ModeloEntidade;
import entidades.Relacionamento;
import entidades.UmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelo Entidade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entidades.impl.ModeloEntidadeImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link entidades.impl.ModeloEntidadeImpl#getRelacionamentos <em>Relacionamentos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeloEntidadeImpl extends MinimalEObjectImpl.Container implements ModeloEntidade {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidade> entidades;

	/**
	 * The cached value of the '{@link #getRelacionamentos() <em>Relacionamentos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionamentos()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacionamento> relacionamentos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloEntidadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.MODELO_ENTIDADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entidade> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<Entidade>(Entidade.class, this,
					UmlPackage.MODELO_ENTIDADE__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relacionamento> getRelacionamentos() {
		if (relacionamentos == null) {
			relacionamentos = new EObjectContainmentEList<Relacionamento>(Relacionamento.class, this,
					UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS);
		}
		return relacionamentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UmlPackage.MODELO_ENTIDADE__ENTIDADES:
			return ((InternalEList<?>) getEntidades()).basicRemove(otherEnd, msgs);
		case UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS:
			return ((InternalEList<?>) getRelacionamentos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.MODELO_ENTIDADE__ENTIDADES:
			return getEntidades();
		case UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS:
			return getRelacionamentos();
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
		case UmlPackage.MODELO_ENTIDADE__ENTIDADES:
			getEntidades().clear();
			getEntidades().addAll((Collection<? extends Entidade>) newValue);
			return;
		case UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS:
			getRelacionamentos().clear();
			getRelacionamentos().addAll((Collection<? extends Relacionamento>) newValue);
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
		case UmlPackage.MODELO_ENTIDADE__ENTIDADES:
			getEntidades().clear();
			return;
		case UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS:
			getRelacionamentos().clear();
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
		case UmlPackage.MODELO_ENTIDADE__ENTIDADES:
			return entidades != null && !entidades.isEmpty();
		case UmlPackage.MODELO_ENTIDADE__RELACIONAMENTOS:
			return relacionamentos != null && !relacionamentos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeloEntidadeImpl

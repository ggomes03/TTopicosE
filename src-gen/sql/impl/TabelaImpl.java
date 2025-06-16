/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql.ChaveEstrangeira;
import sql.ChavePrimaria;
import sql.Coluna;
import sql.SqlPackage;
import sql.Tabela;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabela</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.TabelaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link sql.impl.TabelaImpl#getColuna <em>Coluna</em>}</li>
 *   <li>{@link sql.impl.TabelaImpl#getChaveprimaria <em>Chaveprimaria</em>}</li>
 *   <li>{@link sql.impl.TabelaImpl#getChaveestrangeira <em>Chaveestrangeira</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabelaImpl extends MinimalEObjectImpl.Container implements Tabela {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColuna() <em>Coluna</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColuna()
	 * @generated
	 * @ordered
	 */
	protected EList<Coluna> coluna;

	/**
	 * The cached value of the '{@link #getChaveprimaria() <em>Chaveprimaria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChaveprimaria()
	 * @generated
	 * @ordered
	 */
	protected EList<ChavePrimaria> chaveprimaria;

	/**
	 * The cached value of the '{@link #getChaveestrangeira() <em>Chaveestrangeira</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChaveestrangeira()
	 * @generated
	 * @ordered
	 */
	protected EList<ChaveEstrangeira> chaveestrangeira;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabelaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.TABELA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.TABELA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coluna> getColuna() {
		if (coluna == null) {
			coluna = new EObjectContainmentWithInverseEList<Coluna>(Coluna.class, this, SqlPackage.TABELA__COLUNA,
					SqlPackage.COLUNA__TABELA);
		}
		return coluna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChavePrimaria> getChaveprimaria() {
		if (chaveprimaria == null) {
			chaveprimaria = new EObjectContainmentEList<ChavePrimaria>(ChavePrimaria.class, this,
					SqlPackage.TABELA__CHAVEPRIMARIA);
		}
		return chaveprimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChaveEstrangeira> getChaveestrangeira() {
		if (chaveestrangeira == null) {
			chaveestrangeira = new EObjectContainmentEList<ChaveEstrangeira>(ChaveEstrangeira.class, this,
					SqlPackage.TABELA__CHAVEESTRANGEIRA);
		}
		return chaveestrangeira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SqlPackage.TABELA__COLUNA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getColuna()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SqlPackage.TABELA__COLUNA:
			return ((InternalEList<?>) getColuna()).basicRemove(otherEnd, msgs);
		case SqlPackage.TABELA__CHAVEPRIMARIA:
			return ((InternalEList<?>) getChaveprimaria()).basicRemove(otherEnd, msgs);
		case SqlPackage.TABELA__CHAVEESTRANGEIRA:
			return ((InternalEList<?>) getChaveestrangeira()).basicRemove(otherEnd, msgs);
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
		case SqlPackage.TABELA__NOME:
			return getNome();
		case SqlPackage.TABELA__COLUNA:
			return getColuna();
		case SqlPackage.TABELA__CHAVEPRIMARIA:
			return getChaveprimaria();
		case SqlPackage.TABELA__CHAVEESTRANGEIRA:
			return getChaveestrangeira();
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
		case SqlPackage.TABELA__NOME:
			setNome((String) newValue);
			return;
		case SqlPackage.TABELA__COLUNA:
			getColuna().clear();
			getColuna().addAll((Collection<? extends Coluna>) newValue);
			return;
		case SqlPackage.TABELA__CHAVEPRIMARIA:
			getChaveprimaria().clear();
			getChaveprimaria().addAll((Collection<? extends ChavePrimaria>) newValue);
			return;
		case SqlPackage.TABELA__CHAVEESTRANGEIRA:
			getChaveestrangeira().clear();
			getChaveestrangeira().addAll((Collection<? extends ChaveEstrangeira>) newValue);
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
		case SqlPackage.TABELA__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case SqlPackage.TABELA__COLUNA:
			getColuna().clear();
			return;
		case SqlPackage.TABELA__CHAVEPRIMARIA:
			getChaveprimaria().clear();
			return;
		case SqlPackage.TABELA__CHAVEESTRANGEIRA:
			getChaveestrangeira().clear();
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
		case SqlPackage.TABELA__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case SqlPackage.TABELA__COLUNA:
			return coluna != null && !coluna.isEmpty();
		case SqlPackage.TABELA__CHAVEPRIMARIA:
			return chaveprimaria != null && !chaveprimaria.isEmpty();
		case SqlPackage.TABELA__CHAVEESTRANGEIRA:
			return chaveestrangeira != null && !chaveestrangeira.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //TabelaImpl

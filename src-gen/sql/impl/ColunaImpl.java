/**
 */
package sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import sql.Coluna;
import sql.SqlPackage;
import sql.Tabela;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coluna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.ColunaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link sql.impl.ColunaImpl#getTipo_dado <em>Tipo dado</em>}</li>
 *   <li>{@link sql.impl.ColunaImpl#isNulo <em>Nulo</em>}</li>
 *   <li>{@link sql.impl.ColunaImpl#getTabela <em>Tabela</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColunaImpl extends MinimalEObjectImpl.Container implements Coluna {
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
	 * The default value of the '{@link #getTipo_dado() <em>Tipo dado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo_dado()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_DADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo_dado() <em>Tipo dado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo_dado()
	 * @generated
	 * @ordered
	 */
	protected String tipo_dado = TIPO_DADO_EDEFAULT;

	/**
	 * The default value of the '{@link #isNulo() <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNulo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNulo() <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNulo()
	 * @generated
	 * @ordered
	 */
	protected boolean nulo = NULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColunaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.COLUNA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.COLUNA__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipo_dado() {
		return tipo_dado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo_dado(String newTipo_dado) {
		String oldTipo_dado = tipo_dado;
		tipo_dado = newTipo_dado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.COLUNA__TIPO_DADO, oldTipo_dado,
					tipo_dado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNulo() {
		return nulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNulo(boolean newNulo) {
		boolean oldNulo = nulo;
		nulo = newNulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.COLUNA__NULO, oldNulo, nulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabela getTabela() {
		if (eContainerFeatureID() != SqlPackage.COLUNA__TABELA)
			return null;
		return (Tabela) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabela(Tabela newTabela, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTabela, SqlPackage.COLUNA__TABELA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabela(Tabela newTabela) {
		if (newTabela != eInternalContainer()
				|| (eContainerFeatureID() != SqlPackage.COLUNA__TABELA && newTabela != null)) {
			if (EcoreUtil.isAncestor(this, newTabela))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTabela != null)
				msgs = ((InternalEObject) newTabela).eInverseAdd(this, SqlPackage.TABELA__COLUNA, Tabela.class, msgs);
			msgs = basicSetTabela(newTabela, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.COLUNA__TABELA, newTabela, newTabela));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SqlPackage.COLUNA__TABELA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTabela((Tabela) otherEnd, msgs);
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
		case SqlPackage.COLUNA__TABELA:
			return basicSetTabela(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SqlPackage.COLUNA__TABELA:
			return eInternalContainer().eInverseRemove(this, SqlPackage.TABELA__COLUNA, Tabela.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SqlPackage.COLUNA__NOME:
			return getNome();
		case SqlPackage.COLUNA__TIPO_DADO:
			return getTipo_dado();
		case SqlPackage.COLUNA__NULO:
			return isNulo();
		case SqlPackage.COLUNA__TABELA:
			return getTabela();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SqlPackage.COLUNA__NOME:
			setNome((String) newValue);
			return;
		case SqlPackage.COLUNA__TIPO_DADO:
			setTipo_dado((String) newValue);
			return;
		case SqlPackage.COLUNA__NULO:
			setNulo((Boolean) newValue);
			return;
		case SqlPackage.COLUNA__TABELA:
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
		case SqlPackage.COLUNA__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case SqlPackage.COLUNA__TIPO_DADO:
			setTipo_dado(TIPO_DADO_EDEFAULT);
			return;
		case SqlPackage.COLUNA__NULO:
			setNulo(NULO_EDEFAULT);
			return;
		case SqlPackage.COLUNA__TABELA:
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
		case SqlPackage.COLUNA__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case SqlPackage.COLUNA__TIPO_DADO:
			return TIPO_DADO_EDEFAULT == null ? tipo_dado != null : !TIPO_DADO_EDEFAULT.equals(tipo_dado);
		case SqlPackage.COLUNA__NULO:
			return nulo != NULO_EDEFAULT;
		case SqlPackage.COLUNA__TABELA:
			return getTabela() != null;
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
		result.append(", tipo_dado: ");
		result.append(tipo_dado);
		result.append(", nulo: ");
		result.append(nulo);
		result.append(')');
		return result.toString();
	}

} //ColunaImpl

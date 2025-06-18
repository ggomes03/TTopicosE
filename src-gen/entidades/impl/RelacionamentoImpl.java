/**
 */
package entidades.impl;

import entidades.Entidade;
import entidades.Relacionamento;
import entidades.UmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacionamento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entidades.impl.RelacionamentoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link entidades.impl.RelacionamentoImpl#getOrigem <em>Origem</em>}</li>
 *   <li>{@link entidades.impl.RelacionamentoImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link entidades.impl.RelacionamentoImpl#getMultiplicidadeOrigem <em>Multiplicidade Origem</em>}</li>
 *   <li>{@link entidades.impl.RelacionamentoImpl#getMultiplicidadeDestino <em>Multiplicidade Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionamentoImpl extends MinimalEObjectImpl.Container implements Relacionamento {
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
	 * The cached value of the '{@link #getOrigem() <em>Origem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigem()
	 * @generated
	 * @ordered
	 */
	protected Entidade origem;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Entidade destino;

	/**
	 * The default value of the '{@link #getMultiplicidadeOrigem() <em>Multiplicidade Origem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadeOrigem()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDADE_ORIGEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadeOrigem() <em>Multiplicidade Origem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadeOrigem()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadeOrigem = MULTIPLICIDADE_ORIGEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadeDestino() <em>Multiplicidade Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadeDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDADE_DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadeDestino() <em>Multiplicidade Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadeDestino()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadeDestino = MULTIPLICIDADE_DESTINO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionamentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.RELACIONAMENTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RELACIONAMENTO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entidade getOrigem() {
		if (origem != null && origem.eIsProxy()) {
			InternalEObject oldOrigem = (InternalEObject) origem;
			origem = (Entidade) eResolveProxy(oldOrigem);
			if (origem != oldOrigem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.RELACIONAMENTO__ORIGEM,
							oldOrigem, origem));
			}
		}
		return origem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidade basicGetOrigem() {
		return origem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigem(Entidade newOrigem) {
		Entidade oldOrigem = origem;
		origem = newOrigem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RELACIONAMENTO__ORIGEM, oldOrigem,
					origem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entidade getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject) destino;
			destino = (Entidade) eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.RELACIONAMENTO__DESTINO,
							oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidade basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestino(Entidade newDestino) {
		Entidade oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RELACIONAMENTO__DESTINO, oldDestino,
					destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicidadeOrigem() {
		return multiplicidadeOrigem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicidadeOrigem(String newMultiplicidadeOrigem) {
		String oldMultiplicidadeOrigem = multiplicidadeOrigem;
		multiplicidadeOrigem = newMultiplicidadeOrigem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_ORIGEM,
					oldMultiplicidadeOrigem, multiplicidadeOrigem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicidadeDestino() {
		return multiplicidadeDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicidadeDestino(String newMultiplicidadeDestino) {
		String oldMultiplicidadeDestino = multiplicidadeDestino;
		multiplicidadeDestino = newMultiplicidadeDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_DESTINO,
					oldMultiplicidadeDestino, multiplicidadeDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.RELACIONAMENTO__NOME:
			return getNome();
		case UmlPackage.RELACIONAMENTO__ORIGEM:
			if (resolve)
				return getOrigem();
			return basicGetOrigem();
		case UmlPackage.RELACIONAMENTO__DESTINO:
			if (resolve)
				return getDestino();
			return basicGetDestino();
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_ORIGEM:
			return getMultiplicidadeOrigem();
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_DESTINO:
			return getMultiplicidadeDestino();
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
		case UmlPackage.RELACIONAMENTO__NOME:
			setNome((String) newValue);
			return;
		case UmlPackage.RELACIONAMENTO__ORIGEM:
			setOrigem((Entidade) newValue);
			return;
		case UmlPackage.RELACIONAMENTO__DESTINO:
			setDestino((Entidade) newValue);
			return;
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_ORIGEM:
			setMultiplicidadeOrigem((String) newValue);
			return;
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_DESTINO:
			setMultiplicidadeDestino((String) newValue);
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
		case UmlPackage.RELACIONAMENTO__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case UmlPackage.RELACIONAMENTO__ORIGEM:
			setOrigem((Entidade) null);
			return;
		case UmlPackage.RELACIONAMENTO__DESTINO:
			setDestino((Entidade) null);
			return;
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_ORIGEM:
			setMultiplicidadeOrigem(MULTIPLICIDADE_ORIGEM_EDEFAULT);
			return;
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_DESTINO:
			setMultiplicidadeDestino(MULTIPLICIDADE_DESTINO_EDEFAULT);
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
		case UmlPackage.RELACIONAMENTO__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case UmlPackage.RELACIONAMENTO__ORIGEM:
			return origem != null;
		case UmlPackage.RELACIONAMENTO__DESTINO:
			return destino != null;
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_ORIGEM:
			return MULTIPLICIDADE_ORIGEM_EDEFAULT == null ? multiplicidadeOrigem != null
					: !MULTIPLICIDADE_ORIGEM_EDEFAULT.equals(multiplicidadeOrigem);
		case UmlPackage.RELACIONAMENTO__MULTIPLICIDADE_DESTINO:
			return MULTIPLICIDADE_DESTINO_EDEFAULT == null ? multiplicidadeDestino != null
					: !MULTIPLICIDADE_DESTINO_EDEFAULT.equals(multiplicidadeDestino);
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
		result.append(", multiplicidadeOrigem: ");
		result.append(multiplicidadeOrigem);
		result.append(", multiplicidadeDestino: ");
		result.append(multiplicidadeDestino);
		result.append(')');
		return result.toString();
	}

} //RelacionamentoImpl

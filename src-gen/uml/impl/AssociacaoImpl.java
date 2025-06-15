/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.Associacao;
import uml.Classe;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Associacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.impl.AssociacaoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link uml.impl.AssociacaoImpl#isEhChaveEstrangeira <em>Eh Chave Estrangeira</em>}</li>
 *   <li>{@link uml.impl.AssociacaoImpl#getTabelaOrigem <em>Tabela Origem</em>}</li>
 *   <li>{@link uml.impl.AssociacaoImpl#getTabelaAlvo <em>Tabela Alvo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociacaoImpl extends MinimalEObjectImpl.Container implements Associacao {
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
	 * The default value of the '{@link #isEhChaveEstrangeira() <em>Eh Chave Estrangeira</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhChaveEstrangeira()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EH_CHAVE_ESTRANGEIRA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEhChaveEstrangeira() <em>Eh Chave Estrangeira</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhChaveEstrangeira()
	 * @generated
	 * @ordered
	 */
	protected boolean ehChaveEstrangeira = EH_CHAVE_ESTRANGEIRA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTabelaOrigem() <em>Tabela Origem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabelaOrigem()
	 * @generated
	 * @ordered
	 */
	protected Classe tabelaOrigem;

	/**
	 * The cached value of the '{@link #getTabelaAlvo() <em>Tabela Alvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabelaAlvo()
	 * @generated
	 * @ordered
	 */
	protected Classe tabelaAlvo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.ASSOCIACAO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIACAO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEhChaveEstrangeira() {
		return ehChaveEstrangeira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEhChaveEstrangeira(boolean newEhChaveEstrangeira) {
		boolean oldEhChaveEstrangeira = ehChaveEstrangeira;
		ehChaveEstrangeira = newEhChaveEstrangeira;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIACAO__EH_CHAVE_ESTRANGEIRA,
					oldEhChaveEstrangeira, ehChaveEstrangeira));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classe getTabelaOrigem() {
		if (tabelaOrigem != null && tabelaOrigem.eIsProxy()) {
			InternalEObject oldTabelaOrigem = (InternalEObject) tabelaOrigem;
			tabelaOrigem = (Classe) eResolveProxy(oldTabelaOrigem);
			if (tabelaOrigem != oldTabelaOrigem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ASSOCIACAO__TABELA_ORIGEM,
							oldTabelaOrigem, tabelaOrigem));
			}
		}
		return tabelaOrigem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe basicGetTabelaOrigem() {
		return tabelaOrigem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabelaOrigem(Classe newTabelaOrigem) {
		Classe oldTabelaOrigem = tabelaOrigem;
		tabelaOrigem = newTabelaOrigem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIACAO__TABELA_ORIGEM, oldTabelaOrigem,
					tabelaOrigem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classe getTabelaAlvo() {
		if (tabelaAlvo != null && tabelaAlvo.eIsProxy()) {
			InternalEObject oldTabelaAlvo = (InternalEObject) tabelaAlvo;
			tabelaAlvo = (Classe) eResolveProxy(oldTabelaAlvo);
			if (tabelaAlvo != oldTabelaAlvo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ASSOCIACAO__TABELA_ALVO,
							oldTabelaAlvo, tabelaAlvo));
			}
		}
		return tabelaAlvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe basicGetTabelaAlvo() {
		return tabelaAlvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabelaAlvo(Classe newTabelaAlvo) {
		Classe oldTabelaAlvo = tabelaAlvo;
		tabelaAlvo = newTabelaAlvo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIACAO__TABELA_ALVO, oldTabelaAlvo,
					tabelaAlvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.ASSOCIACAO__NOME:
			return getNome();
		case UmlPackage.ASSOCIACAO__EH_CHAVE_ESTRANGEIRA:
			return isEhChaveEstrangeira();
		case UmlPackage.ASSOCIACAO__TABELA_ORIGEM:
			if (resolve)
				return getTabelaOrigem();
			return basicGetTabelaOrigem();
		case UmlPackage.ASSOCIACAO__TABELA_ALVO:
			if (resolve)
				return getTabelaAlvo();
			return basicGetTabelaAlvo();
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
		case UmlPackage.ASSOCIACAO__NOME:
			setNome((String) newValue);
			return;
		case UmlPackage.ASSOCIACAO__EH_CHAVE_ESTRANGEIRA:
			setEhChaveEstrangeira((Boolean) newValue);
			return;
		case UmlPackage.ASSOCIACAO__TABELA_ORIGEM:
			setTabelaOrigem((Classe) newValue);
			return;
		case UmlPackage.ASSOCIACAO__TABELA_ALVO:
			setTabelaAlvo((Classe) newValue);
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
		case UmlPackage.ASSOCIACAO__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case UmlPackage.ASSOCIACAO__EH_CHAVE_ESTRANGEIRA:
			setEhChaveEstrangeira(EH_CHAVE_ESTRANGEIRA_EDEFAULT);
			return;
		case UmlPackage.ASSOCIACAO__TABELA_ORIGEM:
			setTabelaOrigem((Classe) null);
			return;
		case UmlPackage.ASSOCIACAO__TABELA_ALVO:
			setTabelaAlvo((Classe) null);
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
		case UmlPackage.ASSOCIACAO__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case UmlPackage.ASSOCIACAO__EH_CHAVE_ESTRANGEIRA:
			return ehChaveEstrangeira != EH_CHAVE_ESTRANGEIRA_EDEFAULT;
		case UmlPackage.ASSOCIACAO__TABELA_ORIGEM:
			return tabelaOrigem != null;
		case UmlPackage.ASSOCIACAO__TABELA_ALVO:
			return tabelaAlvo != null;
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
		result.append(", ehChaveEstrangeira: ");
		result.append(ehChaveEstrangeira);
		result.append(')');
		return result.toString();
	}

} //AssociacaoImpl

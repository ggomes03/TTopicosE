/**
 */
package entidades.impl;

import entidades.Atributo;
import entidades.UmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link entidades.impl.AtributoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link entidades.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link entidades.impl.AtributoImpl#isEhChavePrimaria <em>Eh Chave Primaria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEhChavePrimaria() <em>Eh Chave Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhChavePrimaria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EH_CHAVE_PRIMARIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEhChavePrimaria() <em>Eh Chave Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhChavePrimaria()
	 * @generated
	 * @ordered
	 */
	protected boolean ehChavePrimaria = EH_CHAVE_PRIMARIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATRIBUTO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATRIBUTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEhChavePrimaria() {
		return ehChavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEhChavePrimaria(boolean newEhChavePrimaria) {
		boolean oldEhChavePrimaria = ehChavePrimaria;
		ehChavePrimaria = newEhChavePrimaria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATRIBUTO__EH_CHAVE_PRIMARIA,
					oldEhChavePrimaria, ehChavePrimaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UmlPackage.ATRIBUTO__NOME:
			return getNome();
		case UmlPackage.ATRIBUTO__TIPO:
			return getTipo();
		case UmlPackage.ATRIBUTO__EH_CHAVE_PRIMARIA:
			return isEhChavePrimaria();
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
		case UmlPackage.ATRIBUTO__NOME:
			setNome((String) newValue);
			return;
		case UmlPackage.ATRIBUTO__TIPO:
			setTipo((String) newValue);
			return;
		case UmlPackage.ATRIBUTO__EH_CHAVE_PRIMARIA:
			setEhChavePrimaria((Boolean) newValue);
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
		case UmlPackage.ATRIBUTO__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case UmlPackage.ATRIBUTO__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case UmlPackage.ATRIBUTO__EH_CHAVE_PRIMARIA:
			setEhChavePrimaria(EH_CHAVE_PRIMARIA_EDEFAULT);
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
		case UmlPackage.ATRIBUTO__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case UmlPackage.ATRIBUTO__TIPO:
			return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
		case UmlPackage.ATRIBUTO__EH_CHAVE_PRIMARIA:
			return ehChavePrimaria != EH_CHAVE_PRIMARIA_EDEFAULT;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", ehChavePrimaria: ");
		result.append(ehChavePrimaria);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl

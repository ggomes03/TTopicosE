/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlFactory init() {
		try {
			UmlFactory theUmlFactory = (UmlFactory) EPackage.Registry.INSTANCE.getEFactory(UmlPackage.eNS_URI);
			if (theUmlFactory != null) {
				return theUmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactoryImpl() {
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
		case UmlPackage.CLASSE:
			return createClasse();
		case UmlPackage.ATRIBUTO:
			return createAtributo();
		case UmlPackage.ASSOCIACAO:
			return createAssociacao();
		case UmlPackage.ELEMENTO:
			return createElemento();
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
	public Elemento createElemento() {
		ElementoImpl elemento = new ElementoImpl();
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Associacao createAssociacao() {
		AssociacaoImpl associacao = new AssociacaoImpl();
		return associacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlPackage getUmlPackage() {
		return (UmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlPackage getPackage() {
		return UmlPackage.eINSTANCE;
	}

} //UmlFactoryImpl

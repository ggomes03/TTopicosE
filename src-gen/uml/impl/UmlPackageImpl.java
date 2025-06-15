/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uml.Associacao;
import uml.Atributo;
import uml.Classe;
import uml.Elemento;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associacaoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml.UmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlPackageImpl() {
		super(eNS_URI, UmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmlPackage init() {
		if (isInited)
			return (UmlPackage) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UmlPackageImpl theUmlPackage = registeredUmlPackage instanceof UmlPackageImpl
				? (UmlPackageImpl) registeredUmlPackage
				: new UmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUmlPackage.createPackageContents();

		// Initialize created meta-data
		theUmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
		return theUmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElemento_Classe() {
		return (EReference) elementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClasse() {
		return classeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClasse_Nome() {
		return (EAttribute) classeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClasse_Attributes() {
		return (EReference) classeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Nome() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Tipo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_EhChavePrimaria() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociacao() {
		return associacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociacao_Nome() {
		return (EAttribute) associacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociacao_EhChaveEstrangeira() {
		return (EAttribute) associacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociacao_TabelaOrigem() {
		return (EReference) associacaoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociacao_TabelaAlvo() {
		return (EReference) associacaoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlFactory getUmlFactory() {
		return (UmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		classeEClass = createEClass(CLASSE);
		createEAttribute(classeEClass, CLASSE__NOME);
		createEReference(classeEClass, CLASSE__ATTRIBUTES);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOME);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);
		createEAttribute(atributoEClass, ATRIBUTO__EH_CHAVE_PRIMARIA);

		associacaoEClass = createEClass(ASSOCIACAO);
		createEAttribute(associacaoEClass, ASSOCIACAO__NOME);
		createEAttribute(associacaoEClass, ASSOCIACAO__EH_CHAVE_ESTRANGEIRA);
		createEReference(associacaoEClass, ASSOCIACAO__TABELA_ORIGEM);
		createEReference(associacaoEClass, ASSOCIACAO__TABELA_ALVO);

		elementoEClass = createEClass(ELEMENTO);
		createEReference(elementoEClass, ELEMENTO__CLASSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(classeEClass, Classe.class, "Classe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasse_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Classe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasse_Attributes(), this.getAtributo(), null, "attributes", null, 0, -1, Classe.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_EhChavePrimaria(), ecorePackage.getEBoolean(), "ehChavePrimaria", null, 0, 1,
				Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(associacaoEClass, Associacao.class, "Associacao", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociacao_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Associacao.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociacao_EhChaveEstrangeira(), ecorePackage.getEBoolean(), "ehChaveEstrangeira", null, 0, 1,
				Associacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAssociacao_TabelaOrigem(), this.getClasse(), null, "tabelaOrigem", null, 0, 1,
				Associacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociacao_TabelaAlvo(), this.getClasse(), null, "tabelaAlvo", null, 0, 1, Associacao.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElemento_Classe(), this.getClasse(), null, "classe", null, 0, -1, Elemento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UmlPackageImpl

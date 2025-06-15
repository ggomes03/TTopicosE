/**
 */
package uml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlPackage eINSTANCE = uml.impl.UmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.ElementoImpl
	 * @see uml.impl.UmlPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 3;

	/**
	 * The meta object id for the '{@link uml.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.ClasseImpl
	 * @see uml.impl.UmlPackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NOME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.AtributoImpl
	 * @see uml.impl.UmlPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Eh Chave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__EH_CHAVE_PRIMARIA = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.AssociacaoImpl <em>Associacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.AssociacaoImpl
	 * @see uml.impl.UmlPackageImpl#getAssociacao()
	 * @generated
	 */
	int ASSOCIACAO = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Eh Chave Estrangeira</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO__EH_CHAVE_ESTRANGEIRA = 1;

	/**
	 * The feature id for the '<em><b>Tabela Origem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO__TABELA_ORIGEM = 2;

	/**
	 * The feature id for the '<em><b>Tabela Alvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO__TABELA_ALVO = 3;

	/**
	 * The number of structural features of the '<em>Associacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Associacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIACAO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__CLASSE = 0;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uml.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see uml.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.Elemento#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classe</em>'.
	 * @see uml.Elemento#getClasse()
	 * @see #getElemento()
	 * @generated
	 */
	EReference getElemento_Classe();

	/**
	 * Returns the meta object for class '{@link uml.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see uml.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the attribute '{@link uml.Classe#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see uml.Classe#getNome()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.Classe#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see uml.Classe#getAttributes()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Attributes();

	/**
	 * Returns the meta object for class '{@link uml.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see uml.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link uml.Atributo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see uml.Atributo#getNome()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link uml.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see uml.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link uml.Atributo#isEhChavePrimaria <em>Eh Chave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eh Chave Primaria</em>'.
	 * @see uml.Atributo#isEhChavePrimaria()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EhChavePrimaria();

	/**
	 * Returns the meta object for class '{@link uml.Associacao <em>Associacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associacao</em>'.
	 * @see uml.Associacao
	 * @generated
	 */
	EClass getAssociacao();

	/**
	 * Returns the meta object for the attribute '{@link uml.Associacao#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see uml.Associacao#getNome()
	 * @see #getAssociacao()
	 * @generated
	 */
	EAttribute getAssociacao_Nome();

	/**
	 * Returns the meta object for the attribute '{@link uml.Associacao#isEhChaveEstrangeira <em>Eh Chave Estrangeira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eh Chave Estrangeira</em>'.
	 * @see uml.Associacao#isEhChaveEstrangeira()
	 * @see #getAssociacao()
	 * @generated
	 */
	EAttribute getAssociacao_EhChaveEstrangeira();

	/**
	 * Returns the meta object for the reference '{@link uml.Associacao#getTabelaOrigem <em>Tabela Origem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabela Origem</em>'.
	 * @see uml.Associacao#getTabelaOrigem()
	 * @see #getAssociacao()
	 * @generated
	 */
	EReference getAssociacao_TabelaOrigem();

	/**
	 * Returns the meta object for the reference '{@link uml.Associacao#getTabelaAlvo <em>Tabela Alvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabela Alvo</em>'.
	 * @see uml.Associacao#getTabelaAlvo()
	 * @see #getAssociacao()
	 * @generated
	 */
	EReference getAssociacao_TabelaAlvo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmlFactory getUmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uml.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.ElementoImpl
		 * @see uml.impl.UmlPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO__CLASSE = eINSTANCE.getElemento_Classe();

		/**
		 * The meta object literal for the '{@link uml.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.ClasseImpl
		 * @see uml.impl.UmlPackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__NOME = eINSTANCE.getClasse_Nome();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__ATTRIBUTES = eINSTANCE.getClasse_Attributes();

		/**
		 * The meta object literal for the '{@link uml.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.AtributoImpl
		 * @see uml.impl.UmlPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOME = eINSTANCE.getAtributo_Nome();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Eh Chave Primaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__EH_CHAVE_PRIMARIA = eINSTANCE.getAtributo_EhChavePrimaria();

		/**
		 * The meta object literal for the '{@link uml.impl.AssociacaoImpl <em>Associacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.AssociacaoImpl
		 * @see uml.impl.UmlPackageImpl#getAssociacao()
		 * @generated
		 */
		EClass ASSOCIACAO = eINSTANCE.getAssociacao();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIACAO__NOME = eINSTANCE.getAssociacao_Nome();

		/**
		 * The meta object literal for the '<em><b>Eh Chave Estrangeira</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIACAO__EH_CHAVE_ESTRANGEIRA = eINSTANCE.getAssociacao_EhChaveEstrangeira();

		/**
		 * The meta object literal for the '<em><b>Tabela Origem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIACAO__TABELA_ORIGEM = eINSTANCE.getAssociacao_TabelaOrigem();

		/**
		 * The meta object literal for the '<em><b>Tabela Alvo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIACAO__TABELA_ALVO = eINSTANCE.getAssociacao_TabelaAlvo();

	}

} //UmlPackage

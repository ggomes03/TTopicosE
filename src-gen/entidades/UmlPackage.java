/**
 */
package entidades;

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
 * @see entidades.UmlFactory
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
	String eNAME = "entidades";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/entidades";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlPackage eINSTANCE = entidades.impl.UmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link entidades.impl.EntidadeImpl <em>Entidade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entidades.impl.EntidadeImpl
	 * @see entidades.impl.UmlPackageImpl#getEntidade()
	 * @generated
	 */
	int ENTIDADE = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDADE__NOME = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDADE__ATRIBUTOS = 1;

	/**
	 * The number of structural features of the '<em>Entidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDADE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entidades.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entidades.impl.AtributoImpl
	 * @see entidades.impl.UmlPackageImpl#getAtributo()
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
	 * The meta object id for the '{@link entidades.impl.RelacionamentoImpl <em>Relacionamento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entidades.impl.RelacionamentoImpl
	 * @see entidades.impl.UmlPackageImpl#getRelacionamento()
	 * @generated
	 */
	int RELACIONAMENTO = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Origem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO__ORIGEM = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidade Origem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO__MULTIPLICIDADE_ORIGEM = 3;

	/**
	 * The feature id for the '<em><b>Multiplicidade Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO__MULTIPLICIDADE_DESTINO = 4;

	/**
	 * The number of structural features of the '<em>Relacionamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relacionamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONAMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entidades.impl.ModeloEntidadeImpl <em>Modelo Entidade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entidades.impl.ModeloEntidadeImpl
	 * @see entidades.impl.UmlPackageImpl#getModeloEntidade()
	 * @generated
	 */
	int MODELO_ENTIDADE = 3;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_ENTIDADE__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Relacionamentos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_ENTIDADE__RELACIONAMENTOS = 1;

	/**
	 * The number of structural features of the '<em>Modelo Entidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_ENTIDADE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modelo Entidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_ENTIDADE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link entidades.Entidade <em>Entidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidade</em>'.
	 * @see entidades.Entidade
	 * @generated
	 */
	EClass getEntidade();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Entidade#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see entidades.Entidade#getNome()
	 * @see #getEntidade()
	 * @generated
	 */
	EAttribute getEntidade_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link entidades.Entidade#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see entidades.Entidade#getAtributos()
	 * @see #getEntidade()
	 * @generated
	 */
	EReference getEntidade_Atributos();

	/**
	 * Returns the meta object for class '{@link entidades.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see entidades.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Atributo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see entidades.Atributo#getNome()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see entidades.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Atributo#isEhChavePrimaria <em>Eh Chave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eh Chave Primaria</em>'.
	 * @see entidades.Atributo#isEhChavePrimaria()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EhChavePrimaria();

	/**
	 * Returns the meta object for class '{@link entidades.Relacionamento <em>Relacionamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacionamento</em>'.
	 * @see entidades.Relacionamento
	 * @generated
	 */
	EClass getRelacionamento();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Relacionamento#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see entidades.Relacionamento#getNome()
	 * @see #getRelacionamento()
	 * @generated
	 */
	EAttribute getRelacionamento_Nome();

	/**
	 * Returns the meta object for the reference '{@link entidades.Relacionamento#getOrigem <em>Origem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origem</em>'.
	 * @see entidades.Relacionamento#getOrigem()
	 * @see #getRelacionamento()
	 * @generated
	 */
	EReference getRelacionamento_Origem();

	/**
	 * Returns the meta object for the reference '{@link entidades.Relacionamento#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see entidades.Relacionamento#getDestino()
	 * @see #getRelacionamento()
	 * @generated
	 */
	EReference getRelacionamento_Destino();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Relacionamento#getMultiplicidadeOrigem <em>Multiplicidade Origem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidade Origem</em>'.
	 * @see entidades.Relacionamento#getMultiplicidadeOrigem()
	 * @see #getRelacionamento()
	 * @generated
	 */
	EAttribute getRelacionamento_MultiplicidadeOrigem();

	/**
	 * Returns the meta object for the attribute '{@link entidades.Relacionamento#getMultiplicidadeDestino <em>Multiplicidade Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidade Destino</em>'.
	 * @see entidades.Relacionamento#getMultiplicidadeDestino()
	 * @see #getRelacionamento()
	 * @generated
	 */
	EAttribute getRelacionamento_MultiplicidadeDestino();

	/**
	 * Returns the meta object for class '{@link entidades.ModeloEntidade <em>Modelo Entidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelo Entidade</em>'.
	 * @see entidades.ModeloEntidade
	 * @generated
	 */
	EClass getModeloEntidade();

	/**
	 * Returns the meta object for the containment reference list '{@link entidades.ModeloEntidade#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see entidades.ModeloEntidade#getEntidades()
	 * @see #getModeloEntidade()
	 * @generated
	 */
	EReference getModeloEntidade_Entidades();

	/**
	 * Returns the meta object for the containment reference list '{@link entidades.ModeloEntidade#getRelacionamentos <em>Relacionamentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacionamentos</em>'.
	 * @see entidades.ModeloEntidade#getRelacionamentos()
	 * @see #getModeloEntidade()
	 * @generated
	 */
	EReference getModeloEntidade_Relacionamentos();

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
		 * The meta object literal for the '{@link entidades.impl.EntidadeImpl <em>Entidade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entidades.impl.EntidadeImpl
		 * @see entidades.impl.UmlPackageImpl#getEntidade()
		 * @generated
		 */
		EClass ENTIDADE = eINSTANCE.getEntidade();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDADE__NOME = eINSTANCE.getEntidade_Nome();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDADE__ATRIBUTOS = eINSTANCE.getEntidade_Atributos();

		/**
		 * The meta object literal for the '{@link entidades.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entidades.impl.AtributoImpl
		 * @see entidades.impl.UmlPackageImpl#getAtributo()
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
		 * The meta object literal for the '{@link entidades.impl.RelacionamentoImpl <em>Relacionamento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entidades.impl.RelacionamentoImpl
		 * @see entidades.impl.UmlPackageImpl#getRelacionamento()
		 * @generated
		 */
		EClass RELACIONAMENTO = eINSTANCE.getRelacionamento();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACIONAMENTO__NOME = eINSTANCE.getRelacionamento_Nome();

		/**
		 * The meta object literal for the '<em><b>Origem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACIONAMENTO__ORIGEM = eINSTANCE.getRelacionamento_Origem();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACIONAMENTO__DESTINO = eINSTANCE.getRelacionamento_Destino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidade Origem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACIONAMENTO__MULTIPLICIDADE_ORIGEM = eINSTANCE.getRelacionamento_MultiplicidadeOrigem();

		/**
		 * The meta object literal for the '<em><b>Multiplicidade Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACIONAMENTO__MULTIPLICIDADE_DESTINO = eINSTANCE.getRelacionamento_MultiplicidadeDestino();

		/**
		 * The meta object literal for the '{@link entidades.impl.ModeloEntidadeImpl <em>Modelo Entidade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entidades.impl.ModeloEntidadeImpl
		 * @see entidades.impl.UmlPackageImpl#getModeloEntidade()
		 * @generated
		 */
		EClass MODELO_ENTIDADE = eINSTANCE.getModeloEntidade();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_ENTIDADE__ENTIDADES = eINSTANCE.getModeloEntidade_Entidades();

		/**
		 * The meta object literal for the '<em><b>Relacionamentos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELO_ENTIDADE__RELACIONAMENTOS = eINSTANCE.getModeloEntidade_Relacionamentos();

	}

} //UmlPackage
